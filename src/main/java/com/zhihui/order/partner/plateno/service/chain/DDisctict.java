
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DDisctict complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DDisctict">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sGJCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sHCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sFJC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sDTZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DDisctict", propOrder = {
    "sgjcz",
    "shcz",
    "sfjc",
    "sdtz"
})
public class DDisctict {

    @XmlElement(name = "sGJCZ")
    protected String sgjcz;
    @XmlElement(name = "sHCZ")
    protected String shcz;
    @XmlElement(name = "sFJC")
    protected String sfjc;
    @XmlElement(name = "sDTZ")
    protected String sdtz;

    /**
     * ��ȡsgjcz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGJCZ() {
        return sgjcz;
    }

    /**
     * ����sgjcz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGJCZ(String value) {
        this.sgjcz = value;
    }

    /**
     * ��ȡshcz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHCZ() {
        return shcz;
    }

    /**
     * ����shcz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHCZ(String value) {
        this.shcz = value;
    }

    /**
     * ��ȡsfjc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFJC() {
        return sfjc;
    }

    /**
     * ����sfjc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFJC(String value) {
        this.sfjc = value;
    }

    /**
     * ��ȡsdtz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDTZ() {
        return sdtz;
    }

    /**
     * ����sdtz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDTZ(String value) {
        this.sdtz = value;
    }

}
