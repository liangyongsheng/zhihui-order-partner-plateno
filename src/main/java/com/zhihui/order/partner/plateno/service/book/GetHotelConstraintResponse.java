
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
 *         &lt;element name="GetHotelConstraintResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getHotelConstraintResult",
    "lstEndOfDay"
})
@XmlRootElement(name = "GetHotelConstraintResponse")
public class GetHotelConstraintResponse {

    @XmlElement(name = "GetHotelConstraintResult")
    protected int getHotelConstraintResult;
    protected ArrayOfDateTime lstEndOfDay;

    /**
     * ��ȡgetHotelConstraintResult���Ե�ֵ��
     * 
     */
    public int getGetHotelConstraintResult() {
        return getHotelConstraintResult;
    }

    /**
     * ����getHotelConstraintResult���Ե�ֵ��
     * 
     */
    public void setGetHotelConstraintResult(int value) {
        this.getHotelConstraintResult = value;
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
