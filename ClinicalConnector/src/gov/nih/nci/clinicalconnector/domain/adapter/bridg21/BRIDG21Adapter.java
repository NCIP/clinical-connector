package gov.nih.nci.clinicalconnector.domain.adapter.bridg21;

import gov.nih.nci.cabig.ccts.domain.IdentifierType;
import gov.nih.nci.cabig.ccts.domain.OrganizationAssignedIdentifierType;
import gov.nih.nci.cabig.ccts.domain.Registration;
import gov.nih.nci.cabig.ccts.domain.StudySiteType;
import gov.nih.nci.cabig.ccts.domain.SystemAssignedIdentifierType;
import gov.nih.nci.cabig.ccts.domain.loadlabs.AckStatus;
import gov.nih.nci.cabig.ccts.domain.loadlabs.Acknowledgement;
import gov.nih.nci.cabig.ccts.domain.loadlabs.II;
import gov.nih.nci.cdmsconnector.domain.Activity;
import gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest;
import gov.nih.nci.cdmsconnector.domain.HealthCareFacility;
import gov.nih.nci.cdmsconnector.domain.LabResult;
//import gov.nih.nci.cdmsconnector.domain.LoadLabsRequest;
import gov.nih.nci.cdmsconnector.domain.Study;
import gov.nih.nci.cdmsconnector.domain.StudySubject;
import gov.nih.nci.cdmsconnector.domain.adapter.EnrollPatientAdapter;
import gov.nih.nci.cdmsconnector.domain.adapter.LoadLabsAdapter;
import gov.nih.nci.clinicalconnector.manager.InvalidRequestException;
import _21090.org.iso.BL;
import _21090.org.iso.ENXP;
import _21090.org.iso.EntityNamePartType;
import clinicalconnector.nci.nih.gov.Message;
import clinicalconnector.nci.nih.gov.RegisterSubjectResponse;
import clinicalconnector.nci.nih.gov.RegisterSubjectRequest;
import clinicalconnector.nci.nih.gov.LoadLabsRequest;
import clinicalconnector.nci.nih.gov.LoadLabsResponse;
import gov.nih.nci.cdmsconnector.domain.HealthCareFacility;
import gov.nih.nci.cdmsconnector.domain.PerformedSubjectMilestone;


import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

public class BRIDG21Adapter implements
		EnrollPatientAdapter<RegisterSubjectRequest, RegisterSubjectResponse>,
		LoadLabsAdapter<LoadLabsRequest, LoadLabsResponse> {

	private final static Logger log = Logger.getLogger(BRIDG21Adapter.class
			.getName());

	public EnrollPatientRequest mapAndValidateEnrollPatientRequest(
			RegisterSubjectRequest registration) throws Exception {

		System.out.println("Inside BRIDG21Adapter");
		System.out.println("Before NEW EnrollPatientRequest");

		gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest cdmsRequest = new gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest();

		// studySite

		System.out.println("Before NEW Study");
		gov.nih.nci.cdmsconnector.domain.Study study = new gov.nih.nci.cdmsconnector.domain.Study();

		System.out.println("Before NEW StudySite");
		try {
			study.setStudySite(getStudySite(registration.getStudySubject().getStudySiteIdentifier()));

			// c3pr -- Registration. studyRef. Identifier.value
			study.setStudyIdentifier(registration.getStudySubject().getStudyIdentifier().getExtension());
			/*IdentifierType[] identifierType = registration.getStudyRef()
					.getIdentifier();
			for (int i = 0; i < identifierType.length; i++) {
				if (identifierType[i].getPrimaryIndicator()) {
					IdentifierType itype = identifierType[i];
					study.setStudyIdentifier(itype.getValue());
				}
			}*/
		} catch (Exception e) {
			log.debug(e);
		}

		System.out.println("Before NEW cdms setStudy");

		cdmsRequest.setStudy(study);

		System.out.println("Before NEW cdms setStudySite");

		cdmsRequest.setStudySubject(getStudySubject(registration));

		return cdmsRequest;

	}

	private StudySubject getStudySubject(RegisterSubjectRequest registration) {

		StudySubject studySubject = new StudySubject();
		//studySubject
			//	.setParticipantIdentifier(getParticipantIdentifier(registration));
		studySubject
		.setParticipantIdentifier(registration.getStudySubject().getIdentifier().getExtension());

		// studySubject.setPatientPosition(PatientPosition(registration));

		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		
		Date bDate = new Date();
		try {
			bDate = df.parse(registration.getStudySubject().getBirthDate().getValue());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		studySubject.setBirthDate(bDate);

		Date eDate = new Date();
		try {
			eDate = df.parse(registration.getPerformedSubjectMilestone().getRegistrationDate().getValue());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		studySubject.setEnrollDate(eDate);
		
		//studySubject.setConsentDate(registration.getInformedConsentFormSignedDate());
		// PRC Need This Too --> studySubject.setConsentDate(registration.getInformedConsentVersion());

		// Initials
		// TODO: Initials are in the object ENPN. Need to break this up
		//       and extract the correct way.
		/*
		String firstNameI = registration.getStudySubject().getName().getPart().toString();
		String lastNameI = registration.getStudySubject().getName().getPart().toString();
		String patientInitials = firstNameI + " " + lastNameI;*/

		studySubject.setFirstName(null);
		studySubject.setLastName(null);
		
		List<ENXP> lENXPs = registration.getStudySubject().getName().getPart(); /* Todo fix this patientInitials);*/
        String fInitial = new String();
        String lInitial = new String();

        for (int i = 0; i < lENXPs.size(); i++) {
			ENXP lENXP = lENXPs.get(i);
			if (lENXP.getType().equals(EntityNamePartType.GIV)) {
				fInitial = lENXP.getValue();
			}
			
			if (lENXP.getType().equals(EntityNamePartType.FAM)) {
				lInitial = lENXP.getValue();
			}
		}
		
		studySubject.setInitials(fInitial + " " + lInitial);
		
		String gender = registration.getStudySubject().getSexCode().getCode();
		if (gender == null || "".equals(gender.trim())) {
			gender = "";
		} else {
			gender = gender.substring(0, 1).toUpperCase();
		}
		studySubject.setGender(gender);

		HealthCareFacility registrationSite = new HealthCareFacility();
		studySubject.setRegistrationSite(registrationSite);

		Date cDate = new Date();
		try {
			cDate = df.parse(registration.getPerformedSubjectMilestone().getInformedConsentDate().getValue());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PerformedSubjectMilestone subjectMileStone = new PerformedSubjectMilestone();
		subjectMileStone.setConsetDate(cDate);
		
		//subjectMilesStone.setConsentVersion(registration.getInformedConsentVersion());
		studySubject.setSubjectMilesStone(subjectMileStone);

		return studySubject;
	}

/*	private String getParticipantIdentifier(Registration registration) {

		String participantIdentifier = null;
		IdentifierType[] identifierType1 = registration.getParticipant()
				.getIdentifier();
		for (int i = 0; i < identifierType1.length; i++) {
			if (identifierType1[i].getPrimaryIndicator()) {
				// IdentifierType idtype = identifierType[i];
				System.out.println("IdType :" + identifierType1[i].getValue());
				OrganizationAssignedIdentifierType itype = (OrganizationAssignedIdentifierType) identifierType1[i];
				System.out.println("+++  :"
						+ itype.getHealthcareSite().getNciInstituteCode());
				System.out.println("---- :" + itype.getValue());
				// studySubject.setNciInstituteCode(itype.getHealthcareSite().getNciInstituteCode());
				participantIdentifier = itype.getValue();
				System.out.println("**** Before strip**** "
						+ participantIdentifier);
				if (participantIdentifier.startsWith("MRN-")
						|| participantIdentifier.startsWith("MRN:")) {
					participantIdentifier = participantIdentifier.substring(4);

				}
				System.out.println("**** After strip**** "
						+ participantIdentifier);

				return participantIdentifier;
			}
		}

		return participantIdentifier;
	}
*/
	private HealthCareFacility getStudySite(_21090.org.iso.II studySite) {

		gov.nih.nci.cdmsconnector.domain.HealthCareFacility cdmsStudySite = new gov.nih.nci.cdmsconnector.domain.HealthCareFacility();
		try {
			cdmsStudySite.setOrganizationName(studySite.getExtension());
		} catch (Exception e) {
			log.debug("organization name not available", e);
		}
		return cdmsStudySite;
	}

/*	public void addPatientPosition(RegisterSubjectRequest registration,
			String patientPosition) throws InvalidRequestException {

		try {

			// the only thing being set is patient position so if it is empty
			// then no need to continue.
			if (patientPosition == null || patientPosition.length() == 0)
				return;

			_21090.org.iso.II patientPositionId = new _21090.org.iso.II();
			patientPositionId.setExtension(patientPosition);
			patientPositionId.setRoot("C3D");

			IdentifierType[] newIdentifierTypeArray;

			RegisterSubjectResponse rr = new RegisterSubjectResponse();
			rr
			
			if (registration.setStudySubject(studySubject) getIdentifier() != null) {

				// copy identifier array into a new identifier array that is 1
				// slot bigger
				IdentifierType[] identifierTypeArray = registration
						.getIdentifier();
				newIdentifierTypeArray = new IdentifierType[registration
						.getIdentifier().length + 1];
				for (int i = 0; i < identifierTypeArray.length; i++) {
					newIdentifierTypeArray[i] = identifierTypeArray[i];
				}
				newIdentifierTypeArray[newIdentifierTypeArray.length - 1] = patientPositionId;
			} else {
				newIdentifierTypeArray = new IdentifierType[1];
				newIdentifierTypeArray[0] = patientPositionId;
			}
			registration.setIdentifier(newIdentifierTypeArray);

		} catch (Exception e) {
			e.printStackTrace();
			log.error("Exception in mapStudySubjectToRegistration method :", e
					.getCause());
			// throw new Exception(e.getMessage());

		}

	}
*/
	public gov.nih.nci.cdmsconnector.domain.LoadLabsRequest mapAndValidateLoadLabsRequest(
			LoadLabsRequest request) throws Exception {

		gov.nih.nci.cdmsconnector.domain.LoadLabsRequest cdmsLoadLabsRequest = new gov.nih.nci.cdmsconnector.domain.LoadLabsRequest();
	
		List<clinicalconnector.nci.nih.gov.PerformedClinicalResult> genericResults = request.getPerformedClinicalResult();

		if (genericResults == null) {
			log.debug("no labs found");
			throw new Exception("no labs found");
		}

		LabResult[] cdmsResults = new LabResult[genericResults.size()];
		
		DateFormat df = new SimpleDateFormat("yyyyMMdd");

		cdmsLoadLabsRequest.setResults(cdmsResults);

		for (int i = 0; i < genericResults.size(); i++) {
			clinicalconnector.nci.nih.gov.PerformedClinicalResult genericResult = genericResults.get(i);
			LabResult cdmsResult = new LabResult();
	        Study cdmsStudy = new Study();
			cdmsResults[i] = cdmsResult;

			if (genericResult != null) {
				cdmsResults[i].setHigh(genericResult.getReferenceRange().getHigh().getValue().toString());
				cdmsResults[i].setLow(genericResult.getReferenceRange().getLow().getValue().toString());
				cdmsResults[i].setTextResult(genericResult.getNumericalResult().getValue().toString());
				//cdmsResults[i].setTextResult(genericResult.getTextResult().getValue());
				cdmsResults[i].setResultUnit(genericResult.getNumericalResult().getUnit());
				cdmsResults[i].setLabIdentifier(null);

				Date rDate = new Date();
				try {
					rDate = df.parse(genericResult.getReportedDate().getValue());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				cdmsResults[i].setReportedDate(rDate);
				cdmsStudy.setStudyIdentifier(genericResult.getPerformedObservation().getStudyProtocolIdentifier().getExtension());
				cdmsResults[i].setStudy(cdmsStudy);
				
				gov.nih.nci.cdmsconnector.domain.Activity activity = new gov.nih.nci.cdmsconnector.domain.Activity();
				activity.setName(genericResult.getPerformedObservation().getActivityNameCode().getCode());
				cdmsResults[i].setActivity(activity);

				gov.nih.nci.cdmsconnector.domain.StudySubject studysubject = new gov.nih.nci.cdmsconnector.domain.StudySubject();
				studysubject.setParticipantIdentifier(genericResult.getPerformedObservation().getStudySubjectIdentifier().getExtension());
				cdmsResults[i].setStudySubject(studysubject);
			}
		}
		return cdmsLoadLabsRequest;

	}

	private LabResult getLabResult(gov.nih.nci.cabig.ccts.domain.loadlabs.LabResult result)
			throws Exception {
		// TODO Auto-generated method stub
		if (result == null) {
			return null;
		}

		gov.nih.nci.cdmsconnector.domain.StudySubject studySubject = getStudySubject(result);

		if (studySubject == null) {
			log.debug("StudySubject not available");
			throw new Exception("StudySubject not available");
		}

		LabResult cdmsResult = new LabResult();

		cdmsResult.setLow(Float.toString(result.getReferenceRangeLow()));
		cdmsResult.setHigh(Float.toString(result.getReferenceRangeHigh()));

		cdmsResult.setStudySubject(getStudySubject(result));

		// TODO: hardcoded Laboratory Identifier to CDW
		cdmsResult.setLabIdentifier("CDW");

		cdmsResult.setActivity(getActivity(result));

		cdmsResult.setReportedDate(new Date(result.getReportedDateTime()
				.getTimeInMillis()));

		cdmsResult.setResultUnit(result.getNumericUnit());

		cdmsResult.setStudy(getStudy(result));

		cdmsResult.setTextResult(getTextResult(result));

		return cdmsResult;
	}

	private String getTextResult(gov.nih.nci.cabig.ccts.domain.loadlabs.LabResult result) {
		if (result.getTextResult() == null
				|| result.getTextResult().length() == 0) {
			return result.getNumericResult() + "";
		} else {
			return result.getTextResult();
		}
	}

	private Study getStudy(gov.nih.nci.cabig.ccts.domain.loadlabs.LabResult result) throws Exception {
		gov.nih.nci.cabig.ccts.domain.loadlabs.StudySubject ss = result.getStudySubject();
		Study study = new Study();
		if (ss != null) {

			gov.nih.nci.cabig.ccts.domain.loadlabs.PerformedStudy ps = ss.getPerformedStudy();

			if (ps != null) {
				gov.nih.nci.cabig.ccts.domain.loadlabs.Documentation d = ps.getDocumentation(0);
				if (d != null) {

					if (d.getII() != null) {
						II[] tempIIArray = d.getII();
						boolean throwException = true;
						for (int counti = 0; counti < tempIIArray.length; counti++) {
							String temp = tempIIArray[counti].getExtension();
							if (temp.startsWith("STUDY")) {
								System.out.println(temp.substring(6));
								study.setStudyIdentifier(temp.substring(6));
								throwException = false;
							}
						}
						if (throwException)
							throw new Exception(
									"Study Identifier not available.");
					}
				}
			}
		}
		return study;
	}

	private Activity getActivity(gov.nih.nci.cabig.ccts.domain.loadlabs.LabResult result) {
		Activity activity = new Activity();
		gov.nih.nci.cabig.ccts.domain.loadlabs.Activity a = result.getStudySubject().getPerformedActivity(
				0);
		if (a != null) {
			activity.setName(a.getName());
		}
		return activity;
	}

	private StudySubject getStudySubject(gov.nih.nci.cabig.ccts.domain.loadlabs.LabResult result)
			throws Exception {
		gov.nih.nci.cabig.ccts.domain.loadlabs.StudySubject ss = result.getStudySubject();
		gov.nih.nci.cdmsconnector.domain.StudySubject studySubject = new gov.nih.nci.cdmsconnector.domain.StudySubject();
		studySubject.setParticipantIdentifier(getParticipantIdentifier(ss));
		studySubject.setPatientPosition(getPatientPosition(ss));

		// studySubject.setBirthDate(getBirthDate(ss));
		// studySubject.setEnrollDate(getEnrollmentDate(bridgSubject
		// .getStudySite()));

		// names

		gov.nih.nci.cdmsconnector.domain.HealthCareFacility registrationSite = new gov.nih.nci.cdmsconnector.domain.HealthCareFacility();
		studySubject.setRegistrationSite(registrationSite);

		return studySubject;

	}

	private String getPatientPosition(gov.nih.nci.cabig.ccts.domain.loadlabs.StudySubject ss)
			throws Exception {
		if (ss.getII() == null || ss.getII(0) == null) {
			throw new Exception("Study Subject Identifier not available");
		}
		if (ss.getII() != null) {
			II[] tempIIArray = ss.getII();
			for (int counti = 0; counti < tempIIArray.length; counti++) {
				String temp = tempIIArray[counti].getExtension();
				if (temp.startsWith("PATIENTPOSITION")) {
					System.out.println(temp.substring(16));
					return temp.substring(16);
				}
			}

		}
		throw new Exception("Study Subject Identifier not available");
	}

	private String getParticipantIdentifier(gov.nih.nci.cabig.ccts.domain.loadlabs.StudySubject ss)
			throws Exception {

		gov.nih.nci.cabig.ccts.domain.loadlabs.Participant p = ss.getParticipant();
		if (p == null || p.getII() == null || p.getII(0) == null) {
			throw new Exception("Participant Identifier not available.");
		}

		if (p != null) {
			II[] tempIIArray = p.getII();
			for (int counti = 0; counti < tempIIArray.length; counti++) {
				String temp = tempIIArray[counti].getExtension();
				if (temp.startsWith("MRN")) {
					System.out.println(temp.substring(4));
					return temp.substring(4);
				}
			}

		}

		throw new Exception("Participant Identifier not available.");
	}

	public RegisterSubjectResponse createEnrollPatientResponse(RegisterSubjectRequest registration,
			String patientPosition) throws InvalidRequestException {
		//addPatientPosition(registration, patientPosition);
		RegisterSubjectResponse rr = new RegisterSubjectResponse();

		_21090.org.iso.II patientPositionId = new _21090.org.iso.II();
		patientPositionId.setExtension(patientPosition);
		patientPositionId.setRoot("C3D");

		rr.setPatientIdentifier(patientPositionId);
		return rr;
	}

	public LoadLabsResponse createLoadLabsResponse(String msg) {
		LoadLabsResponse ack = new LoadLabsResponse();
		if (msg.equals(PROCESSED)) {
			BL bl = new BL();
			bl.setValue(true);
			ack.setIndicator(bl);
		} else {
			BL blFalse = new BL();
			blFalse.setValue(false);
			ack.setIndicator(blFalse);
			Message message = new Message();
			message.setCode(10000);
			message.setReason(msg);
			ack.setMessage(message);
		}
		//ack.setStatus(AckStatus.Processed);
		return ack;
	}
	
	public Class getEnrollPatientRequestType() {
		return RegisterSubjectRequest.class;
	}

	public Class getEnrollPatientResponseType() {
		return RegisterSubjectResponse.class;
	}

	public Class getLoadLabsRequestType() {
		return LoadLabsRequest.class;
	}

	public Class getLoadLabsResponseType() {
		return LoadLabsResponse.class;
	}

}
