
package com.zhihui.order.partner.plateno.service.book;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RequestBookingInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RequestBookingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomRates" type="{http://www.7daysinn.cn/booking}ArrayOfRoomRatePerDay" minOccurs="0"/>
 *         &lt;element name="RoomCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DayLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Contactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BKMebCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketActID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Guests" type="{http://www.7daysinn.cn/booking}ArrayOfGuestInfo" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestBookingInfo", propOrder = {
    "hotelID",
    "roomType",
    "roomRates",
    "roomCount",
    "startDate",
    "dayLength",
    "contactor",
    "bkMebCardNo",
    "mobile",
    "marketActID",
    "amount",
    "guests",
    "remark"
})
public class RequestBookingInfo {

    @XmlElement(name = "HotelID")
    protected int hotelID;
    @XmlElement(name = "RoomType")
    protected String roomType;
    @XmlElement(name = "RoomRates")
    protected ArrayOfRoomRatePerDay roomRates;
    @XmlElement(name = "RoomCount")
    protected int roomCount;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "DayLength")
    protected int dayLength;
    @XmlElement(name = "Contactor")
    protected String contactor;
    @XmlElement(name = "BKMebCardNo")
    protected String bkMebCardNo;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "MarketActID")
    protected int marketActID;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Guests")
    protected ArrayOfGuestInfo guests;
    @XmlElement(name = "Remark")
    protected String remark;

    /**
     * ��ȡhotelID���Ե�ֵ��
     * 
     */
    public int getHotelID() {
        return hotelID;
    }

    /**
     * ����hotelID���Ե�ֵ��
     * 
     */
    public void setHotelID(int value) {
        this.hotelID = value;
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
     * ��ȡroomRates���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomRatePerDay }
     *     
     */
    public ArrayOfRoomRatePerDay getRoomRates() {
        return roomRates;
    }

    /**
     * ����roomRates���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomRatePerDay }
     *     
     */
    public void setRoomRates(ArrayOfRoomRatePerDay value) {
        this.roomRates = value;
    }

    /**
     * ��ȡroomCount���Ե�ֵ��
     * 
     */
    public int getRoomCount() {
        return roomCount;
    }

    /**
     * ����roomCount���Ե�ֵ��
     * 
     */
    public void setRoomCount(int value) {
        this.roomCount = value;
    }

    /**
     * ��ȡstartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * ����startDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * ��ȡdayLength���Ե�ֵ��
     * 
     */
    public int getDayLength() {
        return dayLength;
    }

    /**
     * ����dayLength���Ե�ֵ��
     * 
     */
    public void setDayLength(int value) {
        this.dayLength = value;
    }

    /**
     * ��ȡcontactor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactor() {
        return contactor;
    }

    /**
     * ����contactor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactor(String value) {
        this.contactor = value;
    }

    /**
     * ��ȡbkMebCardNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBKMebCardNo() {
        return bkMebCardNo;
    }

    /**
     * ����bkMebCardNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBKMebCardNo(String value) {
        this.bkMebCardNo = value;
    }

    /**
     * ��ȡmobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * ����mobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * ��ȡmarketActID���Ե�ֵ��
     * 
     */
    public int getMarketActID() {
        return marketActID;
    }

    /**
     * ����marketActID���Ե�ֵ��
     * 
     */
    public void setMarketActID(int value) {
        this.marketActID = value;
    }

    /**
     * ��ȡamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * ����amount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * ��ȡguests���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuestInfo }
     *     
     */
    public ArrayOfGuestInfo getGuests() {
        return guests;
    }

    /**
     * ����guests���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuestInfo }
     *     
     */
    public void setGuests(ArrayOfGuestInfo value) {
        this.guests = value;
    }

    /**
     * ��ȡremark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ����remark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
