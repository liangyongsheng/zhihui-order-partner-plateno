
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
 *         &lt;element name="IsBookingAssureResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "isBookingAssureResult",
    "sMsg"
})
@XmlRootElement(name = "IsBookingAssureResponse")
public class IsBookingAssureResponse {

    @XmlElement(name = "IsBookingAssureResult")
    protected int isBookingAssureResult;
    protected String sMsg;

    /**
     * ��ȡisBookingAssureResult���Ե�ֵ��
     * 
     */
    public int getIsBookingAssureResult() {
        return isBookingAssureResult;
    }

    /**
     * ����isBookingAssureResult���Ե�ֵ��
     * 
     */
    public void setIsBookingAssureResult(int value) {
        this.isBookingAssureResult = value;
    }

    /**
     * ��ȡsMsg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMsg() {
        return sMsg;
    }

    /**
     * ����sMsg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMsg(String value) {
        this.sMsg = value;
    }

}
