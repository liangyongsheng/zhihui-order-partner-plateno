
package com.zhihui.order.partner.plateno.service.chain;

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
 *         &lt;element name="GetCityArrayResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="theCityArray" type="{http://www.7daysinn.cn/booking}ArrayOfString" minOccurs="0"/>
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
    "getCityArrayResult",
    "theCityArray"
})
@XmlRootElement(name = "GetCityArrayResponse")
public class GetCityArrayResponse {

    @XmlElement(name = "GetCityArrayResult")
    protected int getCityArrayResult;
    protected ArrayOfString theCityArray;

    /**
     * 获取getCityArrayResult属性的值。
     * 
     */
    public int getGetCityArrayResult() {
        return getCityArrayResult;
    }

    /**
     * 设置getCityArrayResult属性的值。
     * 
     */
    public void setGetCityArrayResult(int value) {
        this.getCityArrayResult = value;
    }

    /**
     * 获取theCityArray属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getTheCityArray() {
        return theCityArray;
    }

    /**
     * 设置theCityArray属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setTheCityArray(ArrayOfString value) {
        this.theCityArray = value;
    }

}
