
package com.zhihui.order.partner.plateno.service.book;

import java.math.BigDecimal;
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
 *         &lt;element name="sAuth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookingRequest" type="{http://www.7daysinn.cn/booking}CRequestBookingInfo" minOccurs="0"/>
 *         &lt;element name="arrPackage" type="{http://www.7daysinn.cn/booking}ArrayOfDConfigPackage" minOccurs="0"/>
 *         &lt;element name="roomPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "sAuth",
    "bookingRequest",
    "arrPackage",
    "roomPrice"
})
@XmlRootElement(name = "PostBookInfoWithPackage")
public class PostBookInfoWithPackage {

    protected String sAuth;
    protected CRequestBookingInfo bookingRequest;
    protected ArrayOfDConfigPackage arrPackage;
    @XmlElement(required = true)
    protected BigDecimal roomPrice;

    /**
     * 获取sAuth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAuth() {
        return sAuth;
    }

    /**
     * 设置sAuth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAuth(String value) {
        this.sAuth = value;
    }

    /**
     * 获取bookingRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CRequestBookingInfo }
     *     
     */
    public CRequestBookingInfo getBookingRequest() {
        return bookingRequest;
    }

    /**
     * 设置bookingRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CRequestBookingInfo }
     *     
     */
    public void setBookingRequest(CRequestBookingInfo value) {
        this.bookingRequest = value;
    }

    /**
     * 获取arrPackage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDConfigPackage }
     *     
     */
    public ArrayOfDConfigPackage getArrPackage() {
        return arrPackage;
    }

    /**
     * 设置arrPackage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDConfigPackage }
     *     
     */
    public void setArrPackage(ArrayOfDConfigPackage value) {
        this.arrPackage = value;
    }

    /**
     * 获取roomPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoomPrice() {
        return roomPrice;
    }

    /**
     * 设置roomPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoomPrice(BigDecimal value) {
        this.roomPrice = value;
    }

}
