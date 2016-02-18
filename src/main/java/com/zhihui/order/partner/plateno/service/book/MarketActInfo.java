
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MarketActInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取marketActID属性的值。
     * 
     */
    public int getMarketActID() {
        return marketActID;
    }

    /**
     * 设置marketActID属性的值。
     * 
     */
    public void setMarketActID(int value) {
        this.marketActID = value;
    }

    /**
     * 获取marketActName属性的值。
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
     * 设置marketActName属性的值。
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
     * 获取beginDate属性的值。
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
     * 设置beginDate属性的值。
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
     * 获取endDate属性的值。
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
     * 设置endDate属性的值。
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
     * 获取mustPayFlag属性的值。
     * 
     */
    public boolean isMustPayFlag() {
        return mustPayFlag;
    }

    /**
     * 设置mustPayFlag属性的值。
     * 
     */
    public void setMustPayFlag(boolean value) {
        this.mustPayFlag = value;
    }

    /**
     * 获取canCancelFlag属性的值。
     * 
     */
    public boolean isCanCancelFlag() {
        return canCancelFlag;
    }

    /**
     * 设置canCancelFlag属性的值。
     * 
     */
    public void setCanCancelFlag(boolean value) {
        this.canCancelFlag = value;
    }

    /**
     * 获取aheadBookDay属性的值。
     * 
     */
    public int getAheadBookDay() {
        return aheadBookDay;
    }

    /**
     * 设置aheadBookDay属性的值。
     * 
     */
    public void setAheadBookDay(int value) {
        this.aheadBookDay = value;
    }

    /**
     * 获取aheadCancelDay属性的值。
     * 
     */
    public int getAheadCancelDay() {
        return aheadCancelDay;
    }

    /**
     * 设置aheadCancelDay属性的值。
     * 
     */
    public void setAheadCancelDay(int value) {
        this.aheadCancelDay = value;
    }

}
