
package com.zhihui.order.partner.plateno.service.login;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CTUserType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CTUserType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="UserCard"/>
 *     &lt;enumeration value="UserDocCord"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CTUserType")
@XmlEnum
public enum CTUserType {

    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("UserCard")
    USER_CARD("UserCard"),
    @XmlEnumValue("UserDocCord")
    USER_DOC_CORD("UserDocCord");
    private final String value;

    CTUserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CTUserType fromValue(String v) {
        for (CTUserType c: CTUserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
