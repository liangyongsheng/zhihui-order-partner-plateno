
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DInnPosition complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DInnPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Disctict" type="{http://www.7daysinn.cn/booking}DDisctict" minOccurs="0"/>
 *         &lt;element name="ArriveInn" type="{http://www.7daysinn.cn/booking}DArriveInn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DInnPosition", propOrder = {
    "disctict",
    "arriveInn"
})
public class DInnPosition {

    @XmlElement(name = "Disctict")
    protected DDisctict disctict;
    @XmlElement(name = "ArriveInn")
    protected DArriveInn arriveInn;

    /**
     * ��ȡdisctict���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DDisctict }
     *     
     */
    public DDisctict getDisctict() {
        return disctict;
    }

    /**
     * ����disctict���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DDisctict }
     *     
     */
    public void setDisctict(DDisctict value) {
        this.disctict = value;
    }

    /**
     * ��ȡarriveInn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DArriveInn }
     *     
     */
    public DArriveInn getArriveInn() {
        return arriveInn;
    }

    /**
     * ����arriveInn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DArriveInn }
     *     
     */
    public void setArriveInn(DArriveInn value) {
        this.arriveInn = value;
    }

}
