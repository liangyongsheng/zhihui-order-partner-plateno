
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DInnInfor complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DInnInfor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hotel_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InnID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sHotel_x" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sHotel_y" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sHotel_content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sHotel_notice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InnPosition" type="{http://www.7daysinn.cn/booking}DInnPosition" minOccurs="0"/>
 *         &lt;element name="InnEquiment" type="{http://www.7daysinn.cn/booking}DInnEquiment" minOccurs="0"/>
 *         &lt;element name="InnCommScore" type="{http://www.7daysinn.cn/booking}ArrayOfDInnCommScore" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DInnInfor", propOrder = {
    "hotelID",
    "innID",
    "sHotelX",
    "sHotelY",
    "sHotelContent",
    "sHotelNotice",
    "innPosition",
    "innEquiment",
    "innCommScore"
})
public class DInnInfor {

    @XmlElement(name = "Hotel_ID")
    protected int hotelID;
    @XmlElement(name = "InnID")
    protected int innID;
    @XmlElement(name = "sHotel_x")
    protected String sHotelX;
    @XmlElement(name = "sHotel_y")
    protected String sHotelY;
    @XmlElement(name = "sHotel_content")
    protected String sHotelContent;
    @XmlElement(name = "sHotel_notice")
    protected String sHotelNotice;
    @XmlElement(name = "InnPosition")
    protected DInnPosition innPosition;
    @XmlElement(name = "InnEquiment")
    protected DInnEquiment innEquiment;
    @XmlElement(name = "InnCommScore")
    protected ArrayOfDInnCommScore innCommScore;

    /**
     * ��ȡhotelID���Ե�ֵ��
     * 
     */
    public int getHotelID() {
        return hotelID;
    }

    /**
     * ����hotelID���Ե�ֵ��
     * 
     */
    public void setHotelID(int value) {
        this.hotelID = value;
    }

    /**
     * ��ȡinnID���Ե�ֵ��
     * 
     */
    public int getInnID() {
        return innID;
    }

    /**
     * ����innID���Ե�ֵ��
     * 
     */
    public void setInnID(int value) {
        this.innID = value;
    }

    /**
     * ��ȡsHotelX���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelX() {
        return sHotelX;
    }

    /**
     * ����sHotelX���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelX(String value) {
        this.sHotelX = value;
    }

    /**
     * ��ȡsHotelY���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelY() {
        return sHotelY;
    }

    /**
     * ����sHotelY���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelY(String value) {
        this.sHotelY = value;
    }

    /**
     * ��ȡsHotelContent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelContent() {
        return sHotelContent;
    }

    /**
     * ����sHotelContent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelContent(String value) {
        this.sHotelContent = value;
    }

    /**
     * ��ȡsHotelNotice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHotelNotice() {
        return sHotelNotice;
    }

    /**
     * ����sHotelNotice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHotelNotice(String value) {
        this.sHotelNotice = value;
    }

    /**
     * ��ȡinnPosition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DInnPosition }
     *     
     */
    public DInnPosition getInnPosition() {
        return innPosition;
    }

    /**
     * ����innPosition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DInnPosition }
     *     
     */
    public void setInnPosition(DInnPosition value) {
        this.innPosition = value;
    }

    /**
     * ��ȡinnEquiment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DInnEquiment }
     *     
     */
    public DInnEquiment getInnEquiment() {
        return innEquiment;
    }

    /**
     * ����innEquiment���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DInnEquiment }
     *     
     */
    public void setInnEquiment(DInnEquiment value) {
        this.innEquiment = value;
    }

    /**
     * ��ȡinnCommScore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDInnCommScore }
     *     
     */
    public ArrayOfDInnCommScore getInnCommScore() {
        return innCommScore;
    }

    /**
     * ����innCommScore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDInnCommScore }
     *     
     */
    public void setInnCommScore(ArrayOfDInnCommScore value) {
        this.innCommScore = value;
    }

}
