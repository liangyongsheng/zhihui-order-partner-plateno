
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DNearby complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DNearby">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lstPark" type="{http://www.7daysinn.cn/booking}ArrayOfDPark" minOccurs="0"/>
 *         &lt;element name="bIsFree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNearby", propOrder = {
    "lstPark",
    "bIsFree"
})
public class DNearby {

    protected ArrayOfDPark lstPark;
    protected boolean bIsFree;

    /**
     * ��ȡlstPark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPark }
     *     
     */
    public ArrayOfDPark getLstPark() {
        return lstPark;
    }

    /**
     * ����lstPark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPark }
     *     
     */
    public void setLstPark(ArrayOfDPark value) {
        this.lstPark = value;
    }

    /**
     * ��ȡbIsFree���Ե�ֵ��
     * 
     */
    public boolean isBIsFree() {
        return bIsFree;
    }

    /**
     * ����bIsFree���Ե�ֵ��
     * 
     */
    public void setBIsFree(boolean value) {
        this.bIsFree = value;
    }

}
