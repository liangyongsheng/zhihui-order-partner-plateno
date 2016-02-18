
package com.zhihui.order.partner.plateno.service.book.sub;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AccTrans complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡnChainID���Ե�ֵ��
     * 
     */
    public int getNChainID() {
        return nChainID;
    }

    /**
     * ����nChainID���Ե�ֵ��
     * 
     */
    public void setNChainID(int value) {
        this.nChainID = value;
    }

    /**
     * ��ȡnFolioID���Ե�ֵ��
     * 
     */
    public int getNFolioID() {
        return nFolioID;
    }

    /**
     * ����nFolioID���Ե�ֵ��
     * 
     */
    public void setNFolioID(int value) {
        this.nFolioID = value;
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
     * ��ȡnTransID���Ե�ֵ��
     * 
     */
    public int getNTransID() {
        return nTransID;
    }

    /**
     * ����nTransID���Ե�ֵ��
     * 
     */
    public void setNTransID(int value) {
        this.nTransID = value;
    }

    /**
     * ��ȡnItemID���Ե�ֵ��
     * 
     */
    public int getNItemID() {
        return nItemID;
    }

    /**
     * ����nItemID���Ե�ֵ��
     * 
     */
    public void setNItemID(int value) {
        this.nItemID = value;
    }

    /**
     * ��ȡsItemName���Ե�ֵ��
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
     * ����sItemName���Ե�ֵ��
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
     * ��ȡdtTransdate���Ե�ֵ��
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
     * ����dtTransdate���Ե�ֵ��
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
     * ��ȡsRemark���Ե�ֵ��
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
     * ����sRemark���Ե�ֵ��
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
     * ��ȡmAmount���Ե�ֵ��
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
     * ����mAmount���Ե�ֵ��
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
     * ��ȡnCashier���Ե�ֵ��
     * 
     */
    public int getNCashier() {
        return nCashier;
    }

    /**
     * ����nCashier���Ե�ֵ��
     * 
     */
    public void setNCashier(int value) {
        this.nCashier = value;
    }

    /**
     * ��ȡdtAccDate���Ե�ֵ��
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
     * ����dtAccDate���Ե�ֵ��
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
     * ��ȡsRefNo���Ե�ֵ��
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
     * ����sRefNo���Ե�ֵ��
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
     * ��ȡbDebOrCre���Ե�ֵ��
     * 
     */
    public boolean isBDebOrCre() {
        return bDebOrCre;
    }

    /**
     * ����bDebOrCre���Ե�ֵ��
     * 
     */
    public void setBDebOrCre(boolean value) {
        this.bDebOrCre = value;
    }

    /**
     * ��ȡvoidFlag���Ե�ֵ��
     * 
     */
    public int getVoidFlag() {
        return voidFlag;
    }

    /**
     * ����voidFlag���Ե�ֵ��
     * 
     */
    public void setVoidFlag(int value) {
        this.voidFlag = value;
    }

}
