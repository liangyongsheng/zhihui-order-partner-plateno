
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DDisctict complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DDisctict">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sGJCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sHCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sFJC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDTZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DDisctict", propOrder = {
    "sgjcz",
    "shcz",
    "sfjc",
    "sdtz"
})
public class DDisctict {

    @XmlElement(name = "sGJCZ")
    protected String sgjcz;
    @XmlElement(name = "sHCZ")
    protected String shcz;
    @XmlElement(name = "sFJC")
    protected String sfjc;
    @XmlElement(name = "sDTZ")
    protected String sdtz;

    /**
     * 获取sgjcz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGJCZ() {
        return sgjcz;
    }

    /**
     * 设置sgjcz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGJCZ(String value) {
        this.sgjcz = value;
    }

    /**
     * 获取shcz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHCZ() {
        return shcz;
    }

    /**
     * 设置shcz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHCZ(String value) {
        this.shcz = value;
    }

    /**
     * 获取sfjc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFJC() {
        return sfjc;
    }

    /**
     * 设置sfjc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFJC(String value) {
        this.sfjc = value;
    }

    /**
     * 获取sdtz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDTZ() {
        return sdtz;
    }

    /**
     * 设置sdtz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDTZ(String value) {
        this.sdtz = value;
    }

}
