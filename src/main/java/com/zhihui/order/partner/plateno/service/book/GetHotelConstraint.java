
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
 *         &lt;element name="nHotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lstEndOfDay" type="{http://www.7daysinn.cn/booking}ArrayOfDateTime" minOccurs="0"/>
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
    "nHotelId",
    "lstEndOfDay"
})
@XmlRootElement(name = "GetHotelConstraint")
public class GetHotelConstraint {

    @XmlElement(name = "Authentication")
    protected String authentication;
    protected int nHotelId;
    protected ArrayOfDateTime lstEndOfDay;

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
     * ��ȡnHotelId���Ե�ֵ��
     * 
     */
    public int getNHotelId() {
        return nHotelId;
    }

    /**
     * ����nHotelId���Ե�ֵ��
     * 
     */
    public void setNHotelId(int value) {
        this.nHotelId = value;
    }

    /**
     * ��ȡlstEndOfDay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDateTime }
     *     
     */
    public ArrayOfDateTime getLstEndOfDay() {
        return lstEndOfDay;
    }

    /**
     * ����lstEndOfDay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDateTime }
     *     
     */
    public void setLstEndOfDay(ArrayOfDateTime value) {
        this.lstEndOfDay = value;
    }

}
