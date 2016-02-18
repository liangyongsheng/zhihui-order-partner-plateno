
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
 *         &lt;element name="GetMarketResult" type="{http://www.7daysinn.cn/booking}ArrayOfMarketActInfo" minOccurs="0"/>
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
    "getMarketResult"
})
@XmlRootElement(name = "GetMarketResponse")
public class GetMarketResponse {

    @XmlElement(name = "GetMarketResult")
    protected ArrayOfMarketActInfo getMarketResult;

    /**
     * 获取getMarketResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarketActInfo }
     *     
     */
    public ArrayOfMarketActInfo getGetMarketResult() {
        return getMarketResult;
    }

    /**
     * 设置getMarketResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarketActInfo }
     *     
     */
    public void setGetMarketResult(ArrayOfMarketActInfo value) {
        this.getMarketResult = value;
    }

}
