
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
     * ��ȡobjCompose���Ե�ֵ��
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
     * ����objCompose���Ե�ֵ��
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
     * ��ȡarrBookingInfo���Ե�ֵ��
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
     * ����arrBookingInfo���Ե�ֵ��
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
