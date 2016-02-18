
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="sCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nHotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dtBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dtEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sRoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nRoomNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sCity",
    "nHotelId",
    "dtBegin",
    "dtEnd",
    "sRoomType",
    "nRoomNum"
})
@XmlRootElement(name = "IsBookingAssure")
public class IsBookingAssure {

    protected String sAuth;
    protected String sCity;
    protected int nHotelId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtBegin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtEnd;
    protected String sRoomType;
    protected int nRoomNum;

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
     * 获取sCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCity() {
        return sCity;
    }

    /**
     * 设置sCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCity(String value) {
        this.sCity = value;
    }

    /**
     * 获取nHotelId属性的值。
     * 
     */
    public int getNHotelId() {
        return nHotelId;
    }

    /**
     * 设置nHotelId属性的值。
     * 
     */
    public void setNHotelId(int value) {
        this.nHotelId = value;
    }

    /**
     * 获取dtBegin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtBegin() {
        return dtBegin;
    }

    /**
     * 设置dtBegin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtBegin(XMLGregorianCalendar value) {
        this.dtBegin = value;
    }

    /**
     * 获取dtEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtEnd() {
        return dtEnd;
    }

    /**
     * 设置dtEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtEnd(XMLGregorianCalendar value) {
        this.dtEnd = value;
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
     * 获取nRoomNum属性的值。
     * 
     */
    public int getNRoomNum() {
        return nRoomNum;
    }

    /**
     * 设置nRoomNum属性的值。
     * 
     */
    public void setNRoomNum(int value) {
        this.nRoomNum = value;
    }

}
