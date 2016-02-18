
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ActName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "QInfo", propOrder = {
    "actID",
    "actName",
    "bKingID"
})
public class QInfo {

    @XmlElement(name = "ActID")
    protected int actID;
    @XmlElement(name = "ActName")
    protected String actName;
    @XmlElement(name = "BKingID")
    protected int bKingID;

    /**
     * 获取actID属性的值。
     * 
     */
    public int getActID() {
        return actID;
    }

    /**
     * 设置actID属性的值。
     * 
     */
    public void setActID(int value) {
        this.actID = value;
    }

    /**
     * 获取actName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActName() {
        return actName;
    }

    /**
     * 设置actName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActName(String value) {
        this.actName = value;
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
