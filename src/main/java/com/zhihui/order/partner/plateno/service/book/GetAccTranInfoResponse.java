
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
     * ��ȡgetAccTranInfoResult���Ե�ֵ��
     * 
     */
    public int getGetAccTranInfoResult() {
        return getAccTranInfoResult;
    }

    /**
     * ����getAccTranInfoResult���Ե�ֵ��
     * 
     */
    public void setGetAccTranInfoResult(int value) {
        this.getAccTranInfoResult = value;
    }

    /**
     * ��ȡlst���Ե�ֵ��
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
     * ����lst���Ե�ֵ��
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
