//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.06 at 04:38:08 PM IST 
//

package in.gov.uidai.authentication.common.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Meta")
public class Meta {
	@XmlAttribute(name = "udc", required = true)
	protected String udc;
	@XmlAttribute(name = "rdsId", required = false)
	protected String rdsId;
	@XmlAttribute(name = "rdsVer", required = false)
	protected String rdsVer;
	@XmlAttribute(name = "dpId", required = false)
	protected String dpId;
	@XmlAttribute(name = "dc", required = false)
	protected String dc;
	@XmlAttribute(name = "mi", required = false)
	protected String mi;
	@XmlAttribute(name = "mc", required = false)
	protected String mc;

	public String getUdc() {
		return this.udc;
	}

	public void setUdc(String value) {
		this.udc = value;
	}

	public String getRdsId() {
		return this.rdsId;
	}

	public void setRdsId(String rdsId) {
		this.rdsId = rdsId;
	}

	public String getRdsVer() {
		return this.rdsVer;
	}

	public void setRdsVer(String rdsVer) {
		this.rdsVer = rdsVer;
	}

	public String getDpId() {
		return this.dpId;
	}

	public void setDpId(String dpId) {
		this.dpId = dpId;
	}

	public String getDc() {
		return this.dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	public String getMc() {
		return this.mc;
	}

	public void setMc(String mc) {
		this.mc = mc;
	}

	public String getMi() {
		return this.mi;
	}

	public void setMi(String mi) {
		this.mi = mi;
	}
}