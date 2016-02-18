
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ComposeSearchInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取searchTime属性的值。
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
     * 设置searchTime属性的值。
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
     * 获取status属性的值。
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
     * 设置status属性的值。
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
     * 获取compose属性的值。
     * 
     */
    public boolean isCompose() {
        return compose;
    }

    /**
     * 设置compose属性的值。
     * 
     */
    public void setCompose(boolean value) {
        this.compose = value;
    }

}
