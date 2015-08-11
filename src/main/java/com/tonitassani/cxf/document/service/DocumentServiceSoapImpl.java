package com.tonitassani.cxf.document.service;

import javax.jws.WebService;

import com.tonitassani.cxf.document.contract.DocumentInput;
import com.tonitassani.cxf.document.contract.DocumentOutput;
import com.tonitassani.cxf.document.contract.DocumentServiceSoap;

@WebService(serviceName="DoumentService")
public class DocumentServiceSoapImpl implements DocumentServiceSoap {

	private DocumentServiceImpl service;

	public DocumentServiceSoapImpl() {
		service = new DocumentServiceImpl();
	}
	
	@Override
	public DocumentOutput getDocument(DocumentInput input) {
		return service.getDocument(input.getId(), input.getVersion(), input.getAppId());
	}
}
