package gov.nih.nci.cdmsconnector.domain.adapter;

import gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest;
import gov.nih.nci.cdmsconnector.manager.InvalidRequestException;

public interface EnrollPatientAdapter <Request, Response>{
	
	public EnrollPatientRequest mapAndValidateEnrollPatientRequest(
			Request enrollPatientRequest) throws Exception;
	
	public Response createEnrollPatientResponse(
			Request request, String patientPosition)
			throws InvalidRequestException;
	
	public Class getEnrollPatientRequestType(); 
	
	public Class getEnrollPatientResponseType();

}
