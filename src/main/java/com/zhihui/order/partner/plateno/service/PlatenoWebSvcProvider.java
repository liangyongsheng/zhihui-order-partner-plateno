package com.zhihui.order.partner.plateno.service;

import java.net.URL;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.zhihui.core.context.MyContext;
import com.zhihui.core.exception.PartnerServiceException;
import com.zhihui.order.partner.plateno.service.book.Booking;
import com.zhihui.order.partner.plateno.service.book.BookingSoap;
import com.zhihui.order.partner.plateno.service.chain.BookingHelp;
import com.zhihui.order.partner.plateno.service.chain.BookingHelpSoap;
import com.zhihui.order.partner.plateno.service.login.AboutMember;
import com.zhihui.order.partner.plateno.service.login.AboutMemberSoap;

@Service
public class PlatenoWebSvcProvider {
	private BookingSoap bookingSoap;
	private BookingHelpSoap bookingHelpSoap;
	private AboutMemberSoap aboutMemberSoap;

	public void RemoveAttributes() {
		try {
			this.bookingSoap = null;
			this.bookingHelpSoap = null;
			this.aboutMemberSoap = null;
			MyContext.getServletContext().removeAttribute("BookingSoap");
			MyContext.getServletContext().removeAttribute("BookingHelpSoap");
			MyContext.getServletContext().removeAttribute("AboutMemberSoap");
		} catch (Exception e) {
		}
	}

	// ----==========
	public BookingSoap getBookingSoap12() throws PartnerServiceException {
		BookingSoap rs = this.bookingSoap;

		try {
			if (rs != null)
				return rs;

			// get from servletContext
			rs = (BookingSoap) MyContext.getServletContext().getAttribute("BookingSoap");
			if (rs == null) {
				@SuppressWarnings("unchecked")
				HashMap<String, String> hm = (HashMap<String, String>) MyContext.getClassPathXmlApplicationContext("partner.plateno.service.cfg.xml").getBean("partner.plateno.service.book");

				Booking booking = new Booking(new URL(hm.get("wsdl")));
				rs = booking.getBookingSoap12();
				MyContext.getServletContext().setAttribute("BookingSoap", rs);
				this.bookingSoap = rs;
			}
		} catch (Exception e) {
			this.RemoveAttributes();
			throw new PartnerServiceException("PlatenoWebSvcProvider", e);
		}
		return rs;
	}

	// ---==========
	public BookingHelpSoap getBookingHelpSoap12() throws PartnerServiceException {
		BookingHelpSoap rs = this.bookingHelpSoap;
		try {
			if (rs != null)
				return rs;

			// get from servletContext
			rs = (BookingHelpSoap) MyContext.getServletContext().getAttribute("BookingHelpSoap");
			if (rs == null) {
				@SuppressWarnings("unchecked")
				HashMap<String, String> hm = (HashMap<String, String>) MyContext.getClassPathXmlApplicationContext("partner.plateno.service.cfg.xml").getBean("partner.plateno.service.chain");

				BookingHelp bookingHelp = new BookingHelp(new URL(hm.get("wsdl")));
				rs = bookingHelp.getBookingHelpSoap12();
				MyContext.getServletContext().setAttribute("BookingHelpSoap", rs);
				this.bookingHelpSoap = rs;
			}
		} catch (Exception e) {
			this.RemoveAttributes();
			throw new PartnerServiceException("PlatenoWebSvcProvider", e);
		}
		return rs;
	}

	// ---==========
	public AboutMemberSoap getAboutMemberSoap12() throws PartnerServiceException {
		AboutMemberSoap rs = this.aboutMemberSoap;
		try {
			if (rs != null)
				return rs;

			// get from servletContext
			rs = (AboutMemberSoap) MyContext.getServletContext().getAttribute("AboutMemberSoap");
			if (rs == null) {
				@SuppressWarnings("unchecked")
				HashMap<String, String> hm = (HashMap<String, String>) MyContext.getClassPathXmlApplicationContext("partner.plateno.service.cfg.xml").getBean("partner.plateno.service.login");

				AboutMember aboutMember = new AboutMember(new URL(hm.get("wsdl")));
				rs = aboutMember.getAboutMemberSoap12();
				MyContext.getServletContext().setAttribute("AboutMemberSoap", rs);
				this.aboutMemberSoap = rs;
			}
		} catch (Exception e) {
			this.RemoveAttributes();
			throw new PartnerServiceException("PlatenoWebSvcProvider", e);
		}
		return rs;
	}

}
