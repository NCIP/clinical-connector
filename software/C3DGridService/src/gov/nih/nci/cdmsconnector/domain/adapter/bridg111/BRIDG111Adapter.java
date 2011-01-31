package gov.nih.nci.cdmsconnector.domain.adapter.bridg111;

import gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionInstrument;
import gov.nih.nci.cabig.ccts.domain.bridg.DataCollectionModule;
import gov.nih.nci.cabig.ccts.domain.bridg.Document;
import gov.nih.nci.cabig.ccts.domain.bridg.PerformedClinicalResult;
import gov.nih.nci.cabig.ccts.domain.bridg.PerformedObservation;
import gov.nih.nci.cabig.ccts.domain.bridg.Question;
import gov.nih.nci.cabig.ccts.domain.bridg.QuestionValue;
import gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol;
import gov.nih.nci.cabig.ccts.domain.bridg.Event;
import gov.nih.nci.cabig.ccts.domain.bridg.StudySubject;
import gov.nih.nci.cabig.ccts.domain.cdt.II;
import gov.nih.nci.cdmsconnector.domain.Activity;
//import gov.nih.nci.cdmsconnector.domain.Event;
import gov.nih.nci.cdmsconnector.domain.HealthCareFacility;
//import gov.nih.nci.cdmsconnector.domain.LabResult;
import gov.nih.nci.cdmsconnector.domain.PerformedSubjectMilestone;
import gov.nih.nci.cdmsconnector.domain.QuestionGroup;
import gov.nih.nci.cdmsconnector.domain.Study;
//import gov.nih.nci.cdmsconnector.domain.StudySubject;
import gov.nih.nci.cdmsconnector.manager.InvalidRequestException;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

public abstract class BRIDG111Adapter{

	protected final static Logger log = Logger.getLogger(BRIDG111Adapter.class
			.getName());

	protected HealthCareFacility getStudySite(
			gov.nih.nci.cabig.ccts.domain.bridg.StudySite studySite) {

		gov.nih.nci.cdmsconnector.domain.HealthCareFacility cdmsStudySite = new gov.nih.nci.cdmsconnector.domain.HealthCareFacility();
		try {
			cdmsStudySite.setOrganizationName(studySite.getHealthCareSite()
					.getIdentifier().getExtension());
		} catch (Exception e) {
			log.debug("organization name not available", e);
		}
		return cdmsStudySite;
	}
    /*PRC*/
	protected PerformedSubjectMilestone getConsentDate(
			gov.nih.nci.cabig.ccts.domain.bridg.PerformedSubjectMilestone  subjectMilestone) {

		gov.nih.nci.cdmsconnector.domain.PerformedSubjectMilestone cdmsMileStone = new gov.nih.nci.cdmsconnector.domain.PerformedSubjectMilestone();
	  // Date tDate = subjectMilestone.getInformedConsentDate().getValue().getTime();
      try {
			cdmsMileStone.setConsetDate(subjectMilestone.getInformedConsentDate().getValue().getTime());
		} catch (Exception e) {
			log.debug("organization name not available", e);
		} 
		return cdmsMileStone;
	}

/*	protected LabResult getLabResult(PerformedClinicalResult result)
			throws Exception {
		if (result == null) {
			return null;
		}

		LabResult cdmsResult = new LabResult();

		cdmsResult.setLow(Float.toString(result.getReferenceRangeLow()
				.getValue()));
		cdmsResult.setHigh(Float.toString(result.getReferenceRangeHigh()
				.getValue()));

		// TODO: hardcoded Laboratory Identifier to CDW
		cdmsResult.setLabIdentifier("CDW");

		cdmsResult.setReportedDate(result.getReportedDate().getValue()
				.getTime());

		cdmsResult.setResultUnit(result.getNumericResult().getUnit().getCode());

		cdmsResult.setTextResult(getTextResult(result));

		return cdmsResult;
	}
*/
	protected String getTextResult(PerformedClinicalResult result) {
		if (result.getTextResult() == null
				|| result.getTextResult().getValue() == null
				|| result.getTextResult().getValue().length() == 0) {
			return result.getNumericResult().getValue() + "";
		} else {
			return result.getTextResult().getValue();
		}
	}

	protected Study getStudy(StudyProtocol studyProtocol) throws Exception {
		Study study = new Study();
		// studyProtocol.getDocument(0).getIdentifier(0).getExtension();
		if (studyProtocol != null && studyProtocol.getDocument() != null) {

			for (Document d : studyProtocol.getDocument()) {

				if (d != null) {

					if (d.getIdentifier() != null) {
						II[] tempIIArray = d.getIdentifier();
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

	protected Activity getActivity(PerformedObservation performedObservation) {
		Activity activity = new Activity();
		if (performedObservation != null) {
			activity.setName(performedObservation.getName().getDisplayName());
		}
		return activity;
	}

	protected gov.nih.nci.cdmsconnector.domain.StudySubject getStudySubject(
			gov.nih.nci.cabig.ccts.domain.bridg.StudySubject ss)
			throws Exception {
		gov.nih.nci.cdmsconnector.domain.StudySubject studySubject = new gov.nih.nci.cdmsconnector.domain.StudySubject();
		studySubject.setParticipantIdentifier(getParticipantIdentifier(ss));
		studySubject.setPatientPosition(getPatientPosition(ss));

		gov.nih.nci.cdmsconnector.domain.HealthCareFacility registrationSite = new gov.nih.nci.cdmsconnector.domain.HealthCareFacility();
		studySubject.setRegistrationSite(registrationSite);
        //ss.getPerformedObservation(0).getScheduledActivity().g
        //ss.g getStudySite().getHealthCareSite()getActivity() getPerformedObservation(0).get
		gov.nih.nci.cdmsconnector.domain.PerformedSubjectMilestone subjectMilestone = new gov.nih.nci.cdmsconnector.domain.PerformedSubjectMilestone();
		subjectMilestone.setConsetDate(null);
		
		studySubject.setSubjectMilesStone(subjectMilestone);

		try {

			studySubject.setBirthDate(ss.getParticipant().getPerson()
					.getBirthDate().getValue().getTime());
			studySubject.setEnrollDate(new Date());
			// names
			String firstName = ss.getParticipant().getPerson().getName()
					.getGiven();
			String lastName = ss.getParticipant().getPerson().getName()
					.getFamily();
			String patientInitials = "";
			if (firstName != null && lastName != null
					&& !"".equals(firstName.trim())
					&& !"".equals(lastName.trim())) {
				patientInitials = firstName.substring(0, 1).toUpperCase() + " "
						+ lastName.substring(0, 1).toUpperCase();
			}
			if ("".equals(patientInitials)
					&& ss.getParticipant().getPerson().getInitials().getValue() != null) {
				patientInitials = ss.getParticipant().getPerson().getInitials()
						.getValue();
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
		} catch (Exception e) {
			log.error("name not found");
		}

		try {
			String gender = ss.getParticipant().getPerson().getGender()
					.getCode();

			if (gender == null || "".equals(gender.trim())) {
				gender = "";
			} else {
				gender = gender.substring(0, 1).toUpperCase();
			}

			studySubject.setGender(gender);
		} catch (Exception e) {
			log.error("gender info not found");
		}

		return studySubject;

	}

	protected String getPatientPosition(
			gov.nih.nci.cabig.ccts.domain.bridg.StudySubject ss)
			throws Exception {
		if (ss.getIdentifier() == null || ss.getIdentifier(0) == null) {
			log.error("Study Subject Identifier not available");
			return null;
		}
		if (ss.getIdentifier() != null) {
			II[] tempIIArray = ss.getIdentifier();
			for (int counti = 0; counti < tempIIArray.length; counti++) {
				String temp = tempIIArray[counti].getExtension();
				if (temp.startsWith("PATIENTPOSITION")) {
					System.out.println(temp.substring(16));
					return temp.substring(16);
				}
			}
		}
		log.error("Study Subject Identifier not available");
		return null;
	}

	protected String getParticipantIdentifier(
			gov.nih.nci.cabig.ccts.domain.bridg.StudySubject ss)
			throws Exception {

		gov.nih.nci.cabig.ccts.domain.bridg.Participant p = ss.getParticipant();
		if (p == null || p.getIdentifier() == null
				|| p.getIdentifier(0) == null) {
			throw new Exception("Participant Identifier not available.");
		}

		if (p != null) {
			II[] tempIIArray = p.getIdentifier();
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

	protected StudyProtocol[] createGetStudyCDEDataStudyProtocol(Set<Study> studies) {
		StudyProtocol[] studyProtocols = new StudyProtocol[studies.size()];
		int i = 0;
		for (Iterator<Study> iterator = studies.iterator(); iterator.hasNext();) {
			Study study = (Study) iterator.next();
			studyProtocols[i] = new StudyProtocol();
			studyProtocols[i].setIdentifier(new II[1]);
			II id = new II();
			id.setExtension(study.getStudyIdentifier());
			studyProtocols[i].setIdentifier(0, id );
			//studyProtocols[i++].setEvent(getBRIDGEvents(study.getEvents()));
			//studyProtocols[i++].setStudySubject(getBRIDGStudySubject(study.getStudySubjects()));
			studyProtocols[i].setEvent(getBRIDGEvents(study.getStudySubjects()));
			studyProtocols[i].setStudySubject(getBRIDGStudySubject(study.getStudySubjects()));
		}
		return studyProtocols;
	}
	
	protected StudyProtocol[] createGetStudyCDEsStudyProtocol(Set<Study> studies) {
		StudyProtocol[] studyProtocols = new StudyProtocol[studies.size()];
		int i = 0;
		for (Iterator<Study> iterator = studies.iterator(); iterator.hasNext();) {
			Study study = (Study) iterator.next();
			studyProtocols[i] = new StudyProtocol();
			studyProtocols[i].setIdentifier(new II[1]);
			II id = new II();
			id.setExtension(study.getStudyIdentifier());
			studyProtocols[i].setIdentifier(0, id );
			//studyProtocols[i++].setEvent(getBRIDGEvents(study.getEvents()));
			//studyProtocols[i++].setStudySubject(getBRIDGStudySubject(study.getStudySubjects()));
			studyProtocols[i].setEvent(getBRIDGEventsEvents(study.getEvents()));
			//studyProtocols[i].setStudySubject(getBRIDGStudySubject(study.getStudySubjects()));
		}
		return studyProtocols;
	}
	
/*protected gov.nih.nci.cabig.ccts.domain.bridg.StudySubject[] getBRIDGStudySubject(List<StudySubject> studySubject) {
		gov.nih.nci.cabig.ccts.domain.bridg.StudySubject[] bStudySubjects = new gov.nih.nci.cabig.ccts.domain.bridg.StudySubject[studySubject.size()];
		for (int i = 0; i < studySubject.size(); i++) {
			bStudySubjects[i] = new gov.nih.nci.cabig.ccts.domain.bridg.StudySubject();
			bStudySubjects[i].setIdentifier(new II[1]);
			II id = new II();
			id.setExtension("PATIENTPOSITION");
			id.setRoot(studySubject.get(i).getPatientPosition());
			bStudySubjects[i].setIdentifier(1,id);			
		}
		return bStudySubjects;
	}
*/
	protected StudySubject[] getBRIDGStudySubject(List<gov.nih.nci.cdmsconnector.domain.StudySubject> studySubjects) {
        int a = 0;
		for (int i = 0; i < studySubjects.size(); i++) {
			a = a + studySubjects.get(i).getEvents().size();
		}			
		StudySubject[] bStudySubjects = new gov.nih.nci.cabig.ccts.domain.bridg.StudySubject[a];
		a = 0;
		for (int i = 0; i < studySubjects.size(); i++) {
			List<gov.nih.nci.cdmsconnector.domain.Event> events = studySubjects.get(i).getEvents();
			for (int x = 0; x < events.size(); x++) {
     			bStudySubjects[a] = new gov.nih.nci.cabig.ccts.domain.bridg.StudySubject();
			    bStudySubjects[a].setIdentifier(new II[1]);
			    II id = new II();
			    id.setExtension("PATIENTPOSITION");
			    id.setRoot(studySubjects.get(i).getPatientPosition());
			    bStudySubjects[a].setIdentifier(0,id);
			    a++;
			}
		}
		return bStudySubjects;
	}

/*	
	protected gov.nih.nci.cabig.ccts.domain.bridg.Event[] getBRIDGEvents(
			List<Event> events) {
		gov.nih.nci.cabig.ccts.domain.bridg.Event[] bEvents = new gov.nih.nci.cabig.ccts.domain.bridg.Event[events
				.size()];
		for (int i = 0; i < events.size(); i++) {
			bEvents[i] = new gov.nih.nci.cabig.ccts.domain.bridg.Event();
			bEvents[i].setDate(events.get(i).getDate());
			bEvents[i].setId(events.get(i).getId());
			bEvents[i].setName(events.get(i).getName());
			bEvents[i]
					.setDataCollectionInstrument(getBRIDGDataCollectionInstrument(events
							.get(i).getDcis()));
		}

		return bEvents;
	}
*/
	protected gov.nih.nci.cabig.ccts.domain.bridg.Event[] getBRIDGEvents(
			List<gov.nih.nci.cdmsconnector.domain.StudySubject> studySubjects) {
        int a = 0;
		for (int i = 0; i < studySubjects.size(); i++) {
			a = a + studySubjects.get(i).getEvents().size();
		}
		Event[] bEvents = new Event[a];
		a = 0;
		for (int i = 0; i < studySubjects.size(); i++) {
			List<gov.nih.nci.cdmsconnector.domain.Event> events = studySubjects.get(i).getEvents();
			for (int x = 0; x < events.size(); x++) {
			    bEvents[a] = new Event();
			    bEvents[a].setDate(events.get(x).getDate());
			    bEvents[a].setId(events.get(x).getId());
			    bEvents[a].setName(events.get(x).getName());
			    bEvents[a].setDataCollectionInstrument(getBRIDGDataCollectionInstrument(events
							.get(x).getDcis()));
			    a++;
    		}
		}
		return bEvents;
	}

	protected gov.nih.nci.cabig.ccts.domain.bridg.Event[] getBRIDGEventsEvents(
			List<gov.nih.nci.cdmsconnector.domain.Event> studyEvents) {
        int a = 0;
		Event[] bEvents = new Event[studyEvents.size()];
		List<gov.nih.nci.cdmsconnector.domain.Event> events = studyEvents;
		for (int x = 0; x < events.size(); x++) {
		    bEvents[a] = new Event();
		    bEvents[a].setDate(events.get(x).getDate());
		    bEvents[a].setId(events.get(x).getId());
		    bEvents[a].setName(events.get(x).getName());
		    bEvents[a].setDataCollectionInstrument(getBRIDGDataCollectionInstrument(events
						.get(x).getDcis()));
		    a++;
		}
		return bEvents;
	}

	protected DataCollectionInstrument[] getBRIDGDataCollectionInstrument(
			List<gov.nih.nci.cdmsconnector.domain.DataCollectionInstrument> dcis) {
		DataCollectionInstrument[] bDCIs = new DataCollectionInstrument[dcis
				.size()];
		for (int i = 0; i < dcis.size(); i++) {
			bDCIs[i] = new DataCollectionInstrument();
			bDCIs[i].setDate(dcis.get(i).getDate());
			bDCIs[i].setId(dcis.get(i).getId());
			bDCIs[i].setName(dcis.get(i).getName());
			bDCIs[i].setDataCollectionModule(getBRIDGDataCollectionModule(dcis
					.get(i).getDcms()));
		}

		return bDCIs;
	}

	protected DataCollectionModule[] getBRIDGDataCollectionModule(
			List<gov.nih.nci.cdmsconnector.domain.DataCollectionModule> dcms) {
		DataCollectionModule[] bDCMs = new DataCollectionModule[dcms.size()];
		for (int i = 0; i < dcms.size(); i++) {
			bDCMs[i] = new DataCollectionModule();
			bDCMs[i].setDate(dcms.get(i).getDate());
			bDCMs[i].setEventsubsetNumber(dcms.get(i).getEventSubsetNumber());
			bDCMs[i].setId(dcms.get(i).getId());
			bDCMs[i].setName(dcms.get(i).getName());
			bDCMs[i].setQuestionGroup(getBRIDGQuestionGroup(dcms.get(i)
					.getQuestionGroups()));
		}
		return bDCMs;
	}

	protected gov.nih.nci.cabig.ccts.domain.bridg.QuestionGroup[] getBRIDGQuestionGroup(
			List<QuestionGroup> questionGroups) {
		gov.nih.nci.cabig.ccts.domain.bridg.QuestionGroup[] bQuestionGroups = new gov.nih.nci.cabig.ccts.domain.bridg.QuestionGroup[questionGroups
				.size()];
		for (int i = 0; i < questionGroups.size(); i++) {
			bQuestionGroups[i] = new gov.nih.nci.cabig.ccts.domain.bridg.QuestionGroup();
			bQuestionGroups[i].setId(questionGroups.get(i).getId());
			bQuestionGroups[i].setName(questionGroups.get(i).getName());
			bQuestionGroups[i].setQuestion(getBRIDGQuestions(questionGroups
					.get(i).getQuestions()));
		}
		return bQuestionGroups;
	}

	protected Question[] getBRIDGQuestions(
			List<gov.nih.nci.cdmsconnector.domain.Question> questions) {
		Question[] bQuestions = new Question[questions.size()];
		for (int i = 0; i < questions.size(); i++) {
			bQuestions[i] = new Question();
			bQuestions[i].setDefaultPrompt(questions.get(i).getDefaultPrompt());
			bQuestions[i].setId(questions.get(i).getId());
			bQuestions[i].setName(questions.get(i).getName());
			bQuestions[i].setRepeatSequence(questions.get(i)
					.getRepeatSequence());

			gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement cde = new gov.nih.nci.cabig.ccts.domain.bridg.CommonDataElement();
			cde.setPublicIdentifier(questions.get(i).getCde()
					.getPublicIdentifier());
			cde.setVersion(questions.get(i).getCde().getVersion());
			bQuestions[i].setCommonDataElement(cde);

			QuestionValue qv = new QuestionValue();
			qv.setValue(questions.get(i).getValue());

			bQuestions[i].setQuestionValue(qv);
		}

		return bQuestions;
	}

}