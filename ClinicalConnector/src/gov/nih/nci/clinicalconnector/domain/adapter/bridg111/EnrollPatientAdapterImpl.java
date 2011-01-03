package gov.nih.nci.clinicalconnector.domain.adapter.bridg111;

import gov.nih.nci.cabig.ccts.domain.cdt.II;
import gov.nih.nci.cabig.ccts.domain.enrollpatient.EnrollPatientRequest;
import gov.nih.nci.cabig.ccts.domain.enrollpatient.EnrollPatientResponse;
import gov.nih.nci.clinicalconnector.domain.adapter.bridg111.BRIDG111Adapter;
import gov.nih.nci.clinicalconnector.manager.InvalidRequestException;

public class EnrollPatientAdapterImpl extends BRIDG111Adapter
		implements
		gov.nih.nci.cdmsconnector.domain.adapter.EnrollPatientAdapter<EnrollPatientRequest, EnrollPatientResponse> {

	public gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest mapAndValidateEnrollPatientRequest(
			EnrollPatientRequest enrollPatientRequest) throws Exception {
		System.out.println("Inside EnrollPatientAdapterImpl");
		gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest cdmsRequest = new gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest();

		gov.nih.nci.cdmsconnector.domain.Study study = getStudy(enrollPatientRequest
				.getStudyProtocol());

		/* prc lets try this...I don't think BRIDG111 has Consent Date*/
		gov.nih.nci.cdmsconnector.domain.StudySubject studySubject = getStudySubject(enrollPatientRequest
				.getStudyProtocol().getStudySubject(0));

		//studySubject.setConsentDate(null);
		//studySubject.setConsentVersion(null);
		
		System.out.println("Inside EnrollPatientAdapterImpl2");

		try {
			study.setStudySite(getStudySite(enrollPatientRequest
					.getStudyProtocol().getStudySubject(0).getStudySite()));
		} catch (Exception e) {
			log.debug(e);
		}
		System.out.println("Before cdmsRequest.setStudy call");
		cdmsRequest.setStudy(study);

		System.out.println("Before cdmsRequest.SetStudySubject call");
		cdmsRequest.setStudySubject(getStudySubject(enrollPatientRequest
				.getStudyProtocol().getStudySubject(0)));


		System.out.println("Before cdmsRequest.SetStudySubject call");

		return cdmsRequest;

	}
	
	public EnrollPatientResponse createEnrollPatientResponse(
			EnrollPatientRequest enrollPatientRequest, String patientPosition)
			throws InvalidRequestException {
		gov.nih.nci.cabig.ccts.domain.bridg.StudySubject ss = enrollPatientRequest
				.getStudyProtocol().getStudySubject(0);

		II[] newIIArray = null;

		if (ss.getIdentifier() == null || ss.getIdentifier(0) == null) {
			newIIArray = new II[1];
		}
		if (ss.getIdentifier() != null) {
			II[] tempIIArray = ss.getIdentifier();
			newIIArray = new II[tempIIArray.length + 1];
			for (int counti = 0; counti < tempIIArray.length; counti++) {
				newIIArray[counti] = tempIIArray[counti];
			}
		}

		newIIArray[newIIArray.length - 1] = new II();
		newIIArray[newIIArray.length - 1].setExtension("PATIENTPOSITION:"
				+ patientPosition);
		ss.setIdentifier(newIIArray);

		EnrollPatientResponse response = new EnrollPatientResponse();
		response.setStudyProtocol(enrollPatientRequest.getStudyProtocol());

		return response;
	}

	public Class getEnrollPatientRequestType() {
		return EnrollPatientRequest.class;
	}

	public Class getEnrollPatientResponseType() {
		return EnrollPatientResponse.class;
	}
}
