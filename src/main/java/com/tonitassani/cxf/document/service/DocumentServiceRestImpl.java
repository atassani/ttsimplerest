package com.tonitassani.cxf.document.service;

import com.tonitassani.cxf.document.contract.DocumentOutput;
import com.tonitassani.cxf.document.contract.DocumentServiceRest;

public class DocumentServiceRestImpl implements DocumentServiceRest {

	private DocumentServiceImpl service;

	public DocumentServiceRestImpl() {
		service = new DocumentServiceImpl();
	}

	@Override
	public DocumentOutput getDocumentAsJson(Long id, String version, String appId) {
		return service.getDocument(id, version, appId);
	}

	@Override
	public DocumentOutput getDocumentAsXml(Long id, String version, String appId) {
		return service.getDocument(id, version, appId);
	}

}
