
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DImgPath complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DImgPath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nHotelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sImgPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nImgType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BKingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DImgPath", propOrder = {
    "nHotelID",
    "sImgPath",
    "nImgType",
    "bKingID"
})
public class DImgPath {

    protected int nHotelID;
    protected String sImgPath;
    protected int nImgType;
    @XmlElement(name = "BKingID")
    protected int bKingID;

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
     * 获取sImgPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSImgPath() {
        return sImgPath;
    }

    /**
     * 设置sImgPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSImgPath(String value) {
        this.sImgPath = value;
    }

    /**
     * 获取nImgType属性的值。
     * 
     */
    public int getNImgType() {
        return nImgType;
    }

    /**
     * 设置nImgType属性的值。
     * 
     */
    public void setNImgType(int value) {
        this.nImgType = value;
    }

    /**
     * 获取bKingID属性的值。
     * 
     */
    public int getBKingID() {
        return bKingID;
    }

    /**
     * 设置bKingID属性的值。
     * 
     */
    public void setBKingID(int value) {
        this.bKingID = value;
    }

}
