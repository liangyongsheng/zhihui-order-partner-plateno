
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
 *         &lt;element name="GetBookingInfoByComposeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getBookingInfoByComposeResult",
    "arrBookingInfo"
})
@XmlRootElement(name = "GetBookingInfoByComposeResponse")
public class GetBookingInfoByComposeResponse {

    @XmlElement(name = "GetBookingInfoByComposeResult")
    protected int getBookingInfoByComposeResult;
    protected ArrayOfCTBookingInfo arrBookingInfo;

    /**
     * ��ȡgetBookingInfoByComposeResult���Ե�ֵ��
     * 
     */
    public int getGetBookingInfoByComposeResult() {
        return getBookingInfoByComposeResult;
    }

    /**
     * ����getBookingInfoByComposeResult���Ե�ֵ��
     * 
     */
    public void setGetBookingInfoByComposeResult(int value) {
        this.getBookingInfoByComposeResult = value;
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
