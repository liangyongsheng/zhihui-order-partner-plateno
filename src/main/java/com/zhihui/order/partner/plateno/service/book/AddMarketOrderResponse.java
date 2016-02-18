
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
 *         &lt;element name="AddMarketOrderResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookResponse" type="{http://www.7daysinn.cn/booking}ArrayOfResponseBookingInfo" minOccurs="0"/>
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
    "addMarketOrderResult",
    "bookResponse"
})
@XmlRootElement(name = "AddMarketOrderResponse")
public class AddMarketOrderResponse {

    @XmlElement(name = "AddMarketOrderResult")
    protected int addMarketOrderResult;
    @XmlElement(name = "BookResponse")
    protected ArrayOfResponseBookingInfo bookResponse;

    /**
     * ��ȡaddMarketOrderResult���Ե�ֵ��
     * 
     */
    public int getAddMarketOrderResult() {
        return addMarketOrderResult;
    }

    /**
     * ����addMarketOrderResult���Ե�ֵ��
     * 
     */
    public void setAddMarketOrderResult(int value) {
        this.addMarketOrderResult = value;
    }

    /**
     * ��ȡbookResponse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResponseBookingInfo }
     *     
     */
    public ArrayOfResponseBookingInfo getBookResponse() {
        return bookResponse;
    }

    /**
     * ����bookResponse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponseBookingInfo }
     *     
     */
    public void setBookResponse(ArrayOfResponseBookingInfo value) {
        this.bookResponse = value;
    }

}
