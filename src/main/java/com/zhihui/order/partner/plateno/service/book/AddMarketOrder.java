
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authentication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookRequest" type="{http://www.7daysinn.cn/booking}RequestBookingInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authentication",
    "bookRequest"
})
@XmlRootElement(name = "AddMarketOrder")
public class AddMarketOrder {

    @XmlElement(name = "Authentication")
    protected String authentication;
    @XmlElement(name = "BookRequest")
    protected RequestBookingInfo bookRequest;

    /**
     * 获取authentication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthentication() {
        return authentication;
    }

    /**
     * 设置authentication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthentication(String value) {
        this.authentication = value;
    }

    /**
     * 获取bookRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestBookingInfo }
     *     
     */
    public RequestBookingInfo getBookRequest() {
        return bookRequest;
    }

    /**
     * 设置bookRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestBookingInfo }
     *     
     */
    public void setBookRequest(RequestBookingInfo value) {
        this.bookRequest = value;
    }

}
