
package com.zhihui.order.partner.plateno.service.book;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfArrayOfDRequestBookingGuest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfDRequestBookingGuest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfDRequestBookingGuest" type="{http://www.7daysinn.cn/booking}ArrayOfDRequestBookingGuest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfDRequestBookingGuest", propOrder = {
    "arrayOfDRequestBookingGuest"
})
public class ArrayOfArrayOfDRequestBookingGuest {

    @XmlElement(name = "ArrayOfDRequestBookingGuest", nillable = true)
    protected List<ArrayOfDRequestBookingGuest> arrayOfDRequestBookingGuest;

    /**
     * Gets the value of the arrayOfDRequestBookingGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfDRequestBookingGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfDRequestBookingGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfDRequestBookingGuest }
     * 
     * 
     */
    public List<ArrayOfDRequestBookingGuest> getArrayOfDRequestBookingGuest() {
        if (arrayOfDRequestBookingGuest == null) {
            arrayOfDRequestBookingGuest = new ArrayList<ArrayOfDRequestBookingGuest>();
        }
        return this.arrayOfDRequestBookingGuest;
    }

}
