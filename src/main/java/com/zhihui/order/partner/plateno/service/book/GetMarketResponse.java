
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡgetMarketResult���Ե�ֵ��
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
     * ����getMarketResult���Ե�ֵ��
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
