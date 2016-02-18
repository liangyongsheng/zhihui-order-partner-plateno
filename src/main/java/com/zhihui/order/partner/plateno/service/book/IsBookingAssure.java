
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsAuth���Ե�ֵ��
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
     * ����sAuth���Ե�ֵ��
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
     * ��ȡsCity���Ե�ֵ��
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
     * ����sCity���Ե�ֵ��
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
     * ��ȡnHotelId���Ե�ֵ��
     * 
     */
    public int getNHotelId() {
        return nHotelId;
    }

    /**
     * ����nHotelId���Ե�ֵ��
     * 
     */
    public void setNHotelId(int value) {
        this.nHotelId = value;
    }

    /**
     * ��ȡdtBegin���Ե�ֵ��
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
     * ����dtBegin���Ե�ֵ��
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
     * ��ȡdtEnd���Ե�ֵ��
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
     * ����dtEnd���Ե�ֵ��
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
     * ��ȡnRoomNum���Ե�ֵ��
     * 
     */
    public int getNRoomNum() {
        return nRoomNum;
    }

    /**
     * ����nRoomNum���Ե�ֵ��
     * 
     */
    public void setNRoomNum(int value) {
        this.nRoomNum = value;
    }

}
