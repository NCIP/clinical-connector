package gov.nih.nci.cdmsconnector.domain;

import java.util.ArrayList;
import java.util.List;

public class Study {

	private String studyIdentifier, investigator;
	private HealthCareFacility studySite;
	List<StudySubject> studySubjects;
	
	// Events should be a subset of StudySubject --PRC
	 List<Event> events;
	
	// Events should be a subset of StudySubject --PRC
	public Study(){
		events=new ArrayList<Event>();
		studySubjects=new ArrayList<StudySubject>();
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
    	
	/*public Study(){
		studySubjects=new ArrayList<StudySubject>();
		}
    */
	
	public List<StudySubject> getStudySubjects() {
		return studySubjects;
		}

	public void setStudySubjects(List<StudySubject> studySubjects) {
		this.studySubjects = studySubjects;
		}
	
	public String getStudyIdentifier() {
		return studyIdentifier;
	}

	public void setStudyIdentifier(String studyIdentifier) {
		this.studyIdentifier = studyIdentifier;
	}

	public String getInvestigator() {
		return investigator;
	}

	public void setInvestigator(String investigator) {
		this.investigator = investigator;
	}

	public HealthCareFacility getStudySite() {
		return studySite;
	}

	public void setStudySite(HealthCareFacility studySite) {
		this.studySite = studySite;
	}
}
