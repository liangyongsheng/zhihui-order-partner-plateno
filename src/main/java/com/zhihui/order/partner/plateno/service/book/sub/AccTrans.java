
package com.zhihui.order.partner.plateno.service.book.sub;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AccTrans complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nChainID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nFolioID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sRoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nTransID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nItemID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtTransdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nCashier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dtAccDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bDebOrCre" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VoidFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccTrans", propOrder = {
    "nChainID",
    "nFolioID",
    "sRoomNo",
    "nTransID",
    "nItemID",
    "sItemName",
    "dtTransdate",
    "sRemark",
    "mAmount",
    "nCashier",
    "dtAccDate",
    "sRefNo",
    "bDebOrCre",
    "voidFlag"
})
public class AccTrans {

    protected int nChainID;
    protected int nFolioID;
    protected String sRoomNo;
    protected int nTransID;
    protected int nItemID;
    protected String sItemName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTransdate;
    protected String sRemark;
    @XmlElement(required = true)
    protected BigDecimal mAmount;
    protected int nCashier;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtAccDate;
    protected String sRefNo;
    protected boolean bDebOrCre;
    @XmlElement(name = "VoidFlag")
    protected int voidFlag;

    /**
     * 获取nChainID属性的值。
     * 
     */
    public int getNChainID() {
        return nChainID;
    }

    /**
     * 设置nChainID属性的值。
     * 
     */
    public void setNChainID(int value) {
        this.nChainID = value;
    }

    /**
     * 获取nFolioID属性的值。
     * 
     */
    public int getNFolioID() {
        return nFolioID;
    }

    /**
     * 设置nFolioID属性的值。
     * 
     */
    public void setNFolioID(int value) {
        this.nFolioID = value;
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
     * 获取nTransID属性的值。
     * 
     */
    public int getNTransID() {
        return nTransID;
    }

    /**
     * 设置nTransID属性的值。
     * 
     */
    public void setNTransID(int value) {
        this.nTransID = value;
    }

    /**
     * 获取nItemID属性的值。
     * 
     */
    public int getNItemID() {
        return nItemID;
    }

    /**
     * 设置nItemID属性的值。
     * 
     */
    public void setNItemID(int value) {
        this.nItemID = value;
    }

    /**
     * 获取sItemName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSItemName() {
        return sItemName;
    }

    /**
     * 设置sItemName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSItemName(String value) {
        this.sItemName = value;
    }

    /**
     * 获取dtTransdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTransdate() {
        return dtTransdate;
    }

    /**
     * 设置dtTransdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTransdate(XMLGregorianCalendar value) {
        this.dtTransdate = value;
    }

    /**
     * 获取sRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRemark() {
        return sRemark;
    }

    /**
     * 设置sRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRemark(String value) {
        this.sRemark = value;
    }

    /**
     * 获取mAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMAmount() {
        return mAmount;
    }

    /**
     * 设置mAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMAmount(BigDecimal value) {
        this.mAmount = value;
    }

    /**
     * 获取nCashier属性的值。
     * 
     */
    public int getNCashier() {
        return nCashier;
    }

    /**
     * 设置nCashier属性的值。
     * 
     */
    public void setNCashier(int value) {
        this.nCashier = value;
    }

    /**
     * 获取dtAccDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtAccDate() {
        return dtAccDate;
    }

    /**
     * 设置dtAccDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtAccDate(XMLGregorianCalendar value) {
        this.dtAccDate = value;
    }

    /**
     * 获取sRefNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRefNo() {
        return sRefNo;
    }

    /**
     * 设置sRefNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRefNo(String value) {
        this.sRefNo = value;
    }

    /**
     * 获取bDebOrCre属性的值。
     * 
     */
    public boolean isBDebOrCre() {
        return bDebOrCre;
    }

    /**
     * 设置bDebOrCre属性的值。
     * 
     */
    public void setBDebOrCre(boolean value) {
        this.bDebOrCre = value;
    }

    /**
     * 获取voidFlag属性的值。
     * 
     */
    public int getVoidFlag() {
        return voidFlag;
    }

    /**
     * 设置voidFlag属性的值。
     * 
     */
    public void setVoidFlag(int value) {
        this.voidFlag = value;
    }

}
