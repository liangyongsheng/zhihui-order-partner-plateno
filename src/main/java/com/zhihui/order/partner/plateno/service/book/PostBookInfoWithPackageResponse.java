
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
 *         &lt;element name="PostBookInfoWithPackageResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "postBookInfoWithPackageResult",
    "bookResponse"
})
@XmlRootElement(name = "PostBookInfoWithPackageResponse")
public class PostBookInfoWithPackageResponse {

    @XmlElement(name = "PostBookInfoWithPackageResult")
    protected int postBookInfoWithPackageResult;
    protected ArrayOfDResponseBookingResult bookResponse;

    /**
     * ��ȡpostBookInfoWithPackageResult���Ե�ֵ��
     * 
     */
    public int getPostBookInfoWithPackageResult() {
        return postBookInfoWithPackageResult;
    }

    /**
     * ����postBookInfoWithPackageResult���Ե�ֵ��
     * 
     */
    public void setPostBookInfoWithPackageResult(int value) {
        this.postBookInfoWithPackageResult = value;
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