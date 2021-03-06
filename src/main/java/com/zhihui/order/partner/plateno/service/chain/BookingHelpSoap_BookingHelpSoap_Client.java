
package com.zhihui.order.partner.plateno.service.chain;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2016-02-16T14:43:30.857+08:00
 * Generated source version: 2.7.4
 * 
 */
public final class BookingHelpSoap_BookingHelpSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://www.7daysinn.cn/booking", "BookingHelp");

    private BookingHelpSoap_BookingHelpSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BookingHelp.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BookingHelp ss = new BookingHelp(wsdlURL, SERVICE_NAME);
        BookingHelpSoap port = ss.getBookingHelpSoap();  
        
        {
        System.out.println("Invoking getHotelInfoByCity...");
        java.lang.String _getHotelInfoByCity_authentication = "_getHotelInfoByCity_authentication-1161920622";
        java.lang.String _getHotelInfoByCity_sCity = "_getHotelInfoByCity_sCity1658444961";
        javax.xml.ws.Holder<java.lang.Integer> _getHotelInfoByCity_getHotelInfoByCityResult = new javax.xml.ws.Holder<java.lang.Integer>();
        javax.xml.ws.Holder<com.zhihui.order.partner.plateno.service.chain.ArrayOfCTHotelInfo> _getHotelInfoByCity_lstHotelInfo = new javax.xml.ws.Holder<com.zhihui.order.partner.plateno.service.chain.ArrayOfCTHotelInfo>();
        port.getHotelInfoByCity(_getHotelInfoByCity_authentication, _getHotelInfoByCity_sCity, _getHotelInfoByCity_getHotelInfoByCityResult, _getHotelInfoByCity_lstHotelInfo);

        System.out.println("getHotelInfoByCity._getHotelInfoByCity_getHotelInfoByCityResult=" + _getHotelInfoByCity_getHotelInfoByCityResult.value);
        System.out.println("getHotelInfoByCity._getHotelInfoByCity_lstHotelInfo=" + _getHotelInfoByCity_lstHotelInfo.value);

        }
        {
        System.out.println("Invoking getCityArray...");
        java.lang.String _getCityArray_authentication = "_getCityArray_authentication-27100579";
        com.zhihui.order.partner.plateno.service.chain.ArrayOfString _getCityArray_theCityArrayVal = new com.zhihui.order.partner.plateno.service.chain.ArrayOfString();
        java.util.List<java.lang.String> _getCityArray_theCityArrayValString = new java.util.ArrayList<java.lang.String>();
        java.lang.String _getCityArray_theCityArrayValStringVal1 = "_getCityArray_theCityArrayValStringVal117362309";
        _getCityArray_theCityArrayValString.add(_getCityArray_theCityArrayValStringVal1);
        _getCityArray_theCityArrayVal.getString().addAll(_getCityArray_theCityArrayValString);
        javax.xml.ws.Holder<com.zhihui.order.partner.plateno.service.chain.ArrayOfString> _getCityArray_theCityArray = new javax.xml.ws.Holder<com.zhihui.order.partner.plateno.service.chain.ArrayOfString>(_getCityArray_theCityArrayVal);
        javax.xml.ws.Holder<java.lang.Integer> _getCityArray_getCityArrayResult = new javax.xml.ws.Holder<java.lang.Integer>();
        port.getCityArray(_getCityArray_authentication, _getCityArray_theCityArray, _getCityArray_getCityArrayResult);

        System.out.println("getCityArray._getCityArray_theCityArray=" + _getCityArray_theCityArray.value);
        System.out.println("getCityArray._getCityArray_getCityArrayResult=" + _getCityArray_getCityArrayResult.value);

        }
        {
        System.out.println("Invoking getErrorExpression...");
        int _getErrorExpression_nError = -1655606051;
        java.lang.String _getErrorExpression_sErrMsgVal = "_getErrorExpression_sErrMsgVal746215430";
        javax.xml.ws.Holder<java.lang.String> _getErrorExpression_sErrMsg = new javax.xml.ws.Holder<java.lang.String>(_getErrorExpression_sErrMsgVal);
        javax.xml.ws.Holder<java.lang.Integer> _getErrorExpression_getErrorExpressionResult = new javax.xml.ws.Holder<java.lang.Integer>();
        port.getErrorExpression(_getErrorExpression_nError, _getErrorExpression_sErrMsg, _getErrorExpression_getErrorExpressionResult);

        System.out.println("getErrorExpression._getErrorExpression_sErrMsg=" + _getErrorExpression_sErrMsg.value);
        System.out.println("getErrorExpression._getErrorExpression_getErrorExpressionResult=" + _getErrorExpression_getErrorExpressionResult.value);

        }

        System.exit(0);
    }

}
