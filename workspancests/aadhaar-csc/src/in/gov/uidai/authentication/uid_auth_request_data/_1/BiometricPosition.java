//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.06 at 04:38:08 PM IST 
//

package in.gov.uidai.authentication.uid_auth_request_data._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "BiometricPosition")
@XmlEnum
public enum BiometricPosition {
	LEFT_IRIS, RIGHT_IRIS, LEFT_INDEX, LEFT_LITTLE, LEFT_MIDDLE, LEFT_RING, LEFT_THUMB, RIGHT_INDEX, RIGHT_LITTLE, RIGHT_MIDDLE, RIGHT_RING, RIGHT_THUMB, UNKNOWN;

	public final String value() {
		return this.name();
	}

	public static BiometricPosition fromValue(String v) {
		return valueOf(v);
	}
}