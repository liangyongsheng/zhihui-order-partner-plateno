
package com.zhihui.order.partner.plateno.service.book;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CTBookingInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CTBookingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Refund" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Amout" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nAssureType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sSellerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sRoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nOrderSubID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nHotelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nRoomTypeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cdArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="cdDepart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nStatus" type="{http://www.7daysinn.cn/booking}CTStatusType"/>
 *         &lt;element name="nOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdBookedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nBookMebID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nBookPropertyID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sBookGstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sBookGstMoble" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sChkinGstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sChkinGstMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sHotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sRoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTBookingInfo", propOrder = {
    "refund",
    "amout",
    "nAssureType",
    "sSellerID",
    "sRoomNo",
    "sOrderNo",
    "nOrderSubID",
    "nHotelID",
    "nRoomTypeID",
    "cdArrival",
    "cdDepart",
    "nStatus",
    "nOrigin",
    "cdBookedDate",
    "nBookMebID",
    "nBookPropertyID",
    "sBookGstName",
    "sBookGstMoble",
    "sChkinGstName",
    "sChkinGstMobile",
    "sHotelName",
    "sRoomType",
    "sRemarks"
})
public class CTBookingInfo {

    @XmlElement(name = "Refund", required = true)
    protected BigDecimal refund;
    @XmlElement(name = "Amout", required = true, nillable = true)
    protected BigDecimal amout;
    protected int nAssureType;
    protected String sSellerID;
    protected String sRoomNo;
    protected String sOrderNo;
    protected int nOrderSubID;
    protected int nHotelID;
    protected int nRoomTypeID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cdArrival;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cdDepart;
    @XmlElement(required = true)
    protected CTStatusType nStatus;
    protected String nOrigin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cdBookedDate;
    protected int nBookMebID;
    protected int nBookPropertyID;
    protected String sBookGstName;
    protected String sBookGstMoble;
    protected String sChkinGstName;
    protected String sChkinGstMobile;
    protected String sHotelName;
    protected String sRoomType;
    protected String sRemarks;

    /**
     * 获取refund属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefund() {
        return refund;
    }

    /**
     * 设置refund属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefund(BigDecimal value) {
        this.refund = value;
    }

    /**
     * 获取amout属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmout() {
        return amout;
    }

    /**
     * 设置amout属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmout(BigDecimal value) {
        this.amout = value;
    }

    /**
     * 获取nAssureType属性的值。
     * 
     */
    public int getNAssureType() {
        return nAssureType;
    }

    /**
     * 设置nAssureType属性的值。
     * 
     */
    public void setNAssureType(int value) {
        this.nAssureType = value;
    }

    /**
     * 获取sSellerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSellerID() {
        return sSellerID;
    }

    /**
     * 设置sSellerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSellerID(String value) {
        this.sSellerID = value;
    }

    /**
     * 获取sRoomNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRoomNo() {
        return sRoomNo;
    }

    /**
     * 设置sRoomNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRoomNo(String value) {
        this.sRoomNo = value;
    }

    /**
     * 获取sOrderNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOrderNo() {
        return sOrderNo;
    }

    /**
     * 设置sOrderNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOrderNo(String value) {
        this.sOrderNo = value;
    }

    /**
     * 获取nOrderSubID属性的值。
     * 
     */
    public int getNOrderSubID() {
        return nOrderSubID;
    }

    /**
     * 设置nOrderSubID属性的值。
     * 
     */
    public void setNOrderSubID(int value) {
        this.nOrderSubID = value;
    }

    /**
     * 获取nHotelID属性的值。
     * 
     */
    public int getNHotelID() {
        return nHotelID;
    }

    /**
     * 设置nHotelID属性的值。
     * 
     */
    public void setNHotelID(int value) {
        this.nHotelID = value;
    }

    /**
     * 获取nRoomTypeID属性的值。
     * 
     */
    public int getNRoomTypeID() {
        return nRoomTypeID;
    }

    /**
     * 设置nRoomTypeID属性的值。
     * 
     */
    public void setNRoomTypeID(int value) {
        this.nRoomTypeID = value;
    }

    /**
     * 获取cdArrival属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCdArrival() {
        return cdArrival;
    }

    /**
     * 设置cdArrival属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCdArrival(XMLGregorianCalendar value) {
        this.cdArrival = value;
    }

    /**
     * 获取cdDepart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCdDepart() {
        return cdDepart;
    }

    /**
     * 设置cdDepart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCdDepart(XMLGregorianCalendar value) {
        this.cdDepart = value;
    }

    /**
     * 获取nStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CTStatusType }
     *     
     */
    public CTStatusType getNStatus() {
        return nStatus;
    }

    /**
     * 设置nStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CTStatusType }
     *     
     */
    public void setNStatus(CTStatusType value) {
        this.nStatus = value;
    }

    /**
     * 获取nOrigin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOrigin() {
        return nOrigin;
    }

    /**
     * 设置nOrigin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOrigin(String value) {
        this.nOrigin = value;
    }

    /**
     * 获取cdBookedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCdBookedDate() {
        return cdBookedDate;
    }

    /**
     * 设置cdBookedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCdBookedDate(XMLGregorianCalendar value) {
        this.cdBookedDate = value;
    }

    /**
     * 获取nBookMebID属性的值。
     * 
     */
    public int getNBookMebID() {
        return nBookMebID;
    }

    /**
     * 设置nBookMebID属性的值。
     * 
     */
    public void setNBookMebID(int value) {
        this.nBookMebID = value;
    }

    /**
     * 获取nBookPropertyID属性的值。
     * 
     */
    public int getNBookPropertyID() {
        return nBookPropertyID;
    }

    /**
     * 设置nBookPropertyID属性的值。
     * 
     */
    public void setNBookPropertyID(int value) {
        this.nBookPropertyID = value;
    }

    /**
     * 获取sBookGstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBookGstName() {
        return sBookGstName;
    }

    /**
     * 设置sBookGstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBookGstName(String value) {
        this.sBookGstName = value;
    }

    /**
     * 获取sBookGstMoble属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSBookGstMoble() {
        return sBookGstMoble;
    }

    /**
     * 设置sBookGstMoble属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSBookGstMoble(String value) {
        this.sBookGstMoble = value;
    }

    /**
     * 获取sChkinGstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSChkinGstName() {
        return sChkinGstName;
    }

    /**
     * 设置sChkinGstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSChkinGstName(String value) {
        this.sChkinGstName = value;
    }

    /**
     * 获取sChkinGstMobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSChkinGstMobile() {
        return sChkinGstMobile;
    }

    /**
     * 设置sChkinGstMobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSChkinGstMobile(String value) {
        this.sChkinGstMobile = value;
    }

    /**
     * 获取sHotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelName() {
        return sHotelName;
    }

    /**
     * 设置sHotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelName(String value) {
        this.sHotelName = value;
    }

    /**
     * 获取sRoomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRoomType() {
        return sRoomType;
    }

    /**
     * 设置sRoomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRoomType(String value) {
        this.sRoomType = value;
    }

    /**
     * 获取sRemarks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRemarks() {
        return sRemarks;
    }

    /**
     * 设置sRemarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRemarks(String value) {
        this.sRemarks = value;
    }

}
