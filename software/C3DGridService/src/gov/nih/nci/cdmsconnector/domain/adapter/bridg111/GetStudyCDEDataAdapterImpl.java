package gov.nih.nci.cdmsconnector.domain.adapter.bridg111;

import gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEDataRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEDataResponse;
import gov.nih.nci.cdmsconnector.domain.CommonDataElement;
import gov.nih.nci.cdmsconnector.domain.Study;
import gov.nih.nci.cdmsconnector.manager.InvalidRequestException;

import java.util.Set;

public class GetStudyCDEDataAdapterImpl extends BRIDG111Adapter
		implements
		gov.nih.nci.cdmsconnector.domain.adapter.GetStudyCDEDataAdapter<GetStudyCDEDataRequest, GetStudyCDEDataResponse> {

	public gov.nih.nci.cdmsconnector.domain.GetStudyCDEDataRequest mapGetStudyCDEDataRequest(GetStudyCDEDataRequest getStudyCDEDataRequest)
			throws Exception {
		gov.nih.nci.cdmsconnector.domain.GetStudyCDEDataRequest cdmsGetStudyCDEDataRequest = new gov.nih.nci.cdmsconnector.domain.GetStudyCDEDataRequest();

		cdmsGetStudyCDEDataRequest.setStudyName(getStudyCDEDataRequest.getStudyName());
		CommonDataElement cde = new CommonDataElement();
		cdmsGetStudyCDEDataRequest.setCommonDataElement(cde);

		cde.setPublicIdentifier(getStudyCDEDataRequest.getCommonDataElement()
				.getPublicIdentifier());
		cde.setVersion(getStudyCDEDataRequest.getCommonDataElement().getVersion());

		return cdmsGetStudyCDEDataRequest;
	}
	
	public GetStudyCDEDataResponse createGetStudyCDEDataResponse(Set<Study> studies) {
		GetStudyCDEDataResponse response = new GetStudyCDEDataResponse();
		StudyProtocol[] studyProtocols = createGetStudyCDEDataStudyProtocol(studies);
		response.setStudyProtocol(studyProtocols);
		return response;
	}

}
