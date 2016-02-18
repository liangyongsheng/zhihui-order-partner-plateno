
package com.zhihui.order.partner.plateno.service.book;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDRequestBookingGuest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDRequestBookingGuest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DRequestBookingGuest" type="{http://www.7daysinn.cn/booking}DRequestBookingGuest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDRequestBookingGuest", propOrder = {
    "dRequestBookingGuest"
})
public class ArrayOfDRequestBookingGuest {

    @XmlElement(name = "DRequestBookingGuest", nillable = true)
    protected List<DRequestBookingGuest> dRequestBookingGuest;

    /**
     * Gets the value of the dRequestBookingGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dRequestBookingGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDRequestBookingGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DRequestBookingGuest }
     * 
     * 
     */
    public List<DRequestBookingGuest> getDRequestBookingGuest() {
        if (dRequestBookingGuest == null) {
            dRequestBookingGuest = new ArrayList<DRequestBookingGuest>();
        }
        return this.dRequestBookingGuest;
    }

}
