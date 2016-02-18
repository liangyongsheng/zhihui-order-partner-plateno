
package com.zhihui.order.partner.plateno.service.book;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>DForecastRoomStatusItem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DForecastRoomStatusItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndOfDay" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MebRoomRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RoomRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CanBookingNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DForecastRoomStatusItem", propOrder = {
    "endOfDay",
    "mebRoomRate",
    "roomRate",
    "canBookingNum"
})
public class DForecastRoomStatusItem {

    @XmlElement(name = "EndOfDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endOfDay;
    @XmlElement(name = "MebRoomRate", required = true)
    protected BigDecimal mebRoomRate;
    @XmlElement(name = "RoomRate", required = true)
    protected BigDecimal roomRate;
    @XmlElement(name = "CanBookingNum")
    protected int canBookingNum;

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
     * 获取roomRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoomRate() {
        return roomRate;
    }

    /**
     * 设置roomRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoomRate(BigDecimal value) {
        this.roomRate = value;
    }

    /**
     * 获取canBookingNum属性的值。
     * 
     */
    public int getCanBookingNum() {
        return canBookingNum;
    }

    /**
     * 设置canBookingNum属性的值。
     * 
     */
    public void setCanBookingNum(int value) {
        this.canBookingNum = value;
    }

}
