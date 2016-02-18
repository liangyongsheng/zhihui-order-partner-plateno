
package com.zhihui.order.partner.plateno.service.book;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDResponseBookingResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDResponseBookingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DResponseBookingResult" type="{http://www.7daysinn.cn/booking}DResponseBookingResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDResponseBookingResult", propOrder = {
    "dResponseBookingResult"
})
public class ArrayOfDResponseBookingResult {

    @XmlElement(name = "DResponseBookingResult", nillable = true)
    protected List<DResponseBookingResult> dResponseBookingResult;

    /**
     * Gets the value of the dResponseBookingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dResponseBookingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDResponseBookingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DResponseBookingResult }
     * 
     * 
     */
    public List<DResponseBookingResult> getDResponseBookingResult() {
        if (dResponseBookingResult == null) {
            dResponseBookingResult = new ArrayList<DResponseBookingResult>();
        }
        return this.dResponseBookingResult;
    }

}
