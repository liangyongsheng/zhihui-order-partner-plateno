
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
 *         &lt;element name="GetHotelInfoByCityResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lstHotelInfo" type="{http://www.7daysinn.cn/booking}ArrayOfCTHotelInfo" minOccurs="0"/>
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
    "getHotelInfoByCityResult",
    "lstHotelInfo"
})
@XmlRootElement(name = "GetHotelInfoByCityResponse")
public class GetHotelInfoByCityResponse {

    @XmlElement(name = "GetHotelInfoByCityResult")
    protected int getHotelInfoByCityResult;
    protected ArrayOfCTHotelInfo lstHotelInfo;

    /**
     * ��ȡgetHotelInfoByCityResult���Ե�ֵ��
     * 
     */
    public int getGetHotelInfoByCityResult() {
        return getHotelInfoByCityResult;
    }

    /**
     * ����getHotelInfoByCityResult���Ե�ֵ��
     * 
     */
    public void setGetHotelInfoByCityResult(int value) {
        this.getHotelInfoByCityResult = value;
    }

    /**
     * ��ȡlstHotelInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCTHotelInfo }
     *     
     */
    public ArrayOfCTHotelInfo getLstHotelInfo() {
        return lstHotelInfo;
    }

    /**
     * ����lstHotelInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCTHotelInfo }
     *     
     */
    public void setLstHotelInfo(ArrayOfCTHotelInfo value) {
        this.lstHotelInfo = value;
    }

}
