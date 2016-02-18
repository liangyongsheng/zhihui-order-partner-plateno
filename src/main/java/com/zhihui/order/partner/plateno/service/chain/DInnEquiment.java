
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DInnEquiment complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbyl���Ե�ֵ��
     * 
     */
    public boolean isBYL() {
        return byl;
    }

    /**
     * ����byl���Ե�ֵ��
     * 
     */
    public void setBYL(boolean value) {
        this.byl = value;
    }

    /**
     * ��ȡbyb���Ե�ֵ��
     * 
     */
    public boolean isBYB() {
        return byb;
    }

    /**
     * ����byb���Ե�ֵ��
     * 
     */
    public void setBYB(boolean value) {
        this.byb = value;
    }

    /**
     * ��ȡinnService���Ե�ֵ��
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
     * ����innService���Ե�ֵ��
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
     * ��ȡroomEquiment���Ե�ֵ��
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
     * ����roomEquiment���Ե�ֵ��
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
     * ��ȡnearby���Ե�ֵ��
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
     * ����nearby���Ե�ֵ��
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
