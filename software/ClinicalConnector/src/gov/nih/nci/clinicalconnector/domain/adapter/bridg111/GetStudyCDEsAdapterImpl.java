/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.domain.adapter.bridg111;

import gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsResponse;
import gov.nih.nci.cdmsconnector.domain.Study;
import gov.nih.nci.clinicalconnector.domain.adapter.bridg111.BRIDG111Adapter;

import java.util.Set;

public class GetStudyCDEsAdapterImpl extends BRIDG111Adapter
		implements
		gov.nih.nci.cdmsconnector.domain.adapter.GetStudyCDEsAdapter<GetStudyCDEsRequest, GetStudyCDEsResponse> {

	public gov.nih.nci.cdmsconnector.domain.GetStudyCDEsRequest mapGetStudyCDEsRequest(
			GetStudyCDEsRequest getStudyCDEsRequest) throws Exception {
		gov.nih.nci.cdmsconnector.domain.GetStudyCDEsRequest cdmsGetStudyCDEsRequest = new gov.nih.nci.cdmsconnector.domain.GetStudyCDEsRequest();

		cdmsGetStudyCDEsRequest.setStudyName(getStudyCDEsRequest.getStudyName());

		return cdmsGetStudyCDEsRequest;
	}
	
	public GetStudyCDEsResponse createGetStudyCDEsResponse(Set<Study> studies) {
		GetStudyCDEsResponse response = new GetStudyCDEsResponse();
		StudyProtocol[] studyProtocols = createGetStudyCDEDataStudyProtocol(studies);
		response.setStudyProtocol(studyProtocols);
		return response;
	}

}
