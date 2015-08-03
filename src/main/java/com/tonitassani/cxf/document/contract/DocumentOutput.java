package com.tonitassani.cxf.document.contract;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DocumentOutput")
public class DocumentOutput {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
