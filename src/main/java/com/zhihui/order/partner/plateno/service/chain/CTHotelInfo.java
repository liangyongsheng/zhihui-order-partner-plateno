
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CTHotelInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CTHotelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MapURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sFaxphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nHotelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nOfficeHotelID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nBrandID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="objDInnInfor" type="{http://www.7daysinn.cn/booking}DInnInfor" minOccurs="0"/>
 *         &lt;element name="lstDImgPath" type="{http://www.7daysinn.cn/booking}ArrayOfDImgPath" minOccurs="0"/>
 *         &lt;element name="lstQInfo" type="{http://www.7daysinn.cn/booking}ArrayOfQInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTHotelInfo", propOrder = {
    "mapURL",
    "forCity",
    "sName",
    "sAddress",
    "sTelephone",
    "sFaxphone",
    "nHotelID",
    "nOfficeHotelID",
    "nBrandID",
    "objDInnInfor",
    "lstDImgPath",
    "lstQInfo"
})
public class CTHotelInfo {

    @XmlElement(name = "MapURL")
    protected String mapURL;
    @XmlElement(name = "ForCity")
    protected String forCity;
    protected String sName;
    protected String sAddress;
    protected String sTelephone;
    protected String sFaxphone;
    protected int nHotelID;
    protected int nOfficeHotelID;
    protected int nBrandID;
    protected DInnInfor objDInnInfor;
    protected ArrayOfDImgPath lstDImgPath;
    protected ArrayOfQInfo lstQInfo;

    /**
     * 获取mapURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapURL() {
        return mapURL;
    }

    /**
     * 设置mapURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapURL(String value) {
        this.mapURL = value;
    }

    /**
     * 获取forCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForCity() {
        return forCity;
    }

    /**
     * 设置forCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForCity(String value) {
        this.forCity = value;
    }

    /**
     * 获取sName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSName() {
        return sName;
    }

    /**
     * 设置sName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSName(String value) {
        this.sName = value;
    }

    /**
     * 获取sAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAddress() {
        return sAddress;
    }

    /**
     * 设置sAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAddress(String value) {
        this.sAddress = value;
    }

    /**
     * 获取sTelephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTelephone() {
        return sTelephone;
    }

    /**
     * 设置sTelephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTelephone(String value) {
        this.sTelephone = value;
    }

    /**
     * 获取sFaxphone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSFaxphone() {
        return sFaxphone;
    }

    /**
     * 设置sFaxphone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSFaxphone(String value) {
        this.sFaxphone = value;
    }

    /**
     * 获取nHotelID属性的值。
     * 
     */
    public int getNHotelID() {
        return nHotelID;
    }

    /**
     * 设置nHotelID属性的值。
     * 
     */
    public void setNHotelID(int value) {
        this.nHotelID = value;
    }

    /**
     * 获取nOfficeHotelID属性的值。
     * 
     */
    public int getNOfficeHotelID() {
        return nOfficeHotelID;
    }

    /**
     * 设置nOfficeHotelID属性的值。
     * 
     */
    public void setNOfficeHotelID(int value) {
        this.nOfficeHotelID = value;
    }

    /**
     * 获取nBrandID属性的值。
     * 
     */
    public int getNBrandID() {
        return nBrandID;
    }

    /**
     * 设置nBrandID属性的值。
     * 
     */
    public void setNBrandID(int value) {
        this.nBrandID = value;
    }

    /**
     * 获取objDInnInfor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DInnInfor }
     *     
     */
    public DInnInfor getObjDInnInfor() {
        return objDInnInfor;
    }

    /**
     * 设置objDInnInfor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DInnInfor }
     *     
     */
    public void setObjDInnInfor(DInnInfor value) {
        this.objDInnInfor = value;
    }

    /**
     * 获取lstDImgPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDImgPath }
     *     
     */
    public ArrayOfDImgPath getLstDImgPath() {
        return lstDImgPath;
    }

    /**
     * 设置lstDImgPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDImgPath }
     *     
     */
    public void setLstDImgPath(ArrayOfDImgPath value) {
        this.lstDImgPath = value;
    }

    /**
     * 获取lstQInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQInfo }
     *     
     */
    public ArrayOfQInfo getLstQInfo() {
        return lstQInfo;
    }

    /**
     * 设置lstQInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQInfo }
     *     
     */
    public void setLstQInfo(ArrayOfQInfo value) {
        this.lstQInfo = value;
    }

}
