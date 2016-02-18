
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DForecastRoomStatus complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DForecastRoomStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCanBooking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RateItems" type="{http://www.7daysinn.cn/booking}ArrayOfDForecastRoomStatusItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DForecastRoomStatus", propOrder = {
    "hotelName",
    "hotelId",
    "roomType",
    "roomTypeName",
    "isCanBooking",
    "rateItems"
})
public class DForecastRoomStatus {

    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "RoomType")
    protected String roomType;
    @XmlElement(name = "RoomTypeName")
    protected String roomTypeName;
    @XmlElement(name = "IsCanBooking")
    protected boolean isCanBooking;
    @XmlElement(name = "RateItems")
    protected ArrayOfDForecastRoomStatusItem rateItems;

    /**
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * 获取hotelId属性的值。
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * 设置hotelId属性的值。
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * 获取roomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * 设置roomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * 获取roomTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeName() {
        return roomTypeName;
    }

    /**
     * 设置roomTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeName(String value) {
        this.roomTypeName = value;
    }

    /**
     * 获取isCanBooking属性的值。
     * 
     */
    public boolean isIsCanBooking() {
        return isCanBooking;
    }

    /**
     * 设置isCanBooking属性的值。
     * 
     */
    public void setIsCanBooking(boolean value) {
        this.isCanBooking = value;
    }

    /**
     * 获取rateItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDForecastRoomStatusItem }
     *     
     */
    public ArrayOfDForecastRoomStatusItem getRateItems() {
        return rateItems;
    }

    /**
     * 设置rateItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDForecastRoomStatusItem }
     *     
     */
    public void setRateItems(ArrayOfDForecastRoomStatusItem value) {
        this.rateItems = value;
    }

}
