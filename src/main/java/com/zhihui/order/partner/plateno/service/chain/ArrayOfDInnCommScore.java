
package com.zhihui.order.partner.plateno.service.chain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDInnCommScore complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDInnCommScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DInnCommScore" type="{http://www.7daysinn.cn/booking}DInnCommScore" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDInnCommScore", propOrder = {
    "dInnCommScore"
})
public class ArrayOfDInnCommScore {

    @XmlElement(name = "DInnCommScore", nillable = true)
    protected List<DInnCommScore> dInnCommScore;

    /**
     * Gets the value of the dInnCommScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dInnCommScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDInnCommScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DInnCommScore }
     * 
     * 
     */
    public List<DInnCommScore> getDInnCommScore() {
        if (dInnCommScore == null) {
            dInnCommScore = new ArrayList<DInnCommScore>();
        }
        return this.dInnCommScore;
    }

}
