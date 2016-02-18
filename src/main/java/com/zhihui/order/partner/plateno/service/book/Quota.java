
package com.zhihui.order.partner.plateno.service.book;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Quota complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Quota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MebRoomRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DiscountRoomRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MarketActID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CanBookFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EndOfDay" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quota", propOrder = {
    "hotelID",
    "roomType",
    "roomTypeName",
    "mebRoomRate",
    "discountRoomRate",
    "marketActID",
    "canBookFlag",
    "endOfDay"
})
public class Quota {

    @XmlElement(name = "HotelID")
    protected int hotelID;
    @XmlElement(name = "RoomType")
    protected String roomType;
    @XmlElement(name = "RoomTypeName")
    protected String roomTypeName;
    @XmlElement(name = "MebRoomRate", required = true)
    protected BigDecimal mebRoomRate;
    @XmlElement(name = "DiscountRoomRate", required = true)
    protected BigDecimal discountRoomRate;
    @XmlElement(name = "MarketActID")
    protected int marketActID;
    @XmlElement(name = "CanBookFlag")
    protected boolean canBookFlag;
    @XmlElement(name = "EndOfDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endOfDay;

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
     * 获取roomType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * 设置roomType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * 获取roomTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeName() {
        return roomTypeName;
    }

    /**
     * 设置roomTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeName(String value) {
        this.roomTypeName = value;
    }

    /**
     * 获取mebRoomRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMebRoomRate() {
        return mebRoomRate;
    }

    /**
     * 设置mebRoomRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMebRoomRate(BigDecimal value) {
        this.mebRoomRate = value;
    }

    /**
     * 获取discountRoomRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountRoomRate() {
        return discountRoomRate;
    }

    /**
     * 设置discountRoomRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountRoomRate(BigDecimal value) {
        this.discountRoomRate = value;
    }

    /**
     * 获取marketActID属性的值。
     * 
     */
    public int getMarketActID() {
        return marketActID;
    }

    /**
     * 设置marketActID属性的值。
     * 
     */
    public void setMarketActID(int value) {
        this.marketActID = value;
    }

    /**
     * 获取canBookFlag属性的值。
     * 
     */
    public boolean isCanBookFlag() {
        return canBookFlag;
    }

    /**
     * 设置canBookFlag属性的值。
     * 
     */
    public void setCanBookFlag(boolean value) {
        this.canBookFlag = value;
    }

    /**
     * 获取endOfDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndOfDay() {
        return endOfDay;
    }

    /**
     * 设置endOfDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndOfDay(XMLGregorianCalendar value) {
        this.endOfDay = value;
    }

}
