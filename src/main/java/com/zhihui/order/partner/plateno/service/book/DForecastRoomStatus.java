
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DForecastRoomStatus complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡhotelName���Ե�ֵ��
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
     * ����hotelName���Ե�ֵ��
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
     * ��ȡhotelId���Ե�ֵ��
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * ����hotelId���Ե�ֵ��
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * ��ȡroomType���Ե�ֵ��
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
     * ����roomType���Ե�ֵ��
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
     * ��ȡroomTypeName���Ե�ֵ��
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
     * ����roomTypeName���Ե�ֵ��
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
     * ��ȡisCanBooking���Ե�ֵ��
     * 
     */
    public boolean isIsCanBooking() {
        return isCanBooking;
    }

    /**
     * ����isCanBooking���Ե�ֵ��
     * 
     */
    public void setIsCanBooking(boolean value) {
        this.isCanBooking = value;
    }

    /**
     * ��ȡrateItems���Ե�ֵ��
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
     * ����rateItems���Ե�ֵ��
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
