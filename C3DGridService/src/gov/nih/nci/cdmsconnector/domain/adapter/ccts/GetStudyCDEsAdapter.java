package gov.nih.nci.cdmsconnector.domain.adapter.ccts;

import gov.nih.nci.cdmsconnector.domain.Study;

import java.util.Set;


public interface GetStudyCDEsAdapter <Request, Response>{
	
	public gov.nih.nci.cdmsconnector.domain.GetStudyCDEsRequest mapGetStudyCDEsRequest(
			Request getStudyCDEsRequest) throws Exception;
	
	public Response createGetStudyCDEsResponse(Set<Study> studies);

}
