package com.tonitassani.cxf.document.domain;

public class Document {

	private int id;
	private String name;

	public Document() {
	}

	public Document(int id, String name) {
		this.id = id;
		this.name = name;
	}

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
