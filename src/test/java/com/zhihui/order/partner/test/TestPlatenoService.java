package com.zhihui.order.partner.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.zhihui.order.model.ChainModel;
import com.zhihui.order.model.OrderGuestModel;
import com.zhihui.order.model.OrderModel;
import com.zhihui.order.model.OrderPriceModel;
import com.zhihui.order.model.RoomTypeModel;
import com.zhihui.order.partner.PlatenoService;
import com.zhihui.order.partner.plateno.service.PlatenoBookSvc;
import com.zhihui.order.partner.plateno.service.book.DForecastRoomStatus;

public class TestPlatenoService {
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private PlatenoService platenoSvc = new PlatenoService();

	// @Test
	public void doAdd() {
		try {
			ChainModel chainModel = new ChainModel();
			chainModel.setOuterChainSn("128");
			RoomTypeModel roomTypeModel = new RoomTypeModel();
			roomTypeModel.setOuterRoomTypeSn("ZSD");

			OrderModel orderModel = new OrderModel();
			orderModel.setArrEndOfDay(new java.sql.Date(sdf.parse(sdf.format(new Date())).getTime() + 1 * 24 * 60 * 60 * 1000));
			orderModel.setDepEndOfDay(new java.sql.Date(sdf.parse(sdf.format(new Date())).getTime() + 2 * 24 * 60 * 60 * 1000));
			orderModel.setNum(2);
			orderModel.setMessage("TTVVV没V");

			List<OrderGuestModel> orderGuestModels = new ArrayList<OrderGuestModel>();
			OrderGuestModel orderGuestModel = new OrderGuestModel();
			orderGuestModel.setContactName("我日");
			orderGuestModel.setContactMobile("18676457389");
			orderGuestModels.add(orderGuestModel);
			orderGuestModel = new OrderGuestModel();
			orderGuestModel.setContactName("我日2");
			orderGuestModel.setContactMobile("18666457389");
			orderGuestModels.add(orderGuestModel);

			List<OrderPriceModel> orderPriceModels = new ArrayList<OrderPriceModel>();
			OrderPriceModel orderPriceModel = new OrderPriceModel();
			orderPriceModel.setPrice(110d);
			orderPriceModel.setEndOfday(new java.sql.Date(sdf.parse(sdf.format(new Date())).getTime() + 1 * 24 * 60 * 60 * 1000));
			orderPriceModels.add(orderPriceModel);
			// orderPriceModel = new OrderPriceModel();
			// orderPriceModel.setEndOfday(new java.sql.Date(sdf.parse(sdf.format(new Date())).getTime() + 2 * 24 * 60 * 60 * 1000));
			// orderPriceModel.setPrice(111d);
			// orderPriceModels.add(orderPriceModel);

			String rs = platenoSvc.addBook(chainModel, roomTypeModel, orderModel, orderGuestModels, orderPriceModels);
			System.out.println(rs);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void doCancel() {
		// --01280002050471
		// --01280002050472
		// --01280002050473
		// --["01280002050474","01280002050475"]
		try {
			OrderModel orderModel = new OrderModel();
			orderModel.setOuterOrderSn("01280002050470");
			this.platenoSvc.cancelBook(orderModel);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
