package com.zhihui.order.partner.plateno.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.hamcrest.core.IsInstanceOf;
import org.springframework.stereotype.Service;

import com.zhihui.core.exception.PartnerServiceException;
import com.zhihui.core.util.MyObj2StrUtils;
import com.zhihui.order.partner.plateno.service.book.ArrayOfDConfigPackage;
import com.zhihui.order.partner.plateno.service.book.ArrayOfDForecastRoomStatus;
import com.zhihui.order.partner.plateno.service.book.ArrayOfDResponseBookingResult;
import com.zhihui.order.partner.plateno.service.book.CRequestBookingInfo;
import com.zhihui.order.partner.plateno.service.book.CTBookingInfo;
import com.zhihui.order.partner.plateno.service.book.DConfigPackage;
import com.zhihui.order.partner.plateno.service.book.DForecastRoomStatus;
import com.zhihui.order.partner.plateno.service.book.DResponseBookingResult;
import com.zhihui.order.partner.plateno.service.book.RequestReservationInfo;

@Service
public class PlatenoBookSvc {
	private String authen;
	private PlatenoWebSvcProvider platenoWebSvcProvider = new PlatenoWebSvcProvider();

	/**
	 * 认证串
	 * 
	 * @return
	 * @throws PartnerServiceException
	 */
	private String getAuthen() throws PartnerServiceException {
		// if (this.authen != null && !this.authen.equals(""))
		// return this.authen;
		PlatenoLoginSvc svc = new PlatenoLoginSvc();
		this.authen = svc.getAuthen();
		return this.authen;
	}

	/**
	 * 取房态
	 * 
	 * @param outerChainSn
	 * @param beginDate
	 * @param endDate
	 * @param outerRoomTypeName
	 * @return
	 * @throws PartnerServiceException
	 */
	public List<DForecastRoomStatus> getRoomRate(String outerChainSn, Date beginDate, Date endDate, String outerRoomTypeName) throws PartnerServiceException {
		List<DForecastRoomStatus> rs = new ArrayList<DForecastRoomStatus>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			DatatypeFactory df = DatatypeFactory.newInstance();
			int chainId = Integer.parseInt(outerChainSn);
			GregorianCalendar bDate = new GregorianCalendar();
			GregorianCalendar eDate = new GregorianCalendar();
			bDate.setTimeInMillis(sdf.parse(sdf.format(beginDate)).getTime() + bDate.getTimeZone().getRawOffset());
			eDate.setTimeInMillis(sdf.parse(sdf.format(endDate)).getTime() + eDate.getTimeZone().getRawOffset());
			Holder<Integer> getForecastRoomStatusResult = new Holder<Integer>();
			Holder<ArrayOfDForecastRoomStatus> lstForecastRoomStatus = new Holder<ArrayOfDForecastRoomStatus>();

			this.platenoWebSvcProvider.getBookingSoap12().getForecastRoomStatus(this.getAuthen(), chainId, df.newXMLGregorianCalendar(bDate), df.newXMLGregorianCalendar(eDate), outerRoomTypeName, getForecastRoomStatusResult, lstForecastRoomStatus);
			if (getForecastRoomStatusResult.value != 0)
				throw new PartnerServiceException("错误码为：" + getForecastRoomStatusResult.value + "。");
			rs = lstForecastRoomStatus.value == null || lstForecastRoomStatus.value.getDForecastRoomStatus() == null ? rs : lstForecastRoomStatus.value.getDForecastRoomStatus();
			return rs;
		} catch (Throwable e) {
			throw new PartnerServiceException("PlatenoBookSvc", e);
		}
	}

	/**
	 * 下单
	 * 
	 * @param bookingRequest
	 * @return
	 * @throws PartnerServiceException
	 */
	public String addBook(RequestReservationInfo bookingRequest) throws PartnerServiceException {
		String rs = null;
		try {
			List<String> orderNos = new ArrayList<String>();
			ArrayOfDConfigPackage arrPackage = new ArrayOfDConfigPackage();
			Holder<Integer> postReservationInfoWithPackageResult = new Holder<Integer>();
			Holder<ArrayOfDResponseBookingResult> bookResponse = new Holder<ArrayOfDResponseBookingResult>();

			this.platenoWebSvcProvider.getBookingSoap12().postReservationInfoWithPackage(this.getAuthen(), bookingRequest, arrPackage, null, postReservationInfoWithPackageResult, bookResponse);
			if (postReservationInfoWithPackageResult.value != 0)
				throw new PartnerServiceException("错误码为：" + postReservationInfoWithPackageResult.value + "。");
			for (DResponseBookingResult e : bookResponse.value.getDResponseBookingResult())
				orderNos.add(e.getOrderNO());

			rs = MyObj2StrUtils.toJson(orderNos, 0);
			return rs;
		} catch (Throwable e) {
			throw new PartnerServiceException("PlatenoBookSvc", e);
		}
	}

	/**
	 * 取消
	 * 
	 * @param outerOrderSn
	 * @throws PartnerServiceException
	 */
	public void cancelBook(String outerOrderSn) throws PartnerServiceException {
		try {
			int rs = this.platenoWebSvcProvider.getBookingSoap12().cancelBooking(outerOrderSn, this.getAuthen());
			if (rs != 0)
				throw new PartnerServiceException("取消出错。");
		} catch (Throwable e) {
			if (e instanceof PartnerServiceException)
				throw (PartnerServiceException) e;
			throw new PartnerServiceException("PlatenoBookSvc", e);
		}
	}

	/**
	 * 查询
	 * 
	 * @param outerOuterNo
	 * @return
	 * @throws PartnerServiceException
	 */
	public CTBookingInfo getBook(String outerOuterNo) throws PartnerServiceException {
		try {
			Holder<CTBookingInfo> theBookingInfo = new Holder<CTBookingInfo>();
			Holder<Integer> getOrderNoBookingInfoResult = new Holder<Integer>();
			this.platenoWebSvcProvider.getBookingSoap12().getOrderNoBookingInfo(this.getAuthen(), outerOuterNo, theBookingInfo, getOrderNoBookingInfoResult);

			if (getOrderNoBookingInfoResult.value != 0)
				throw new PartnerServiceException("错误码为：" + getOrderNoBookingInfoResult.value + "。");
			if (theBookingInfo.value == null)
				throw new PartnerServiceException("第三方系统不存在此订单。");
			return theBookingInfo.value;
		} catch (Throwable e) {
			if (e instanceof PartnerServiceException)
				throw (PartnerServiceException) e;
			throw new PartnerServiceException("PlatenoBookSvc", e);
		}
	}
}
