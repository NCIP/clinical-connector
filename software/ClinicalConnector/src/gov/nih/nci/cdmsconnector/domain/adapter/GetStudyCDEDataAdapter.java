package gov.nih.nci.cdmsconnector.domain.adapter;

import gov.nih.nci.cdmsconnector.domain.Study;

import java.util.Set;


public interface GetStudyCDEDataAdapter <Request, Response>{
	
	public gov.nih.nci.cdmsconnector.domain.GetStudyCDEDataRequest mapGetStudyCDEDataRequest(
			Request getStudyCDEDataRequest) throws Exception;
	
	public Response createGetStudyCDEDataResponse(Set<Study> studies);
	
}
