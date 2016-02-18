
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
 *         &lt;element name="QueryMarketQuotaResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Quotas" type="{http://www.7daysinn.cn/booking}ArrayOfQuota" minOccurs="0"/>
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
    "queryMarketQuotaResult",
    "quotas"
})
@XmlRootElement(name = "QueryMarketQuotaResponse")
public class QueryMarketQuotaResponse {

    @XmlElement(name = "QueryMarketQuotaResult")
    protected int queryMarketQuotaResult;
    @XmlElement(name = "Quotas")
    protected ArrayOfQuota quotas;

    /**
     * 获取queryMarketQuotaResult属性的值。
     * 
     */
    public int getQueryMarketQuotaResult() {
        return queryMarketQuotaResult;
    }

    /**
     * 设置queryMarketQuotaResult属性的值。
     * 
     */
    public void setQueryMarketQuotaResult(int value) {
        this.queryMarketQuotaResult = value;
    }

    /**
     * 获取quotas属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuota }
     *     
     */
    public ArrayOfQuota getQuotas() {
        return quotas;
    }

    /**
     * 设置quotas属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuota }
     *     
     */
    public void setQuotas(ArrayOfQuota value) {
        this.quotas = value;
    }

}
