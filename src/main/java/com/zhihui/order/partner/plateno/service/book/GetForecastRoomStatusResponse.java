
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
 *         &lt;element name="GetForecastRoomStatusResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lstForecastRoomStatus" type="{http://www.7daysinn.cn/booking}ArrayOfDForecastRoomStatus" minOccurs="0"/>
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
    "getForecastRoomStatusResult",
    "lstForecastRoomStatus"
})
@XmlRootElement(name = "GetForecastRoomStatusResponse")
public class GetForecastRoomStatusResponse {

    @XmlElement(name = "GetForecastRoomStatusResult")
    protected int getForecastRoomStatusResult;
    protected ArrayOfDForecastRoomStatus lstForecastRoomStatus;

    /**
     * ��ȡgetForecastRoomStatusResult���Ե�ֵ��
     * 
     */
    public int getGetForecastRoomStatusResult() {
        return getForecastRoomStatusResult;
    }

    /**
     * ����getForecastRoomStatusResult���Ե�ֵ��
     * 
     */
    public void setGetForecastRoomStatusResult(int value) {
        this.getForecastRoomStatusResult = value;
    }

    /**
     * ��ȡlstForecastRoomStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDForecastRoomStatus }
     *     
     */
    public ArrayOfDForecastRoomStatus getLstForecastRoomStatus() {
        return lstForecastRoomStatus;
    }

    /**
     * ����lstForecastRoomStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDForecastRoomStatus }
     *     
     */
    public void setLstForecastRoomStatus(ArrayOfDForecastRoomStatus value) {
        this.lstForecastRoomStatus = value;
    }

}
