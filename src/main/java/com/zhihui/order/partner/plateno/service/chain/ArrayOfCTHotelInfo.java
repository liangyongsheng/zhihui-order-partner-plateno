
package com.zhihui.order.partner.plateno.service.chain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCTHotelInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCTHotelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CTHotelInfo" type="{http://www.7daysinn.cn/booking}CTHotelInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCTHotelInfo", propOrder = {
    "ctHotelInfo"
})
public class ArrayOfCTHotelInfo {

    @XmlElement(name = "CTHotelInfo", nillable = true)
    protected List<CTHotelInfo> ctHotelInfo;

    /**
     * Gets the value of the ctHotelInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctHotelInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCTHotelInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTHotelInfo }
     * 
     * 
     */
    public List<CTHotelInfo> getCTHotelInfo() {
        if (ctHotelInfo == null) {
            ctHotelInfo = new ArrayList<CTHotelInfo>();
        }
        return this.ctHotelInfo;
    }

}
