
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DRoomEquiment complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbmfkd���Ե�ֵ��
     * 
     */
    public boolean isBMFKD() {
        return bmfkd;
    }

    /**
     * ����bmfkd���Ե�ֵ��
     * 
     */
    public void setBMFKD(boolean value) {
        this.bmfkd = value;
    }

    /**
     * ��ȡbdh���Ե�ֵ��
     * 
     */
    public boolean isBDH() {
        return bdh;
    }

    /**
     * ����bdh���Ե�ֵ��
     * 
     */
    public void setBDH(boolean value) {
        this.bdh = value;
    }

    /**
     * ��ȡbyxds���Ե�ֵ��
     * 
     */
    public boolean isBYXDS() {
        return byxds;
    }

    /**
     * ����byxds���Ե�ֵ��
     * 
     */
    public void setBYXDS(boolean value) {
        this.byxds = value;
    }

    /**
     * ��ȡbdlxsj���Ե�ֵ��
     * 
     */
    public boolean isBDLXSJ() {
        return bdlxsj;
    }

    /**
     * ����bdlxsj���Ե�ֵ��
     * 
     */
    public void setBDLXSJ(boolean value) {
        this.bdlxsj = value;
    }

    /**
     * ��ȡblsgy���Ե�ֵ��
     * 
     */
    public boolean isBLSGY() {
        return blsgy;
    }

    /**
     * ����blsgy���Ե�ֵ��
     * 
     */
    public void setBLSGY(boolean value) {
        this.blsgy = value;
    }

    /**
     * ��ȡbkt���Ե�ֵ��
     * 
     */
    public boolean isBKT() {
        return bkt;
    }

    /**
     * ����bkt���Ե�ֵ��
     * 
     */
    public void setBKT(boolean value) {
        this.bkt = value;
    }

    /**
     * ��ȡbdsh���Ե�ֵ��
     * 
     */
    public boolean isBDSH() {
        return bdsh;
    }

    /**
     * ����bdsh���Ե�ֵ��
     * 
     */
    public void setBDSH(boolean value) {
        this.bdsh = value;
    }

    /**
     * ��ȡbdzms���Ե�ֵ��
     * 
     */
    public boolean isBDZMS() {
        return bdzms;
    }

    /**
     * ����bdzms���Ե�ֵ��
     * 
     */
    public void setBDZMS(boolean value) {
        this.bdzms = value;
    }

    /**
     * ��ȡbWiFi���Ե�ֵ��
     * 
     */
    public boolean isBWiFi() {
        return bWiFi;
    }

    /**
     * ����bWiFi���Ե�ֵ��
     * 
     */
    public void setBWiFi(boolean value) {
        this.bWiFi = value;
    }

}
