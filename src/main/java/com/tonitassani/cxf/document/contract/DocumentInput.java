package com.tonitassani.cxf.document.contract;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DocumentInput")
public class DocumentInput {

	private String company;
	private int id;
	private String name;

	public String getCompany() {
		return company;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
