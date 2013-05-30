/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain.adapter;


public interface LoadLabsAdapter <Request, Response>{
	public static final String PROCESSED = "PROCESSED";
	public static final String SUBMITTED = "SUBMITTED";

	public gov.nih.nci.cdmsconnector.domain.LoadLabsRequest mapAndValidateLoadLabsRequest(
			Request request) throws Exception;

	public Response createLoadLabsResponse(String msg);

	public Class getLoadLabsRequestType(); 
	
	public Class getLoadLabsResponseType();
}
