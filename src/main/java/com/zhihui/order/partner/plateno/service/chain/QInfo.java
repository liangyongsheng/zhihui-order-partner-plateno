
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="QInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ActName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BKingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QInfo", propOrder = {
    "actID",
    "actName",
    "bKingID"
})
public class QInfo {

    @XmlElement(name = "ActID")
    protected int actID;
    @XmlElement(name = "ActName")
    protected String actName;
    @XmlElement(name = "BKingID")
    protected int bKingID;

    /**
     * ��ȡactID���Ե�ֵ��
     * 
     */
    public int getActID() {
        return actID;
    }

    /**
     * ����actID���Ե�ֵ��
     * 
     */
    public void setActID(int value) {
        this.actID = value;
    }

    /**
     * ��ȡactName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActName() {
        return actName;
    }

    /**
     * ����actName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActName(String value) {
        this.actName = value;
    }

    /**
     * ��ȡbKingID���Ե�ֵ��
     * 
     */
    public int getBKingID() {
        return bKingID;
    }

    /**
     * ����bKingID���Ե�ֵ��
     * 
     */
    public void setBKingID(int value) {
        this.bKingID = value;
    }

}
