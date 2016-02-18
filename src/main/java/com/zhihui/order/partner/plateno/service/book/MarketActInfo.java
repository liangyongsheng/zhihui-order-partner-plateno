
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MarketActInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MarketActInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketActID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MarketActName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MustPayFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CanCancelFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AheadBookDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AheadCancelDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketActInfo", propOrder = {
    "marketActID",
    "marketActName",
    "beginDate",
    "endDate",
    "mustPayFlag",
    "canCancelFlag",
    "aheadBookDay",
    "aheadCancelDay"
})
public class MarketActInfo {

    @XmlElement(name = "MarketActID")
    protected int marketActID;
    @XmlElement(name = "MarketActName")
    protected String marketActName;
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "MustPayFlag")
    protected boolean mustPayFlag;
    @XmlElement(name = "CanCancelFlag")
    protected boolean canCancelFlag;
    @XmlElement(name = "AheadBookDay")
    protected int aheadBookDay;
    @XmlElement(name = "AheadCancelDay")
    protected int aheadCancelDay;

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
     * ��ȡmarketActName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketActName() {
        return marketActName;
    }

    /**
     * ����marketActName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketActName(String value) {
        this.marketActName = value;
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
     * ��ȡmustPayFlag���Ե�ֵ��
     * 
     */
    public boolean isMustPayFlag() {
        return mustPayFlag;
    }

    /**
     * ����mustPayFlag���Ե�ֵ��
     * 
     */
    public void setMustPayFlag(boolean value) {
        this.mustPayFlag = value;
    }

    /**
     * ��ȡcanCancelFlag���Ե�ֵ��
     * 
     */
    public boolean isCanCancelFlag() {
        return canCancelFlag;
    }

    /**
     * ����canCancelFlag���Ե�ֵ��
     * 
     */
    public void setCanCancelFlag(boolean value) {
        this.canCancelFlag = value;
    }

    /**
     * ��ȡaheadBookDay���Ե�ֵ��
     * 
     */
    public int getAheadBookDay() {
        return aheadBookDay;
    }

    /**
     * ����aheadBookDay���Ե�ֵ��
     * 
     */
    public void setAheadBookDay(int value) {
        this.aheadBookDay = value;
    }

    /**
     * ��ȡaheadCancelDay���Ե�ֵ��
     * 
     */
    public int getAheadCancelDay() {
        return aheadCancelDay;
    }

    /**
     * ����aheadCancelDay���Ե�ֵ��
     * 
     */
    public void setAheadCancelDay(int value) {
        this.aheadCancelDay = value;
    }

}
