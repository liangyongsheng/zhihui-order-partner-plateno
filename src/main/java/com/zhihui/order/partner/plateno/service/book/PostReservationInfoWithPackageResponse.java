
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
 *         &lt;element name="PostReservationInfoWithPackageResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bookResponse" type="{http://www.7daysinn.cn/booking}ArrayOfDResponseBookingResult" minOccurs="0"/>
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
    "postReservationInfoWithPackageResult",
    "bookResponse"
})
@XmlRootElement(name = "PostReservationInfoWithPackageResponse")
public class PostReservationInfoWithPackageResponse {

    @XmlElement(name = "PostReservationInfoWithPackageResult")
    protected int postReservationInfoWithPackageResult;
    protected ArrayOfDResponseBookingResult bookResponse;

    /**
     * ��ȡpostReservationInfoWithPackageResult���Ե�ֵ��
     * 
     */
    public int getPostReservationInfoWithPackageResult() {
        return postReservationInfoWithPackageResult;
    }

    /**
     * ����postReservationInfoWithPackageResult���Ե�ֵ��
     * 
     */
    public void setPostReservationInfoWithPackageResult(int value) {
        this.postReservationInfoWithPackageResult = value;
    }

    /**
     * ��ȡbookResponse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDResponseBookingResult }
     *     
     */
    public ArrayOfDResponseBookingResult getBookResponse() {
        return bookResponse;
    }

    /**
     * ����bookResponse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDResponseBookingResult }
     *     
     */
    public void setBookResponse(ArrayOfDResponseBookingResult value) {
        this.bookResponse = value;
    }

}
