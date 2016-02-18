
package com.zhihui.order.partner.plateno.service.book;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDForecastRoomStatus complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDForecastRoomStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DForecastRoomStatus" type="{http://www.7daysinn.cn/booking}DForecastRoomStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDForecastRoomStatus", propOrder = {
    "dForecastRoomStatus"
})
public class ArrayOfDForecastRoomStatus {

    @XmlElement(name = "DForecastRoomStatus", nillable = true)
    protected List<DForecastRoomStatus> dForecastRoomStatus;

    /**
     * Gets the value of the dForecastRoomStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dForecastRoomStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDForecastRoomStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DForecastRoomStatus }
     * 
     * 
     */
    public List<DForecastRoomStatus> getDForecastRoomStatus() {
        if (dForecastRoomStatus == null) {
            dForecastRoomStatus = new ArrayList<DForecastRoomStatus>();
        }
        return this.dForecastRoomStatus;
    }

}
