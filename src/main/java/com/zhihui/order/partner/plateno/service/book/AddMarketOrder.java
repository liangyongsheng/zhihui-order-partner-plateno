
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡauthentication���Ե�ֵ��
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
     * ����authentication���Ե�ֵ��
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
     * ��ȡbookRequest���Ե�ֵ��
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
     * ����bookRequest���Ե�ֵ��
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
