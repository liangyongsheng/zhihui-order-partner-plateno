package com.zhihui.order.partner.plateno.service.login;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.4
 * 2016-02-16T14:15:13.747+08:00
 * Generated source version: 2.7.4
 * 
 */
@WebServiceClient(name = "AboutMember", 
                  wsdlLocation = "http://121.33.201.180:6005/AboutMember.asmx?wsdl",
                  targetNamespace = "http://www.7daysinn.cn/booking") 
public class AboutMember extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.7daysinn.cn/booking", "AboutMember");
    public final static QName AboutMemberSoap = new QName("http://www.7daysinn.cn/booking", "AboutMemberSoap");
    public final static QName AboutMemberSoap12 = new QName("http://www.7daysinn.cn/booking", "AboutMemberSoap12");
    static {
        URL url = null;
        try {
            url = new URL("http://121.33.201.180:6005/AboutMember.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AboutMember.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://121.33.201.180:6005/AboutMember.asmx?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AboutMember(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AboutMember(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AboutMember() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AboutMember(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AboutMember(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AboutMember(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AboutMemberSoap
     */
    @WebEndpoint(name = "AboutMemberSoap")
    public AboutMemberSoap getAboutMemberSoap() {
        return super.getPort(AboutMemberSoap, AboutMemberSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AboutMemberSoap
     */
    @WebEndpoint(name = "AboutMemberSoap")
    public AboutMemberSoap getAboutMemberSoap(WebServiceFeature... features) {
        return super.getPort(AboutMemberSoap, AboutMemberSoap.class, features);
    }
    /**
     *
     * @return
     *     returns AboutMemberSoap
     */
    @WebEndpoint(name = "AboutMemberSoap12")
    public AboutMemberSoap getAboutMemberSoap12() {
        return super.getPort(AboutMemberSoap12, AboutMemberSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AboutMemberSoap
     */
    @WebEndpoint(name = "AboutMemberSoap12")
    public AboutMemberSoap getAboutMemberSoap12(WebServiceFeature... features) {
        return super.getPort(AboutMemberSoap12, AboutMemberSoap.class, features);
    }

}
