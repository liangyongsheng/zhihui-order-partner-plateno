
package com.zhihui.order.partner.plateno.service.book;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Quota complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡroomType���Ե�ֵ��
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
     * ����roomType���Ե�ֵ��
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
     * ��ȡroomTypeName���Ե�ֵ��
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
     * ����roomTypeName���Ե�ֵ��
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
     * ��ȡmebRoomRate���Ե�ֵ��
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
     * ����mebRoomRate���Ե�ֵ��
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
     * ��ȡdiscountRoomRate���Ե�ֵ��
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
     * ����discountRoomRate���Ե�ֵ��
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
     * ��ȡmarketActID���Ե�ֵ��
     * 
     */
    public int getMarketActID() {
        return marketActID;
    }

    /**
     * ����marketActID���Ե�ֵ��
     * 
     */
    public void setMarketActID(int value) {
        this.marketActID = value;
    }

    /**
     * ��ȡcanBookFlag���Ե�ֵ��
     * 
     */
    public boolean isCanBookFlag() {
        return canBookFlag;
    }

    /**
     * ����canBookFlag���Ե�ֵ��
     * 
     */
    public void setCanBookFlag(boolean value) {
        this.canBookFlag = value;
    }

    /**
     * ��ȡendOfDay���Ե�ֵ��
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
     * ����endOfDay���Ե�ֵ��
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
