
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EValidationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EValidationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IsCanBook"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EValidationType")
@XmlEnum
public enum EValidationType {

    @XmlEnumValue("IsCanBook")
    IS_CAN_BOOK("IsCanBook");
    private final String value;

    EValidationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EValidationType fromValue(String v) {
        for (EValidationType c: EValidationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
