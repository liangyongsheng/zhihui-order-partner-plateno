
package com.zhihui.order.partner.plateno.service.book;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CTStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CTStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Order"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="NoShow"/>
 *     &lt;enumeration value="Arrival"/>
 *     &lt;enumeration value="Leave"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CTStatusType")
@XmlEnum
public enum CTStatusType {

    @XmlEnumValue("Order")
    ORDER("Order"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),
    @XmlEnumValue("Arrival")
    ARRIVAL("Arrival"),
    @XmlEnumValue("Leave")
    LEAVE("Leave"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    CTStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CTStatusType fromValue(String v) {
        for (CTStatusType c: CTStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
