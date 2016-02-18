
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
 *         &lt;element name="Authentication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="theBookingInfo" type="{http://www.7daysinn.cn/booking}CTBookingInfo" minOccurs="0"/>
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
    "sOrderNo",
    "theBookingInfo"
})
@XmlRootElement(name = "GetOrderNoBookingInfo")
public class GetOrderNoBookingInfo {

    @XmlElement(name = "Authentication")
    protected String authentication;
    protected String sOrderNo;
    protected CTBookingInfo theBookingInfo;

    /**
     * ��ȡauthentication���Ե�ֵ��
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
     * ����authentication���Ե�ֵ��
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
     * ��ȡsOrderNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOrderNo() {
        return sOrderNo;
    }

    /**
     * ����sOrderNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOrderNo(String value) {
        this.sOrderNo = value;
    }

    /**
     * ��ȡtheBookingInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CTBookingInfo }
     *     
     */
    public CTBookingInfo getTheBookingInfo() {
        return theBookingInfo;
    }

    /**
     * ����theBookingInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CTBookingInfo }
     *     
     */
    public void setTheBookingInfo(CTBookingInfo value) {
        this.theBookingInfo = value;
    }

}
