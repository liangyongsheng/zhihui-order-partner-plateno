
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
 *         &lt;element name="GetCityArrayResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="theCityArray" type="{http://www.7daysinn.cn/booking}ArrayOfString" minOccurs="0"/>
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
    "getCityArrayResult",
    "theCityArray"
})
@XmlRootElement(name = "GetCityArrayResponse")
public class GetCityArrayResponse {

    @XmlElement(name = "GetCityArrayResult")
    protected int getCityArrayResult;
    protected ArrayOfString theCityArray;

    /**
     * ��ȡgetCityArrayResult���Ե�ֵ��
     * 
     */
    public int getGetCityArrayResult() {
        return getCityArrayResult;
    }

    /**
     * ����getCityArrayResult���Ե�ֵ��
     * 
     */
    public void setGetCityArrayResult(int value) {
        this.getCityArrayResult = value;
    }

    /**
     * ��ȡtheCityArray���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getTheCityArray() {
        return theCityArray;
    }

    /**
     * ����theCityArray���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setTheCityArray(ArrayOfString value) {
        this.theCityArray = value;
    }

}
