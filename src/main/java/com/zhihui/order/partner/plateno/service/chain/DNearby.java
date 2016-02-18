
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DNearby complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DNearby">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lstPark" type="{http://www.7daysinn.cn/booking}ArrayOfDPark" minOccurs="0"/>
 *         &lt;element name="bIsFree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNearby", propOrder = {
    "lstPark",
    "bIsFree"
})
public class DNearby {

    protected ArrayOfDPark lstPark;
    protected boolean bIsFree;

    /**
     * 获取lstPark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPark }
     *     
     */
    public ArrayOfDPark getLstPark() {
        return lstPark;
    }

    /**
     * 设置lstPark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPark }
     *     
     */
    public void setLstPark(ArrayOfDPark value) {
        this.lstPark = value;
    }

    /**
     * 获取bIsFree属性的值。
     * 
     */
    public boolean isBIsFree() {
        return bIsFree;
    }

    /**
     * 设置bIsFree属性的值。
     * 
     */
    public void setBIsFree(boolean value) {
        this.bIsFree = value;
    }

}
