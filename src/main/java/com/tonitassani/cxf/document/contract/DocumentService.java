package com.tonitassani.cxf.document.contract;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path(value = "/")
public interface DocumentService {

	@GET
	@Path("/xml/{id}")
	@Produces("application/xml")
	public DocumentOutput getDocumentAsXml(@PathParam("id") Long id, @QueryParam("version") String version,
			@QueryParam("appId") String appId);

	@GET
	@Path("/json/{id}")
	@Produces("application/json")
	public DocumentOutput getDocumentAsJson(@PathParam("id") Long id, @QueryParam("version") String version,
			@QueryParam("appId") String appId);

}
