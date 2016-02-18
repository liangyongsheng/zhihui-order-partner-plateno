
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DInnInfor complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取hotelID属性的值。
     * 
     */
    public int getHotelID() {
        return hotelID;
    }

    /**
     * 设置hotelID属性的值。
     * 
     */
    public void setHotelID(int value) {
        this.hotelID = value;
    }

    /**
     * 获取innID属性的值。
     * 
     */
    public int getInnID() {
        return innID;
    }

    /**
     * 设置innID属性的值。
     * 
     */
    public void setInnID(int value) {
        this.innID = value;
    }

    /**
     * 获取sHotelX属性的值。
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
     * 设置sHotelX属性的值。
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
     * 获取sHotelY属性的值。
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
     * 设置sHotelY属性的值。
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
     * 获取sHotelContent属性的值。
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
     * 设置sHotelContent属性的值。
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
     * 获取sHotelNotice属性的值。
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
     * 设置sHotelNotice属性的值。
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
     * 获取innPosition属性的值。
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
     * 设置innPosition属性的值。
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
     * 获取innEquiment属性的值。
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
     * 设置innEquiment属性的值。
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
     * 获取innCommScore属性的值。
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
     * 设置innCommScore属性的值。
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
