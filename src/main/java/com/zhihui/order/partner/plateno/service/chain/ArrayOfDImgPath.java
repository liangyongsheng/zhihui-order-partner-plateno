
package com.zhihui.order.partner.plateno.service.chain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfDImgPath complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDImgPath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DImgPath" type="{http://www.7daysinn.cn/booking}DImgPath" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDImgPath", propOrder = {
    "dImgPath"
})
public class ArrayOfDImgPath {

    @XmlElement(name = "DImgPath", nillable = true)
    protected List<DImgPath> dImgPath;

    /**
     * Gets the value of the dImgPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dImgPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDImgPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DImgPath }
     * 
     * 
     */
    public List<DImgPath> getDImgPath() {
        if (dImgPath == null) {
            dImgPath = new ArrayList<DImgPath>();
        }
        return this.dImgPath;
    }

}
