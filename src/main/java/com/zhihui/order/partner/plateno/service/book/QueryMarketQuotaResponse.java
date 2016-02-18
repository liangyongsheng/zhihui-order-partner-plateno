
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
     * ��ȡqueryMarketQuotaResult���Ե�ֵ��
     * 
     */
    public int getQueryMarketQuotaResult() {
        return queryMarketQuotaResult;
    }

    /**
     * ����queryMarketQuotaResult���Ե�ֵ��
     * 
     */
    public void setQueryMarketQuotaResult(int value) {
        this.queryMarketQuotaResult = value;
    }

    /**
     * ��ȡquotas���Ե�ֵ��
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
     * ����quotas���Ե�ֵ��
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
