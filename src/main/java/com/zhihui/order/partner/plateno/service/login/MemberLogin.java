
package com.zhihui.order.partner.plateno.service.login;

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
 *         &lt;element name="nType" type="{http://www.7daysinn.cn/booking}CTUserType"/>
 *         &lt;element name="sValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nType",
    "sValues",
    "sPassword"
})
@XmlRootElement(name = "MemberLogin")
public class MemberLogin {

    @XmlElement(required = true)
    protected CTUserType nType;
    protected String sValues;
    protected String sPassword;

    /**
     * ��ȡnType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CTUserType }
     *     
     */
    public CTUserType getNType() {
        return nType;
    }

    /**
     * ����nType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CTUserType }
     *     
     */
    public void setNType(CTUserType value) {
        this.nType = value;
    }

    /**
     * ��ȡsValues���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSValues() {
        return sValues;
    }

    /**
     * ����sValues���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSValues(String value) {
        this.sValues = value;
    }

    /**
     * ��ȡsPassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPassword() {
        return sPassword;
    }

    /**
     * ����sPassword���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPassword(String value) {
        this.sPassword = value;
    }

}
