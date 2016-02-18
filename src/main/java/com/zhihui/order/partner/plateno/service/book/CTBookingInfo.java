
package com.zhihui.order.partner.plateno.service.book;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CTBookingInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡrefund���Ե�ֵ��
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
     * ����refund���Ե�ֵ��
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
     * ��ȡamout���Ե�ֵ��
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
     * ����amout���Ե�ֵ��
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
     * ��ȡnAssureType���Ե�ֵ��
     * 
     */
    public int getNAssureType() {
        return nAssureType;
    }

    /**
     * ����nAssureType���Ե�ֵ��
     * 
     */
    public void setNAssureType(int value) {
        this.nAssureType = value;
    }

    /**
     * ��ȡsSellerID���Ե�ֵ��
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
     * ����sSellerID���Ե�ֵ��
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
     * ��ȡsRoomNo���Ե�ֵ��
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
     * ����sRoomNo���Ե�ֵ��
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
     * ��ȡsOrderNo���Ե�ֵ��
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
     * ����sOrderNo���Ե�ֵ��
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
     * ��ȡnOrderSubID���Ե�ֵ��
     * 
     */
    public int getNOrderSubID() {
        return nOrderSubID;
    }

    /**
     * ����nOrderSubID���Ե�ֵ��
     * 
     */
    public void setNOrderSubID(int value) {
        this.nOrderSubID = value;
    }

    /**
     * ��ȡnHotelID���Ե�ֵ��
     * 
     */
    public int getNHotelID() {
        return nHotelID;
    }

    /**
     * ����nHotelID���Ե�ֵ��
     * 
     */
    public void setNHotelID(int value) {
        this.nHotelID = value;
    }

    /**
     * ��ȡnRoomTypeID���Ե�ֵ��
     * 
     */
    public int getNRoomTypeID() {
        return nRoomTypeID;
    }

    /**
     * ����nRoomTypeID���Ե�ֵ��
     * 
     */
    public void setNRoomTypeID(int value) {
        this.nRoomTypeID = value;
    }

    /**
     * ��ȡcdArrival���Ե�ֵ��
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
     * ����cdArrival���Ե�ֵ��
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
     * ��ȡcdDepart���Ե�ֵ��
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
     * ����cdDepart���Ե�ֵ��
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
     * ��ȡnStatus���Ե�ֵ��
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
     * ����nStatus���Ե�ֵ��
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
     * ��ȡnOrigin���Ե�ֵ��
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
     * ����nOrigin���Ե�ֵ��
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
     * ��ȡcdBookedDate���Ե�ֵ��
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
     * ����cdBookedDate���Ե�ֵ��
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
     * ��ȡnBookMebID���Ե�ֵ��
     * 
     */
    public int getNBookMebID() {
        return nBookMebID;
    }

    /**
     * ����nBookMebID���Ե�ֵ��
     * 
     */
    public void setNBookMebID(int value) {
        this.nBookMebID = value;
    }

    /**
     * ��ȡnBookPropertyID���Ե�ֵ��
     * 
     */
    public int getNBookPropertyID() {
        return nBookPropertyID;
    }

    /**
     * ����nBookPropertyID���Ե�ֵ��
     * 
     */
    public void setNBookPropertyID(int value) {
        this.nBookPropertyID = value;
    }

    /**
     * ��ȡsBookGstName���Ե�ֵ��
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
     * ����sBookGstName���Ե�ֵ��
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
     * ��ȡsBookGstMoble���Ե�ֵ��
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
     * ����sBookGstMoble���Ե�ֵ��
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
     * ��ȡsChkinGstName���Ե�ֵ��
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
     * ����sChkinGstName���Ե�ֵ��
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
     * ��ȡsChkinGstMobile���Ե�ֵ��
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
     * ����sChkinGstMobile���Ե�ֵ��
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
     * ��ȡsHotelName���Ե�ֵ��
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
     * ����sHotelName���Ե�ֵ��
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
     * ��ȡsRoomType���Ե�ֵ��
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
     * ����sRoomType���Ե�ֵ��
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
     * ��ȡsRemarks���Ե�ֵ��
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
     * ����sRemarks���Ե�ֵ��
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
