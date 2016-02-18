
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CRequestBookingInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡorganId���Ե�ֵ��
     * 
     */
    public int getOrganId() {
        return organId;
    }

    /**
     * ����organId���Ե�ֵ��
     * 
     */
    public void setOrganId(int value) {
        this.organId = value;
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
     * ��ȡstartTime���Ե�ֵ��
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
     * ����startTime���Ե�ֵ��
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
     * ��ȡsponsionType���Ե�ֵ��
     * 
     */
    public int getSponsionType() {
        return sponsionType;
    }

    /**
     * ����sponsionType���Ե�ֵ��
     * 
     */
    public void setSponsionType(int value) {
        this.sponsionType = value;
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

    /**
     * ��ȡroomRates���Ե�ֵ��
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
     * ����roomRates���Ե�ֵ��
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
     * ��ȡeachOrderGuests���Ե�ֵ��
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
     * ����eachOrderGuests���Ե�ֵ��
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
     * ��ȡauthorNumber���Ե�ֵ��
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
     * ����authorNumber���Ե�ֵ��
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
