package com.zhihui.order.partner;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;

import org.springframework.stereotype.Service;

import com.zhihui.core.context.MyContext;
import com.zhihui.core.exception.PartnerServiceException;
import com.zhihui.core.util.MyObj2StrUtils;
import com.zhihui.core.util.MyStringUtils;
import com.zhihui.order.model.ChainModel;
import com.zhihui.order.model.OrderGuestModel;
import com.zhihui.order.model.OrderModel;
import com.zhihui.order.model.OrderPriceModel;
import com.zhihui.order.model.RoomTypeModel;
import com.zhihui.order.partner.plateno.service.PlatenoBookSvc;
import com.zhihui.order.partner.plateno.service.PlatenoLoginSvc;
import com.zhihui.order.partner.plateno.service.book.ArrayOfArrayOfDRequestBookingGuest;
import com.zhihui.order.partner.plateno.service.book.ArrayOfDRequestBookingGuest;
import com.zhihui.order.partner.plateno.service.book.ArrayOfDecimal;
import com.zhihui.order.partner.plateno.service.book.CRequestBookingInfo;
import com.zhihui.order.partner.plateno.service.book.CTBookingInfo;
import com.zhihui.order.partner.plateno.service.book.DRequestBookingGuest;
import com.zhihui.order.partner.plateno.service.book.RequestReservationInfo;

@Service
public class PlatenoService extends PartnerService {
	private PlatenoBookSvc platenoBookSvc = new PlatenoBookSvc();

	/**
	 * 取得描述
	 */
	@Override
	public String getDesc() {
		return "铂涛集团";
	}

	/**
	 * 添加订单
	 */
	@Override
	public String addBook(ChainModel chainModel, RoomTypeModel roomTypeModel, OrderModel orderModel, List<OrderGuestModel> orderGuestModels, List<OrderPriceModel> orderPriceModels) throws PartnerServiceException {
		this.throwable = null;
		String rs = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		RequestReservationInfo bookingRequest = new RequestReservationInfo();

		try {
			@SuppressWarnings("unchecked")
			HashMap<String, String> hm = (HashMap<String, String>) MyContext.getClassPathXmlApplicationContext("partner.plateno.service.cfg.xml").getBean("partner.plateno.service.book");
			DatatypeFactory df = DatatypeFactory.newInstance();
			Date beginDate = orderModel.getArrEndOfDay();
			Date endDate = orderModel.getDepEndOfDay();
			int dayLength = (int) (endDate.getTime() / (24 * 60 * 60 * 1000) - beginDate.getTime() / (24 * 60 * 60 * 1000));
			dayLength = dayLength <= 0 ? 1 : dayLength;
			GregorianCalendar beginCalender = new GregorianCalendar();
			GregorianCalendar endCalender = new GregorianCalendar();
			beginCalender.setTimeInMillis(sdf.parse(sdf.format(beginDate)).getTime() + beginCalender.getTimeZone().getRawOffset());
			endCalender.setTimeInMillis(sdf.parse(sdf.format(endDate)).getTime() + endCalender.getTimeZone().getRawOffset());
			// 客人
			ArrayOfDRequestBookingGuest requestBookingGuests = new ArrayOfDRequestBookingGuest();
			for (int i = 0; i < orderGuestModels.size(); i++) {
				DRequestBookingGuest e = new DRequestBookingGuest();
				e.setMobile(orderGuestModels.get(0).getContactMobile());
				e.setName(orderGuestModels.get(0).getContactName());
				requestBookingGuests.getDRequestBookingGuest().add(e);
			}
			ArrayOfArrayOfDRequestBookingGuest eachOrderGuests = new ArrayOfArrayOfDRequestBookingGuest();
			for (int i = 0; i < orderModel.getNum(); i++)
				eachOrderGuests.getArrayOfDRequestBookingGuest().add(requestBookingGuests);

			// 价格
			ArrayOfDecimal roomPrices = new ArrayOfDecimal();
			// 担保金额
			double reserveAmount = 0;
			for (int i = 0; i < orderPriceModels.size(); i++) {
				roomPrices.getDecimal().add(new BigDecimal(orderPriceModels.get(i).getPrice()));
				reserveAmount += orderPriceModels.get(i).getPrice() * orderModel.getNum();
			}

			bookingRequest.setAmout(new BigDecimal(reserveAmount)); // 担保金额
			bookingRequest.setRoomCount(orderModel.getNum());
			bookingRequest.setDayLength(dayLength);
			bookingRequest.setContactor(orderGuestModels.get(0).getContactName());
			bookingRequest.setHotelId(Integer.parseInt(chainModel.getOuterChainSn()));
			bookingRequest.setOrganId(Integer.parseInt(hm.get("organizationId")));
			bookingRequest.setRoomType(roomTypeModel.getOuterRoomTypeSn());
			bookingRequest.setStartTime(df.newXMLGregorianCalendar(beginCalender));
			bookingRequest.setMobile(orderGuestModels.get(0).getContactMobile());
			bookingRequest.setRemark(orderModel.getMessage());
			bookingRequest.setBKMebCardNo(hm.get("cardNo"));
			bookingRequest.setRoomRates(roomPrices);
			bookingRequest.setEachOrderGuests(eachOrderGuests);
			// bookingRequest.setAuthorNumber(null);

			rs = this.platenoBookSvc.addBook(bookingRequest);
			if (rs == null)
				throw new PartnerServiceException("result is null");
		} catch (Throwable e) {
			this.throwable = e;
			if (e instanceof PartnerServiceException)
				throw (PartnerServiceException) e;
			throw new PartnerServiceException(e);
		}
		return rs;
	}

	/**
	 * 取消订单
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void cancelBook(OrderModel orderModel) throws PartnerServiceException {
		this.throwable = null;

		try {
			if (!MyStringUtils.isEmpty(orderModel.getOuterOrderSn())) {
				List<String> orderNos = new ArrayList<String>();
				orderNos = MyObj2StrUtils.fromJson(orderModel.getOuterOrderSn(), orderNos.getClass());
				if (orderNos != null) {
					for (String e : orderNos)
						this.platenoBookSvc.cancelBook(e);
				}
			}
		} catch (Throwable e) {
			this.throwable = e;
			if (e instanceof PartnerServiceException)
				throw (PartnerServiceException) e;
			throw new PartnerServiceException(e);
		}
	}
}
