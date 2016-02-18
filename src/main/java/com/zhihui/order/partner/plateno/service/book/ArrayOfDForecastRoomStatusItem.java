
package com.zhihui.order.partner.plateno.service.book;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDForecastRoomStatusItem complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDForecastRoomStatusItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DForecastRoomStatusItem" type="{http://www.7daysinn.cn/booking}DForecastRoomStatusItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDForecastRoomStatusItem", propOrder = {
    "dForecastRoomStatusItem"
})
public class ArrayOfDForecastRoomStatusItem {

    @XmlElement(name = "DForecastRoomStatusItem", nillable = true)
    protected List<DForecastRoomStatusItem> dForecastRoomStatusItem;

    /**
     * Gets the value of the dForecastRoomStatusItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dForecastRoomStatusItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDForecastRoomStatusItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DForecastRoomStatusItem }
     * 
     * 
     */
    public List<DForecastRoomStatusItem> getDForecastRoomStatusItem() {
        if (dForecastRoomStatusItem == null) {
            dForecastRoomStatusItem = new ArrayList<DForecastRoomStatusItem>();
        }
        return this.dForecastRoomStatusItem;
    }

}