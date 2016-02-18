
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Authentication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nHotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lstEndOfDay" type="{http://www.7daysinn.cn/booking}ArrayOfDateTime" minOccurs="0"/>
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
    "nHotelId",
    "lstEndOfDay"
})
@XmlRootElement(name = "GetHotelConstraint")
public class GetHotelConstraint {

    @XmlElement(name = "Authentication")
    protected String authentication;
    protected int nHotelId;
    protected ArrayOfDateTime lstEndOfDay;

    /**
     * 获取authentication属性的值。
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
     * 设置authentication属性的值。
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
     * 获取lstEndOfDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDateTime }
     *     
     */
    public ArrayOfDateTime getLstEndOfDay() {
        return lstEndOfDay;
    }

    /**
     * 设置lstEndOfDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDateTime }
     *     
     */
    public void setLstEndOfDay(ArrayOfDateTime value) {
        this.lstEndOfDay = value;
    }

}
