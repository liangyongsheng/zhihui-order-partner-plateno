
package com.zhihui.order.partner.plateno.service.chain;

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
 *         &lt;element name="GetErrorExpressionResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sErrMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getErrorExpressionResult",
    "sErrMsg"
})
@XmlRootElement(name = "GetErrorExpressionResponse")
public class GetErrorExpressionResponse {

    @XmlElement(name = "GetErrorExpressionResult")
    protected int getErrorExpressionResult;
    protected String sErrMsg;

    /**
     * ��ȡgetErrorExpressionResult���Ե�ֵ��
     * 
     */
    public int getGetErrorExpressionResult() {
        return getErrorExpressionResult;
    }

    /**
     * ����getErrorExpressionResult���Ե�ֵ��
     * 
     */
    public void setGetErrorExpressionResult(int value) {
        this.getErrorExpressionResult = value;
    }

    /**
     * ��ȡsErrMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSErrMsg() {
        return sErrMsg;
    }

    /**
     * ����sErrMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSErrMsg(String value) {
        this.sErrMsg = value;
    }

}
