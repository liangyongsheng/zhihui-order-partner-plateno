
package com.zhihui.order.partner.plateno.service.chain;

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
     * 获取getHotelInfoByCityResult属性的值。
     * 
     */
    public int getGetHotelInfoByCityResult() {
        return getHotelInfoByCityResult;
    }

    /**
     * 设置getHotelInfoByCityResult属性的值。
     * 
     */
    public void setGetHotelInfoByCityResult(int value) {
        this.getHotelInfoByCityResult = value;
    }

    /**
     * 获取lstHotelInfo属性的值。
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
     * 设置lstHotelInfo属性的值。
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
