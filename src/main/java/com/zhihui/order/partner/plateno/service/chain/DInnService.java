
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DInnService complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbdtswj���Ե�ֵ��
     * 
     */
    public boolean isBDTSWJ() {
        return bdtswj;
    }

    /**
     * ����bdtswj���Ե�ֵ��
     * 
     */
    public void setBDTSWJ(boolean value) {
        this.bdtswj = value;
    }

    /**
     * ��ȡbzzcfj���Ե�ֵ��
     * 
     */
    public boolean isBZZCFJ() {
        return bzzcfj;
    }

    /**
     * ����bzzcfj���Ե�ֵ��
     * 
     */
    public void setBZZCFJ(boolean value) {
        this.bzzcfj = value;
    }

    /**
     * ��ȡbzzxyj���Ե�ֵ��
     * 
     */
    public boolean isBZZXYJ() {
        return bzzxyj;
    }

    /**
     * ����bzzxyj���Ե�ֵ��
     * 
     */
    public void setBZZXYJ(boolean value) {
        this.bzzxyj = value;
    }

    /**
     * ��ȡbzzgxj���Ե�ֵ��
     * 
     */
    public boolean isBZZGXJ() {
        return bzzgxj;
    }

    /**
     * ����bzzgxj���Ե�ֵ��
     * 
     */
    public void setBZZGXJ(boolean value) {
        this.bzzgxj = value;
    }

    /**
     * ��ȡbyyzc���Ե�ֵ��
     * 
     */
    public boolean isBYYZC() {
        return byyzc;
    }

    /**
     * ����byyzc���Ե�ֵ��
     * 
     */
    public void setBYYZC(boolean value) {
        this.byyzc = value;
    }

    /**
     * ��ȡbbjbzb���Ե�ֵ��
     * 
     */
    public boolean isBBJBZB() {
        return bbjbzb;
    }

    /**
     * ����bbjbzb���Ե�ֵ��
     * 
     */
    public void setBBJBZB(boolean value) {
        this.bbjbzb = value;
    }

    /**
     * ��ȡbswk���Ե�ֵ��
     * 
     */
    public boolean isBSWK() {
        return bswk;
    }

    /**
     * ����bswk���Ե�ֵ��
     * 
     */
    public void setBSWK(boolean value) {
        this.bswk = value;
    }

}
