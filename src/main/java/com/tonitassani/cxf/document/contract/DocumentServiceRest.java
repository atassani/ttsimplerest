package com.tonitassani.cxf.document.contract;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Service;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
import com.tonitassani.cxf.document.contract.DocumentOutput;

@Path(value = "/documents")
@Api(value = "/documents", description = "Sample API to manage documents ")
@Service("documentService")
public interface DocumentServiceRest {

	@GET
	@Path("/xml/{id}")
	@ApiOperation(value = "Retrieves a document in XML format by its ID", notes = "Additional notes", response = DocumentOutput.class)
	@ApiResponses(value= {
			@ApiResponse(code = 400, message = "Invalid ID"),
			@ApiResponse(code = 404, message = "Document not found")
	})	
	@Produces("application/xml")
	public DocumentOutput getDocumentAsXml(
			@ApiParam(value="Document Id to retrieve", required=true)
			@PathParam("id") 
			Long id, 
			@QueryParam("version")
            String version,
			@QueryParam("appId")
            String appId);

	@GET
	@Path("/json/{id}")
	@ApiOperation(value = "Busca documento JSON por ID", notes = "Más notas sobre el método", response = DocumentOutput.class)
	@Produces("application/json")
	public DocumentOutput getDocumentAsJson(@PathParam("id") Long id, @QueryParam("version") String version,
			@QueryParam("appId") String appId);

}
