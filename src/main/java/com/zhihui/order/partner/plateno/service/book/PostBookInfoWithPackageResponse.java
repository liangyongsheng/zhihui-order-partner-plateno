
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
     * 获取postBookInfoWithPackageResult属性的值。
     * 
     */
    public int getPostBookInfoWithPackageResult() {
        return postBookInfoWithPackageResult;
    }

    /**
     * 设置postBookInfoWithPackageResult属性的值。
     * 
     */
    public void setPostBookInfoWithPackageResult(int value) {
        this.postBookInfoWithPackageResult = value;
    }

    /**
     * 获取bookResponse属性的值。
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
     * 设置bookResponse属性的值。
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
