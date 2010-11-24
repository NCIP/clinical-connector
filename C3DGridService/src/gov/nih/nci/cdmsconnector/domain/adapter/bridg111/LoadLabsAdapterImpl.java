package gov.nih.nci.cdmsconnector.domain.adapter.bridg111;

import gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult;
import gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation;
import gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsRequest;
import gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsResponse;
import gov.nih.nci.cabig.ccts.domain.cdt.CD;
import gov.nih.nci.cdmsconnector.domain.LabResult;

import java.util.ArrayList;
import java.util.List;

public class LoadLabsAdapterImpl extends BRIDG111Adapter
		implements
		gov.nih.nci.cdmsconnector.domain.adapter.LoadLabsAdapter<LoadLabsRequest, LoadLabsResponse> {

	public gov.nih.nci.cdmsconnector.domain.LoadLabsRequest mapAndValidateLoadLabsRequest(
			LoadLabsRequest loadLabsRequest) throws Exception {

		gov.nih.nci.cdmsconnector.domain.LoadLabsRequest cdmsLoadLabsRequest = new gov.nih.nci.cdmsconnector.domain.LoadLabsRequest();

		gov.nih.nci.cabig.ccts.domain.bridg.StudySubject[] ss = loadLabsRequest
				.getStudyProtocol().getStudySubject();

		List<LabResult> cdmsResults = new ArrayList<LabResult>();

		if (ss == null || ss.length == 0) {
			log.debug("no StudySubject found");
			return cdmsLoadLabsRequest;
		}

		for (int i = 0; i < ss.length; i++) {
			if (ss[i].getPerformedObservation() == null) {
				continue;
			}
			PerformedObservation[] observations = (PerformedObservation[]) ss[i]
					.getPerformedObservation();
			for (PerformedObservation performedObservation : observations) {
				if (performedObservation.getPerformedClinicalResult() == null) {
					continue;
				}
				PerformedClinicalResult results[] = (PerformedClinicalResult[]) performedObservation
						.getPerformedClinicalResult();
				for (PerformedClinicalResult performedClinicalResult : results) {
					LabResult cdmsResult;

					if (performedClinicalResult != null) {
						cdmsResult = getLabResult(performedClinicalResult);
						cdmsResult.setStudy(getStudy(loadLabsRequest
								.getStudyProtocol()));
						cdmsResult.setStudySubject(getStudySubject(ss[i]));
						cdmsResult
								.setActivity(getActivity(performedObservation));
						cdmsResults.add(cdmsResult);
					}
				}
			}
		}

		cdmsLoadLabsRequest.setResults(cdmsResults.toArray(new LabResult[0]));

		return cdmsLoadLabsRequest;

	}

	public gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsResponse createLoadLabsResponse(String msg) {
		gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsResponse response = new gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsResponse();
		CD ack = new CD();
		ack.setCode(msg);
		response.setAck(ack);
		return response;
	}

	public Class getLoadLabsRequestType() {
		return LoadLabsRequest.class;
	}

	public Class getLoadLabsResponseType() {
		return LoadLabsResponse.class;
	}

}
