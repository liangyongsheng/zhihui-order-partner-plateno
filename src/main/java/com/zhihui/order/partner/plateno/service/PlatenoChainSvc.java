package com.zhihui.order.partner.plateno.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Holder;

import org.springframework.stereotype.Service;

import com.zhihui.core.exception.PartnerServiceException;
import com.zhihui.order.partner.plateno.service.chain.ArrayOfCTHotelInfo;
import com.zhihui.order.partner.plateno.service.chain.ArrayOfString;
import com.zhihui.order.partner.plateno.service.chain.CTHotelInfo;

@Service
public class PlatenoChainSvc {
	private String authen;
	private PlatenoWebSvcProvider platenoWebSvcProvider = new PlatenoWebSvcProvider();

	private String getAuthen() throws PartnerServiceException {
		// if (this.authen != null && !this.authen.equals(""))
		// return this.authen;
		PlatenoLoginSvc svc = new PlatenoLoginSvc();
		this.authen = svc.getAuthen();
		return this.authen;
	}

	public List<String> getCityNames() throws PartnerServiceException {
		try {
			List<String> rs = new ArrayList<String>();
			Holder<Integer> getCityArrayResult = new Holder<Integer>();
			Holder<ArrayOfString> theCityArray = new Holder<ArrayOfString>();

			this.platenoWebSvcProvider.getBookingHelpSoap12().getCityArray(this.getAuthen(), theCityArray, getCityArrayResult);
			if (getCityArrayResult.value != 0)
				throw new PartnerServiceException("错误码为：" + getCityArrayResult.value + "。");
			rs = theCityArray.value == null || theCityArray.value.getString() == null ? rs : theCityArray.value.getString();
			return rs;
		} catch (Throwable e) {
			throw new PartnerServiceException("PlatenoChainSvc", e);
		}
	}

	public List<CTHotelInfo> getHotelInfos(String cityName) throws PartnerServiceException {
		try {
			List<CTHotelInfo> rs = new ArrayList<CTHotelInfo>();
			Holder<Integer> getHotelInfoByCityResult = new Holder<Integer>();
			Holder<ArrayOfCTHotelInfo> lstHotelInfo = new Holder<ArrayOfCTHotelInfo>();

			this.platenoWebSvcProvider.getBookingHelpSoap12().getHotelInfoByCity(this.getAuthen(), cityName, getHotelInfoByCityResult, lstHotelInfo);
			if (getHotelInfoByCityResult.value != 0)
				throw new PartnerServiceException("错误码为：" + getHotelInfoByCityResult.value + "。");
			rs = lstHotelInfo.value == null || lstHotelInfo.value.getCTHotelInfo() == null ? rs : lstHotelInfo.value.getCTHotelInfo();
			return rs;
		} catch (Throwable e) {
			throw new PartnerServiceException("PlatenoChainSvc", e);
		}
	}

}
