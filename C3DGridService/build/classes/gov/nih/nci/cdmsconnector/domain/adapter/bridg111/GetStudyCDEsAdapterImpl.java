package gov.nih.nci.cdmsconnector.domain.adapter.bridg111;

import gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsResponse;
import gov.nih.nci.cdmsconnector.domain.Study;

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
		StudyProtocol[] studyProtocols = createGetStudyCDEsStudyProtocol(studies);
		response.setStudyProtocol(studyProtocols);
		return response;
	}

}
