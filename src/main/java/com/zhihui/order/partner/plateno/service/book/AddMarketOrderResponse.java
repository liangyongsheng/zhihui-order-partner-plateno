
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
 *         &lt;element name="AddMarketOrderResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookResponse" type="{http://www.7daysinn.cn/booking}ArrayOfResponseBookingInfo" minOccurs="0"/>
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
    "addMarketOrderResult",
    "bookResponse"
})
@XmlRootElement(name = "AddMarketOrderResponse")
public class AddMarketOrderResponse {

    @XmlElement(name = "AddMarketOrderResult")
    protected int addMarketOrderResult;
    @XmlElement(name = "BookResponse")
    protected ArrayOfResponseBookingInfo bookResponse;

    /**
     * 获取addMarketOrderResult属性的值。
     * 
     */
    public int getAddMarketOrderResult() {
        return addMarketOrderResult;
    }

    /**
     * 设置addMarketOrderResult属性的值。
     * 
     */
    public void setAddMarketOrderResult(int value) {
        this.addMarketOrderResult = value;
    }

    /**
     * 获取bookResponse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResponseBookingInfo }
     *     
     */
    public ArrayOfResponseBookingInfo getBookResponse() {
        return bookResponse;
    }

    /**
     * 设置bookResponse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponseBookingInfo }
     *     
     */
    public void setBookResponse(ArrayOfResponseBookingInfo value) {
        this.bookResponse = value;
    }

}
