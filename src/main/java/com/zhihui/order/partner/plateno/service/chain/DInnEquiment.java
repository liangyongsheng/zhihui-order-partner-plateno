
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DInnEquiment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DInnEquiment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bYL" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bYB" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InnService" type="{http://www.7daysinn.cn/booking}DInnService" minOccurs="0"/>
 *         &lt;element name="RoomEquiment" type="{http://www.7daysinn.cn/booking}DRoomEquiment" minOccurs="0"/>
 *         &lt;element name="Nearby" type="{http://www.7daysinn.cn/booking}DNearby" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DInnEquiment", propOrder = {
    "byl",
    "byb",
    "innService",
    "roomEquiment",
    "nearby"
})
public class DInnEquiment {

    @XmlElement(name = "bYL")
    protected boolean byl;
    @XmlElement(name = "bYB")
    protected boolean byb;
    @XmlElement(name = "InnService")
    protected DInnService innService;
    @XmlElement(name = "RoomEquiment")
    protected DRoomEquiment roomEquiment;
    @XmlElement(name = "Nearby")
    protected DNearby nearby;

    /**
     * 获取byl属性的值。
     * 
     */
    public boolean isBYL() {
        return byl;
    }

    /**
     * 设置byl属性的值。
     * 
     */
    public void setBYL(boolean value) {
        this.byl = value;
    }

    /**
     * 获取byb属性的值。
     * 
     */
    public boolean isBYB() {
        return byb;
    }

    /**
     * 设置byb属性的值。
     * 
     */
    public void setBYB(boolean value) {
        this.byb = value;
    }

    /**
     * 获取innService属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DInnService }
     *     
     */
    public DInnService getInnService() {
        return innService;
    }

    /**
     * 设置innService属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DInnService }
     *     
     */
    public void setInnService(DInnService value) {
        this.innService = value;
    }

    /**
     * 获取roomEquiment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DRoomEquiment }
     *     
     */
    public DRoomEquiment getRoomEquiment() {
        return roomEquiment;
    }

    /**
     * 设置roomEquiment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DRoomEquiment }
     *     
     */
    public void setRoomEquiment(DRoomEquiment value) {
        this.roomEquiment = value;
    }

    /**
     * 获取nearby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DNearby }
     *     
     */
    public DNearby getNearby() {
        return nearby;
    }

    /**
     * 设置nearby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DNearby }
     *     
     */
    public void setNearby(DNearby value) {
        this.nearby = value;
    }

}
