
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddAccTranResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addAccTranResult"
})
@XmlRootElement(name = "AddAccTranResponse")
public class AddAccTranResponse {

    @XmlElement(name = "AddAccTranResult")
    protected int addAccTranResult;

    /**
     * 获取addAccTranResult属性的值。
     * 
     */
    public int getAddAccTranResult() {
        return addAccTranResult;
    }

    /**
     * 设置addAccTranResult属性的值。
     * 
     */
    public void setAddAccTranResult(int value) {
        this.addAccTranResult = value;
    }

}
