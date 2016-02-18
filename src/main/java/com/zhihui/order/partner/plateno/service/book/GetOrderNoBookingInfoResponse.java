
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
 *         &lt;element name="GetOrderNoBookingInfoResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="theBookingInfo" type="{http://www.7daysinn.cn/booking}CTBookingInfo" minOccurs="0"/>
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
    "getOrderNoBookingInfoResult",
    "theBookingInfo"
})
@XmlRootElement(name = "GetOrderNoBookingInfoResponse")
public class GetOrderNoBookingInfoResponse {

    @XmlElement(name = "GetOrderNoBookingInfoResult")
    protected int getOrderNoBookingInfoResult;
    protected CTBookingInfo theBookingInfo;

    /**
     * 获取getOrderNoBookingInfoResult属性的值。
     * 
     */
    public int getGetOrderNoBookingInfoResult() {
        return getOrderNoBookingInfoResult;
    }

    /**
     * 设置getOrderNoBookingInfoResult属性的值。
     * 
     */
    public void setGetOrderNoBookingInfoResult(int value) {
        this.getOrderNoBookingInfoResult = value;
    }

    /**
     * 获取theBookingInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CTBookingInfo }
     *     
     */
    public CTBookingInfo getTheBookingInfo() {
        return theBookingInfo;
    }

    /**
     * 设置theBookingInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CTBookingInfo }
     *     
     */
    public void setTheBookingInfo(CTBookingInfo value) {
        this.theBookingInfo = value;
    }

}
