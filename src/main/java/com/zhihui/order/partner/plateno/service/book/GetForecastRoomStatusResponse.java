
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取getForecastRoomStatusResult属性的值。
     * 
     */
    public int getGetForecastRoomStatusResult() {
        return getForecastRoomStatusResult;
    }

    /**
     * 设置getForecastRoomStatusResult属性的值。
     * 
     */
    public void setGetForecastRoomStatusResult(int value) {
        this.getForecastRoomStatusResult = value;
    }

    /**
     * 获取lstForecastRoomStatus属性的值。
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
     * 设置lstForecastRoomStatus属性的值。
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
