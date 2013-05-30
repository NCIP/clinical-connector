/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain.adapter;

import gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest;
import gov.nih.nci.clinicalconnector.manager.InvalidRequestException;

public interface EnrollPatientAdapter <Request, Response>{
	
	public EnrollPatientRequest mapAndValidateEnrollPatientRequest(
			Request enrollPatientRequest) throws Exception;
	
	public Response createEnrollPatientResponse(
			Request request, String patientPosition)
			throws InvalidRequestException;
	
	public Class getEnrollPatientRequestType(); 
	
	public Class getEnrollPatientResponseType();

}
