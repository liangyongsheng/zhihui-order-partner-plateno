
package com.zhihui.order.partner.plateno.service.book;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.zhihui.order.partner.plateno.service.book.sub.AccTrans;


/**
 * <p>ArrayOfAccTrans complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAccTrans">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccTrans" type="{http://RoomBookService.7daysinn.cn}AccTrans" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccTrans", propOrder = {
    "accTrans"
})
public class ArrayOfAccTrans {

    @XmlElement(name = "AccTrans", nillable = true)
    protected List<AccTrans> accTrans;

    /**
     * Gets the value of the accTrans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accTrans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccTrans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccTrans }
     * 
     * 
     */
    public List<AccTrans> getAccTrans() {
        if (accTrans == null) {
            accTrans = new ArrayList<AccTrans>();
        }
        return this.accTrans;
    }

}
