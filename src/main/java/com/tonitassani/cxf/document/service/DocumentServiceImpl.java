package com.tonitassani.cxf.document.service;

import com.tonitassani.cxf.document.contract.DocumentOutput;
import com.tonitassani.cxf.document.contract.DocumentService;
import com.tonitassani.cxf.document.domain.Document;

public class DocumentServiceImpl implements DocumentService {

	public DocumentServiceImpl() {}

	@Override
	public DocumentOutput getDocumentAsJson(Long id, String version, String appId) {
		Document document;
		document = new Document(1, "El document " + version + ", " + appId);
		
		DocumentOutput output = new DocumentOutput();
		output.setId(document.getId());
		output.setName(document.getName());

		return output;
	}

	@Override
	public DocumentOutput getDocumentAsXml(Long id, String version, String appId) {
		return getDocumentAsJson(id, version, appId);
	}

}
