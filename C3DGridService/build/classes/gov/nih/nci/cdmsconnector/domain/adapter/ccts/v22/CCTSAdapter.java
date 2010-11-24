package gov.nih.nci.cdmsconnector.domain.adapter.ccts.v22;

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
import gov.nih.nci.cdmsconnector.domain.LoadLabsRequest;
import gov.nih.nci.cdmsconnector.domain.Study;
import gov.nih.nci.cdmsconnector.domain.StudySubject;
import gov.nih.nci.cdmsconnector.domain.adapter.EnrollPatientAdapter;
import gov.nih.nci.cdmsconnector.domain.adapter.LoadLabsAdapter;
import gov.nih.nci.cdmsconnector.manager.InvalidRequestException;

import java.util.Date;

import org.apache.log4j.Logger;

public class CCTSAdapter implements
		EnrollPatientAdapter<Registration, Registration>,
		LoadLabsAdapter<gov.nih.nci.cabig.ccts.domain.loadlabs.LoadLabsRequest, Acknowledgement> {

	private final static Logger log = Logger.getLogger(CCTSAdapter.class
			.getName());

	public EnrollPatientRequest mapAndValidateEnrollPatientRequest(
			Registration registration) throws Exception {

		System.out.println("Inside CCTSAdapter");
		System.out.println("Before NEW EnrollPatientRequest");

		gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest cdmsRequest = new gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest();

		// studySite

		System.out.println("Before NEW Study");
		gov.nih.nci.cdmsconnector.domain.Study study = new gov.nih.nci.cdmsconnector.domain.Study();

		System.out.println("Before NEW StudySite");
		try {
			study.setStudySite(getStudySite(registration.getStudySite()));

			// c3d --StudySubject. Organization. StudyProtocol. Documentation.
			// identifier
			// c3pr -- Registration. studyRef. Identifier.value
			IdentifierType[] identifierType = registration.getStudyRef()
					.getIdentifier();
			for (int i = 0; i < identifierType.length; i++) {
				if (identifierType[i].getPrimaryIndicator()) {
					IdentifierType itype = identifierType[i];
					study.setStudyIdentifier(itype.getValue());
				}
			}
			// study.setInvestigator(..);
		} catch (Exception e) {
			log.debug(e);
		}

		System.out.println("Before NEW cdms setStudy");

		cdmsRequest.setStudy(study);

		System.out.println("Before NEW cdms setStudySite");

		cdmsRequest.setStudySubject(getStudySubject(registration));

		return cdmsRequest;

	}

	private StudySubject getStudySubject(Registration registration) {

		gov.nih.nci.cdmsconnector.domain.StudySubject studySubject = new gov.nih.nci.cdmsconnector.domain.StudySubject();
		studySubject
				.setParticipantIdentifier(getParticipantIdentifier(registration));
		// studySubject.setPatientPosition(PatientPosition(registration));

		studySubject.setBirthDate(registration.getParticipant().getBirthDate());
		studySubject.setEnrollDate(new Date());
		//studySubject.setConsentDate(registration.getInformedConsentFormSignedDate());
		// PRC Need This Too --> studySubject.setConsentDate(registration.getInformedConsentVersion());

		// names
		String firstName = registration.getParticipant().getFirstName();
		String lastName = registration.getParticipant().getLastName();
		String patientInitials = "";
		if (firstName != null && lastName != null
				&& !"".equals(firstName.trim()) && !"".equals(lastName.trim())) {
			patientInitials = firstName.substring(0, 1).toUpperCase() + " "
					+ lastName.substring(0, 1).toUpperCase();
		}
		if (firstName == null) {
			firstName = "";
		}
		if (lastName == null) {
			lastName = "";
		}

		studySubject.setFirstName(firstName);
		studySubject.setLastName(lastName);
		studySubject.setInitials(patientInitials);

		String gender = registration.getParticipant()
				.getAdministrativeGenderCode();
		if (gender == null || "".equals(gender.trim())) {
			gender = "";
		} else {
			gender = gender.substring(0, 1).toUpperCase();
		}

		studySubject.setGender(gender);

		gov.nih.nci.cdmsconnector.domain.HealthCareFacility registrationSite = new gov.nih.nci.cdmsconnector.domain.HealthCareFacility();
		studySubject.setRegistrationSite(registrationSite);

		gov.nih.nci.cdmsconnector.domain.PerformedSubjectMilestone subjectMilesStone = new gov.nih.nci.cdmsconnector.domain.PerformedSubjectMilestone();
		subjectMilesStone.setConsetDate(registration.getInformedConsentFormSignedDate());
		subjectMilesStone.setConsentVersion(registration.getInformedConsentVersion());
		studySubject.setSubjectMilesStone(subjectMilesStone);

		return studySubject;
	}

	private String getParticipantIdentifier(Registration registration) {

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

	private HealthCareFacility getStudySite(StudySiteType studySite) {

		gov.nih.nci.cdmsconnector.domain.HealthCareFacility cdmsStudySite = new gov.nih.nci.cdmsconnector.domain.HealthCareFacility();
		try {
			cdmsStudySite.setOrganizationName(studySite.getHealthcareSite(0)
					.getNciInstituteCode());
		} catch (Exception e) {
			log.debug("organization name not available", e);
		}
		return cdmsStudySite;
	}

	public void addPatientPosition(Registration registration,
			String patientPosition) throws InvalidRequestException {

		try {

			// the only thing being set is patient position so if it is empty
			// then no need to continue.
			if (patientPosition == null || patientPosition.length() == 0)
				return;

			SystemAssignedIdentifierType patientPositionId = new SystemAssignedIdentifierType();
			patientPositionId.setValue(patientPosition);
			patientPositionId.setSystemName("C3D");

			IdentifierType[] newIdentifierTypeArray;

			if (registration.getIdentifier() != null) {

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

	public LoadLabsRequest mapAndValidateLoadLabsRequest(
			gov.nih.nci.cabig.ccts.domain.loadlabs.LoadLabsRequest request) throws Exception {

		gov.nih.nci.cdmsconnector.domain.LoadLabsRequest cdmsLoadLabsRequest = new gov.nih.nci.cdmsconnector.domain.LoadLabsRequest();

		gov.nih.nci.cabig.ccts.domain.loadlabs.LabResult[] results = request.getLabResult();

		if (results == null) {
			log.debug("no labs found");
			throw new Exception("no labs found");
		}

		LabResult[] cdmsResults = new LabResult[results.length];

		cdmsLoadLabsRequest.setResults(cdmsResults);

		for (int i = 0; i < results.length; i++) {
			gov.nih.nci.cabig.ccts.domain.loadlabs.LabResult result = results[i];
			LabResult cdmsResult = new LabResult();
			cdmsResults[i] = cdmsResult;

			if (result != null) {
				cdmsResults[i] = getLabResult(result);
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

	public Registration createEnrollPatientResponse(Registration registration,
			String patientPosition) throws InvalidRequestException {
		addPatientPosition(registration, patientPosition);
		return registration;
	}

	public Acknowledgement createLoadLabsResponse(String msg) {
		Acknowledgement ack = new Acknowledgement();
		ack.setStatus(AckStatus.Processed);
		return ack;
	}
	
	public Class getEnrollPatientRequestType() {
		return Registration.class;
	}

	public Class getEnrollPatientResponseType() {
		return Registration.class;
	}

	public Class getLoadLabsRequestType() {
		return gov.nih.nci.cabig.ccts.domain.loadlabs.LoadLabsRequest.class;
	}

	public Class getLoadLabsResponseType() {
		return Acknowledgement.class;
	}

}
