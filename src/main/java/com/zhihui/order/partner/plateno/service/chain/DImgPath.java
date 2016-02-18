
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DImgPath complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DImgPath">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nHotelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sImgPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nImgType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "DImgPath", propOrder = {
    "nHotelID",
    "sImgPath",
    "nImgType",
    "bKingID"
})
public class DImgPath {

    protected int nHotelID;
    protected String sImgPath;
    protected int nImgType;
    @XmlElement(name = "BKingID")
    protected int bKingID;

    /**
     * ��ȡnHotelID���Ե�ֵ��
     * 
     */
    public int getNHotelID() {
        return nHotelID;
    }

    /**
     * ����nHotelID���Ե�ֵ��
     * 
     */
    public void setNHotelID(int value) {
        this.nHotelID = value;
    }

    /**
     * ��ȡsImgPath���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSImgPath() {
        return sImgPath;
    }

    /**
     * ����sImgPath���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSImgPath(String value) {
        this.sImgPath = value;
    }

    /**
     * ��ȡnImgType���Ե�ֵ��
     * 
     */
    public int getNImgType() {
        return nImgType;
    }

    /**
     * ����nImgType���Ե�ֵ��
     * 
     */
    public void setNImgType(int value) {
        this.nImgType = value;
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
