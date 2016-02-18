
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ComposeSearchInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ComposeSearchInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Status" type="{http://www.7daysinn.cn/booking}CTStatusType"/>
 *         &lt;element name="Compose" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComposeSearchInfo", propOrder = {
    "searchTime",
    "status",
    "compose"
})
public class ComposeSearchInfo {

    @XmlElement(name = "SearchTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchTime;
    @XmlElement(name = "Status", required = true)
    protected CTStatusType status;
    @XmlElement(name = "Compose")
    protected boolean compose;

    /**
     * ��ȡsearchTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchTime() {
        return searchTime;
    }

    /**
     * ����searchTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchTime(XMLGregorianCalendar value) {
        this.searchTime = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CTStatusType }
     *     
     */
    public CTStatusType getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CTStatusType }
     *     
     */
    public void setStatus(CTStatusType value) {
        this.status = value;
    }

    /**
     * ��ȡcompose���Ե�ֵ��
     * 
     */
    public boolean isCompose() {
        return compose;
    }

    /**
     * ����compose���Ե�ֵ��
     * 
     */
    public void setCompose(boolean value) {
        this.compose = value;
    }

}
