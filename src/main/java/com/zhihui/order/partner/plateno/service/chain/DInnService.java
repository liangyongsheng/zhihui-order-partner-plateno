
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DInnService complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DInnService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bDTSWJ" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bZZCFJ" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bZZXYJ" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bZZGXJ" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bYYZC" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bBJBZB" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bSWK" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DInnService", propOrder = {
    "bdtswj",
    "bzzcfj",
    "bzzxyj",
    "bzzgxj",
    "byyzc",
    "bbjbzb",
    "bswk"
})
public class DInnService {

    @XmlElement(name = "bDTSWJ")
    protected boolean bdtswj;
    @XmlElement(name = "bZZCFJ")
    protected boolean bzzcfj;
    @XmlElement(name = "bZZXYJ")
    protected boolean bzzxyj;
    @XmlElement(name = "bZZGXJ")
    protected boolean bzzgxj;
    @XmlElement(name = "bYYZC")
    protected boolean byyzc;
    @XmlElement(name = "bBJBZB")
    protected boolean bbjbzb;
    @XmlElement(name = "bSWK")
    protected boolean bswk;

    /**
     * 获取bdtswj属性的值。
     * 
     */
    public boolean isBDTSWJ() {
        return bdtswj;
    }

    /**
     * 设置bdtswj属性的值。
     * 
     */
    public void setBDTSWJ(boolean value) {
        this.bdtswj = value;
    }

    /**
     * 获取bzzcfj属性的值。
     * 
     */
    public boolean isBZZCFJ() {
        return bzzcfj;
    }

    /**
     * 设置bzzcfj属性的值。
     * 
     */
    public void setBZZCFJ(boolean value) {
        this.bzzcfj = value;
    }

    /**
     * 获取bzzxyj属性的值。
     * 
     */
    public boolean isBZZXYJ() {
        return bzzxyj;
    }

    /**
     * 设置bzzxyj属性的值。
     * 
     */
    public void setBZZXYJ(boolean value) {
        this.bzzxyj = value;
    }

    /**
     * 获取bzzgxj属性的值。
     * 
     */
    public boolean isBZZGXJ() {
        return bzzgxj;
    }

    /**
     * 设置bzzgxj属性的值。
     * 
     */
    public void setBZZGXJ(boolean value) {
        this.bzzgxj = value;
    }

    /**
     * 获取byyzc属性的值。
     * 
     */
    public boolean isBYYZC() {
        return byyzc;
    }

    /**
     * 设置byyzc属性的值。
     * 
     */
    public void setBYYZC(boolean value) {
        this.byyzc = value;
    }

    /**
     * 获取bbjbzb属性的值。
     * 
     */
    public boolean isBBJBZB() {
        return bbjbzb;
    }

    /**
     * 设置bbjbzb属性的值。
     * 
     */
    public void setBBJBZB(boolean value) {
        this.bbjbzb = value;
    }

    /**
     * 获取bswk属性的值。
     * 
     */
    public boolean isBSWK() {
        return bswk;
    }

    /**
     * 设置bswk属性的值。
     * 
     */
    public void setBSWK(boolean value) {
        this.bswk = value;
    }

}
