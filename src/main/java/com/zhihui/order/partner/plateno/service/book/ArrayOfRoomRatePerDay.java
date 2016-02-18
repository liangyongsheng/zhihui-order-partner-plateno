
package com.zhihui.order.partner.plateno.service.book;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfRoomRatePerDay complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoomRatePerDay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomRatePerDay" type="{http://www.7daysinn.cn/booking}RoomRatePerDay" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoomRatePerDay", propOrder = {
    "roomRatePerDay"
})
public class ArrayOfRoomRatePerDay {

    @XmlElement(name = "RoomRatePerDay", nillable = true)
    protected List<RoomRatePerDay> roomRatePerDay;

    /**
     * Gets the value of the roomRatePerDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomRatePerDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomRatePerDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomRatePerDay }
     * 
     * 
     */
    public List<RoomRatePerDay> getRoomRatePerDay() {
        if (roomRatePerDay == null) {
            roomRatePerDay = new ArrayList<RoomRatePerDay>();
        }
        return this.roomRatePerDay;
    }

}
