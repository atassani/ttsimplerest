package com.tonitassani.cxf.document.contract;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DocumentInput")
public class DocumentInput {

	private Long id;
	private String version;
	private String appId;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
}
