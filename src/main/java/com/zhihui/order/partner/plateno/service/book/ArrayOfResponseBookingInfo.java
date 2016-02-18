
package com.zhihui.order.partner.plateno.service.book;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfResponseBookingInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfResponseBookingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponseBookingInfo" type="{http://www.7daysinn.cn/booking}ResponseBookingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfResponseBookingInfo", propOrder = {
    "responseBookingInfo"
})
public class ArrayOfResponseBookingInfo {

    @XmlElement(name = "ResponseBookingInfo", nillable = true)
    protected List<ResponseBookingInfo> responseBookingInfo;

    /**
     * Gets the value of the responseBookingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseBookingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseBookingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseBookingInfo }
     * 
     * 
     */
    public List<ResponseBookingInfo> getResponseBookingInfo() {
        if (responseBookingInfo == null) {
            responseBookingInfo = new ArrayList<ResponseBookingInfo>();
        }
        return this.responseBookingInfo;
    }

}
