
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DRoomEquiment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DRoomEquiment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bMFKD" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bDH" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bYXDS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bDLXSJ" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bLSGY" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bKT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bDSH" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bDZMS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bWiFi" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DRoomEquiment", propOrder = {
    "bmfkd",
    "bdh",
    "byxds",
    "bdlxsj",
    "blsgy",
    "bkt",
    "bdsh",
    "bdzms",
    "bWiFi"
})
public class DRoomEquiment {

    @XmlElement(name = "bMFKD")
    protected boolean bmfkd;
    @XmlElement(name = "bDH")
    protected boolean bdh;
    @XmlElement(name = "bYXDS")
    protected boolean byxds;
    @XmlElement(name = "bDLXSJ")
    protected boolean bdlxsj;
    @XmlElement(name = "bLSGY")
    protected boolean blsgy;
    @XmlElement(name = "bKT")
    protected boolean bkt;
    @XmlElement(name = "bDSH")
    protected boolean bdsh;
    @XmlElement(name = "bDZMS")
    protected boolean bdzms;
    protected boolean bWiFi;

    /**
     * 获取bmfkd属性的值。
     * 
     */
    public boolean isBMFKD() {
        return bmfkd;
    }

    /**
     * 设置bmfkd属性的值。
     * 
     */
    public void setBMFKD(boolean value) {
        this.bmfkd = value;
    }

    /**
     * 获取bdh属性的值。
     * 
     */
    public boolean isBDH() {
        return bdh;
    }

    /**
     * 设置bdh属性的值。
     * 
     */
    public void setBDH(boolean value) {
        this.bdh = value;
    }

    /**
     * 获取byxds属性的值。
     * 
     */
    public boolean isBYXDS() {
        return byxds;
    }

    /**
     * 设置byxds属性的值。
     * 
     */
    public void setBYXDS(boolean value) {
        this.byxds = value;
    }

    /**
     * 获取bdlxsj属性的值。
     * 
     */
    public boolean isBDLXSJ() {
        return bdlxsj;
    }

    /**
     * 设置bdlxsj属性的值。
     * 
     */
    public void setBDLXSJ(boolean value) {
        this.bdlxsj = value;
    }

    /**
     * 获取blsgy属性的值。
     * 
     */
    public boolean isBLSGY() {
        return blsgy;
    }

    /**
     * 设置blsgy属性的值。
     * 
     */
    public void setBLSGY(boolean value) {
        this.blsgy = value;
    }

    /**
     * 获取bkt属性的值。
     * 
     */
    public boolean isBKT() {
        return bkt;
    }

    /**
     * 设置bkt属性的值。
     * 
     */
    public void setBKT(boolean value) {
        this.bkt = value;
    }

    /**
     * 获取bdsh属性的值。
     * 
     */
    public boolean isBDSH() {
        return bdsh;
    }

    /**
     * 设置bdsh属性的值。
     * 
     */
    public void setBDSH(boolean value) {
        this.bdsh = value;
    }

    /**
     * 获取bdzms属性的值。
     * 
     */
    public boolean isBDZMS() {
        return bdzms;
    }

    /**
     * 设置bdzms属性的值。
     * 
     */
    public void setBDZMS(boolean value) {
        this.bdzms = value;
    }

    /**
     * 获取bWiFi属性的值。
     * 
     */
    public boolean isBWiFi() {
        return bWiFi;
    }

    /**
     * 设置bWiFi属性的值。
     * 
     */
    public void setBWiFi(boolean value) {
        this.bWiFi = value;
    }

}
