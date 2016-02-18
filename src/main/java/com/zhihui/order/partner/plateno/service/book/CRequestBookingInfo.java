
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CRequestBookingInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CRequestBookingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DayLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Contactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrganId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SponsionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomRates" type="{http://www.7daysinn.cn/booking}ArrayOfDecimal" minOccurs="0"/>
 *         &lt;element name="EachOrderGuests" type="{http://www.7daysinn.cn/booking}ArrayOfArrayOfDRequestBookingGuest" minOccurs="0"/>
 *         &lt;element name="BKMebCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRequestBookingInfo", propOrder = {
    "roomCount",
    "dayLength",
    "contactor",
    "hotelId",
    "organId",
    "roomType",
    "startTime",
    "sponsionType",
    "mobile",
    "remark",
    "roomRates",
    "eachOrderGuests",
    "bkMebCardNo",
    "authorNumber"
})
public class CRequestBookingInfo {

    @XmlElement(name = "RoomCount")
    protected int roomCount;
    @XmlElement(name = "DayLength")
    protected int dayLength;
    @XmlElement(name = "Contactor")
    protected String contactor;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "OrganId")
    protected int organId;
    @XmlElement(name = "RoomType")
    protected String roomType;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "SponsionType")
    protected int sponsionType;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "RoomRates")
    protected ArrayOfDecimal roomRates;
    @XmlElement(name = "EachOrderGuests")
    protected ArrayOfArrayOfDRequestBookingGuest eachOrderGuests;
    @XmlElement(name = "BKMebCardNo")
    protected String bkMebCardNo;
    @XmlElement(name = "AuthorNumber")
    protected String authorNumber;

    /**
     * 获取roomCount属性的值。
     * 
     */
    public int getRoomCount() {
        return roomCount;
    }

    /**
     * 设置roomCount属性的值。
     * 
     */
    public void setRoomCount(int value) {
        this.roomCount = value;
    }

    /**
     * 获取dayLength属性的值。
     * 
     */
    public int getDayLength() {
        return dayLength;
    }

    /**
     * 设置dayLength属性的值。
     * 
     */
    public void setDayLength(int value) {
        this.dayLength = value;
    }

    /**
     * 获取contactor属性的值。
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
     * 设置contactor属性的值。
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
     * 获取organId属性的值。
     * 
     */
    public int getOrganId() {
        return organId;
    }

    /**
     * 设置organId属性的值。
     * 
     */
    public void setOrganId(int value) {
        this.organId = value;
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
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * 获取sponsionType属性的值。
     * 
     */
    public int getSponsionType() {
        return sponsionType;
    }

    /**
     * 设置sponsionType属性的值。
     * 
     */
    public void setSponsionType(int value) {
        this.sponsionType = value;
    }

    /**
     * 获取mobile属性的值。
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
     * 设置mobile属性的值。
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
     * 获取remark属性的值。
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
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取roomRates属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public ArrayOfDecimal getRoomRates() {
        return roomRates;
    }

    /**
     * 设置roomRates属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimal }
     *     
     */
    public void setRoomRates(ArrayOfDecimal value) {
        this.roomRates = value;
    }

    /**
     * 获取eachOrderGuests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfDRequestBookingGuest }
     *     
     */
    public ArrayOfArrayOfDRequestBookingGuest getEachOrderGuests() {
        return eachOrderGuests;
    }

    /**
     * 设置eachOrderGuests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfDRequestBookingGuest }
     *     
     */
    public void setEachOrderGuests(ArrayOfArrayOfDRequestBookingGuest value) {
        this.eachOrderGuests = value;
    }

    /**
     * 获取bkMebCardNo属性的值。
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
     * 设置bkMebCardNo属性的值。
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
     * 获取authorNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorNumber() {
        return authorNumber;
    }

    /**
     * 设置authorNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorNumber(String value) {
        this.authorNumber = value;
    }

}
