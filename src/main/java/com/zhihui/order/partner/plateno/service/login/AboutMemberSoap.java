package com.zhihui.order.partner.plateno.service.login;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2016-02-16T14:15:13.736+08:00
 * Generated source version: 2.7.4
 * 
 */
@WebService(targetNamespace = "http://www.7daysinn.cn/booking", name = "AboutMemberSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface AboutMemberSoap {

    /**
     * 通过提交用户名和密码交换系统序列号
     */
    @WebResult(name = "MemberLoginResult", targetNamespace = "http://www.7daysinn.cn/booking")
    @RequestWrapper(localName = "MemberLogin", targetNamespace = "http://www.7daysinn.cn/booking", className = "com.zhihui.order.partner.plateno.service.login.MemberLogin")
    @WebMethod(operationName = "MemberLogin", action = "http://www.7daysinn.cn/booking/MemberLogin")
    @ResponseWrapper(localName = "MemberLoginResponse", targetNamespace = "http://www.7daysinn.cn/booking", className = "com.zhihui.order.partner.plateno.service.login.MemberLoginResponse")
    public java.lang.String memberLogin(
        @WebParam(name = "nType", targetNamespace = "http://www.7daysinn.cn/booking")
        com.zhihui.order.partner.plateno.service.login.CTUserType nType,
        @WebParam(name = "sValues", targetNamespace = "http://www.7daysinn.cn/booking")
        java.lang.String sValues,
        @WebParam(name = "sPassword", targetNamespace = "http://www.7daysinn.cn/booking")
        java.lang.String sPassword
    );
}