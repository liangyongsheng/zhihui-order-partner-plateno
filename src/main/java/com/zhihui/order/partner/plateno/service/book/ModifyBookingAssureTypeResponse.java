
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModifyBookingAssureTypeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modifyBookingAssureTypeResult"
})
@XmlRootElement(name = "ModifyBookingAssureTypeResponse")
public class ModifyBookingAssureTypeResponse {

    @XmlElement(name = "ModifyBookingAssureTypeResult")
    protected int modifyBookingAssureTypeResult;

    /**
     * ��ȡmodifyBookingAssureTypeResult���Ե�ֵ��
     * 
     */
    public int getModifyBookingAssureTypeResult() {
        return modifyBookingAssureTypeResult;
    }

    /**
     * ����modifyBookingAssureTypeResult���Ե�ֵ��
     * 
     */
    public void setModifyBookingAssureTypeResult(int value) {
        this.modifyBookingAssureTypeResult = value;
    }

}
