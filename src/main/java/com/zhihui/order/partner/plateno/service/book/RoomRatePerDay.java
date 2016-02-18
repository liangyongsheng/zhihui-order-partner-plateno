
package com.zhihui.order.partner.plateno.service.book;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>RoomRatePerDay complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RoomRatePerDay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "RoomRatePerDay", propOrder = {
    "roomRate",
    "endOfDay"
})
public class RoomRatePerDay {

    @XmlElement(name = "RoomRate", required = true)
    protected BigDecimal roomRate;
    @XmlElement(name = "EndOfDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endOfDay;

    /**
     * ��ȡroomRate���Ե�ֵ��
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
     * ����roomRate���Ե�ֵ��
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
