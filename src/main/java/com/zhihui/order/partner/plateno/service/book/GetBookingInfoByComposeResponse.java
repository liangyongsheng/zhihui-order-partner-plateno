
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
 *         &lt;element name="GetBookingInfoByComposeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arrBookingInfo" type="{http://www.7daysinn.cn/booking}ArrayOfCTBookingInfo" minOccurs="0"/>
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
    "getBookingInfoByComposeResult",
    "arrBookingInfo"
})
@XmlRootElement(name = "GetBookingInfoByComposeResponse")
public class GetBookingInfoByComposeResponse {

    @XmlElement(name = "GetBookingInfoByComposeResult")
    protected int getBookingInfoByComposeResult;
    protected ArrayOfCTBookingInfo arrBookingInfo;

    /**
     * 获取getBookingInfoByComposeResult属性的值。
     * 
     */
    public int getGetBookingInfoByComposeResult() {
        return getBookingInfoByComposeResult;
    }

    /**
     * 设置getBookingInfoByComposeResult属性的值。
     * 
     */
    public void setGetBookingInfoByComposeResult(int value) {
        this.getBookingInfoByComposeResult = value;
    }

    /**
     * 获取arrBookingInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCTBookingInfo }
     *     
     */
    public ArrayOfCTBookingInfo getArrBookingInfo() {
        return arrBookingInfo;
    }

    /**
     * 设置arrBookingInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCTBookingInfo }
     *     
     */
    public void setArrBookingInfo(ArrayOfCTBookingInfo value) {
        this.arrBookingInfo = value;
    }

}
