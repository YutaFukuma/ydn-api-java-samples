
package jp.yahooapis.im.V5.AdGroupService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartDeviceCarrier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmartDeviceCarrier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOCOMO"/>
 *     &lt;enumeration value="KDDI"/>
 *     &lt;enumeration value="SOFTBANK"/>
 *     &lt;enumeration value="YMOBILE"/>
 *     &lt;enumeration value="OTHERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmartDeviceCarrier")
@XmlEnum
public enum SmartDeviceCarrier {

    DOCOMO,
    KDDI,
    SOFTBANK,
    YMOBILE,
    OTHERS;

    public String value() {
        return name();
    }

    public static SmartDeviceCarrier fromValue(String v) {
        return valueOf(v);
    }

}
