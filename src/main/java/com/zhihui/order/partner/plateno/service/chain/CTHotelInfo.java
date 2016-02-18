
package com.zhihui.order.partner.plateno.service.chain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CTHotelInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡmapURL���Ե�ֵ��
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
     * ����mapURL���Ե�ֵ��
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
     * ��ȡforCity���Ե�ֵ��
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
     * ����forCity���Ե�ֵ��
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
     * ��ȡsName���Ե�ֵ��
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
     * ����sName���Ե�ֵ��
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
     * ��ȡsAddress���Ե�ֵ��
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
     * ����sAddress���Ե�ֵ��
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
     * ��ȡsTelephone���Ե�ֵ��
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
     * ����sTelephone���Ե�ֵ��
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
     * ��ȡsFaxphone���Ե�ֵ��
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
     * ����sFaxphone���Ե�ֵ��
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
     * ��ȡnHotelID���Ե�ֵ��
     * 
     */
    public int getNHotelID() {
        return nHotelID;
    }

    /**
     * ����nHotelID���Ե�ֵ��
     * 
     */
    public void setNHotelID(int value) {
        this.nHotelID = value;
    }

    /**
     * ��ȡnOfficeHotelID���Ե�ֵ��
     * 
     */
    public int getNOfficeHotelID() {
        return nOfficeHotelID;
    }

    /**
     * ����nOfficeHotelID���Ե�ֵ��
     * 
     */
    public void setNOfficeHotelID(int value) {
        this.nOfficeHotelID = value;
    }

    /**
     * ��ȡnBrandID���Ե�ֵ��
     * 
     */
    public int getNBrandID() {
        return nBrandID;
    }

    /**
     * ����nBrandID���Ե�ֵ��
     * 
     */
    public void setNBrandID(int value) {
        this.nBrandID = value;
    }

    /**
     * ��ȡobjDInnInfor���Ե�ֵ��
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
     * ����objDInnInfor���Ե�ֵ��
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
     * ��ȡlstDImgPath���Ե�ֵ��
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
     * ����lstDImgPath���Ե�ֵ��
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
     * ��ȡlstQInfo���Ե�ֵ��
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
     * ����lstQInfo���Ե�ֵ��
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
