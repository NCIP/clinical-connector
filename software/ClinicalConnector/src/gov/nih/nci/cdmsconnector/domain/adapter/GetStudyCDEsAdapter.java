/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain.adapter;

import gov.nih.nci.cdmsconnector.domain.Study;

import java.util.Set;


public interface GetStudyCDEsAdapter <Request, Response>{
	
	public gov.nih.nci.cdmsconnector.domain.GetStudyCDEsRequest mapGetStudyCDEsRequest(
			Request getStudyCDEsRequest) throws Exception;
	
	public Response createGetStudyCDEsResponse(Set<Study> studies);

}
