
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
 *         &lt;element name="objCompose" type="{http://www.7daysinn.cn/booking}ComposeSearchInfo" minOccurs="0"/>
 *         &lt;element name="arrBookingInfo" type="{http://www.7daysinn.cn/booking}ArrayOfCTBookingInfo" minOccurs="0"/>
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
    "objCompose",
    "arrBookingInfo"
})
@XmlRootElement(name = "GetBookingInfoByCompose")
public class GetBookingInfoByCompose {

    @XmlElement(name = "Authentication")
    protected String authentication;
    protected ComposeSearchInfo objCompose;
    protected ArrayOfCTBookingInfo arrBookingInfo;

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
     * 获取objCompose属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ComposeSearchInfo }
     *     
     */
    public ComposeSearchInfo getObjCompose() {
        return objCompose;
    }

    /**
     * 设置objCompose属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ComposeSearchInfo }
     *     
     */
    public void setObjCompose(ComposeSearchInfo value) {
        this.objCompose = value;
    }

    /**
     * 获取arrBookingInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCTBookingInfo }
     *     
     */
    public ArrayOfCTBookingInfo getArrBookingInfo() {
        return arrBookingInfo;
    }

    /**
     * 设置arrBookingInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCTBookingInfo }
     *     
     */
    public void setArrBookingInfo(ArrayOfCTBookingInfo value) {
        this.arrBookingInfo = value;
    }

}
