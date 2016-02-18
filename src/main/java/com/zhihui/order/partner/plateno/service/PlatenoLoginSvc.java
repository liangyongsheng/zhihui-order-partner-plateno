package com.zhihui.order.partner.plateno.service;

import java.net.URL;
import java.util.HashMap;

import javax.xml.ws.WebServiceFeature;

import org.springframework.stereotype.Service;

import com.zhihui.core.context.MyContext;
import com.zhihui.core.exception.PartnerServiceException;
import com.zhihui.order.partner.plateno.service.login.AboutMember;
import com.zhihui.order.partner.plateno.service.login.CTUserType;

@Service
public class PlatenoLoginSvc {
	private PlatenoWebSvcProvider platenoWebSvcProvider = new PlatenoWebSvcProvider();

	public String getAuthen() throws PartnerServiceException {
		String rs = null;
		try {
			@SuppressWarnings("unchecked")
			HashMap<String, String> hm = (HashMap<String, String>) MyContext.getClassPathXmlApplicationContext("partner.plateno.service.cfg.xml").getBean("partner.plateno.service.login");
			rs = this.platenoWebSvcProvider.getAboutMemberSoap12().memberLogin(CTUserType.USER_CARD, hm.get("user"), hm.get("pwd"));
			return rs;
		} catch (Throwable e) {
			throw new PartnerServiceException("PlatenoLoginSvc", e);
		}
	}
}
