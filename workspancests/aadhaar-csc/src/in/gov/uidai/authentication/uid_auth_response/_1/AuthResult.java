//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.06 at 04:38:08 PM IST 
//

package in.gov.uidai.authentication.uid_auth_response._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AuthResult")
@XmlEnum
public enum AuthResult {
	Y("y"), N("n");

	private final String value;

	private AuthResult(String v) {
		this.value = v;
	}

	public final String value() {
		return this.value;
	}

	public static AuthResult fromValue(String v) {
		AuthResult[] arrayOfAuthResult;
		int j = (arrayOfAuthResult = values()).length;
		for (int i = 0; i < j; i++) {
			AuthResult localAuthResult;
			if ((localAuthResult = arrayOfAuthResult[i]).value.equals(v)) {
				return localAuthResult;
			}
		}
		throw new IllegalArgumentException(v);
	}
}