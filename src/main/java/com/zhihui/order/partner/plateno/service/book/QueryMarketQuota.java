
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
 *         &lt;element name="Authentication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MarketActID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Quotas" type="{http://www.7daysinn.cn/booking}ArrayOfQuota" minOccurs="0"/>
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
    "authentication",
    "hotelID",
    "marketActID",
    "beginDate",
    "endDate",
    "quotas"
})
@XmlRootElement(name = "QueryMarketQuota")
public class QueryMarketQuota {

    @XmlElement(name = "Authentication")
    protected String authentication;
    @XmlElement(name = "HotelID")
    protected int hotelID;
    @XmlElement(name = "MarketActID")
    protected int marketActID;
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Quotas")
    protected ArrayOfQuota quotas;

    /**
     * ��ȡauthentication���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthentication() {
        return authentication;
    }

    /**
     * ����authentication���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthentication(String value) {
        this.authentication = value;
    }

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
     * ��ȡbeginDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * ����beginDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * ��ȡendDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * ����endDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * ��ȡquotas���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuota }
     *     
     */
    public ArrayOfQuota getQuotas() {
        return quotas;
    }

    /**
     * ����quotas���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuota }
     *     
     */
    public void setQuotas(ArrayOfQuota value) {
        this.quotas = value;
    }

}
