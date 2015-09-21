package com.tonitassani.cxf.document.service;

import com.tonitassani.cxf.document.contract.DocumentOutput;
import com.tonitassani.cxf.document.domain.Document;

public class DocumentServiceImpl {

	public DocumentServiceImpl() {}

	public DocumentOutput getDocument(Long id, String version, String appId) {
		Document document;
		document = new Document(id.intValue(), "El document: version=" + version + ", appId=" + appId);
		
		DocumentOutput output = new DocumentOutput();
		output.setId(document.getId());
		output.setName(document.getName());

		return output;
	}
}
