
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
 *         &lt;element name="GetAccTranInfoResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lst" type="{http://www.7daysinn.cn/booking}ArrayOfAccTrans" minOccurs="0"/>
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
    "getAccTranInfoResult",
    "lst"
})
@XmlRootElement(name = "GetAccTranInfoResponse")
public class GetAccTranInfoResponse {

    @XmlElement(name = "GetAccTranInfoResult")
    protected int getAccTranInfoResult;
    protected ArrayOfAccTrans lst;

    /**
     * 获取getAccTranInfoResult属性的值。
     * 
     */
    public int getGetAccTranInfoResult() {
        return getAccTranInfoResult;
    }

    /**
     * 设置getAccTranInfoResult属性的值。
     * 
     */
    public void setGetAccTranInfoResult(int value) {
        this.getAccTranInfoResult = value;
    }

    /**
     * 获取lst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccTrans }
     *     
     */
    public ArrayOfAccTrans getLst() {
        return lst;
    }

    /**
     * 设置lst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccTrans }
     *     
     */
    public void setLst(ArrayOfAccTrans value) {
        this.lst = value;
    }

}
