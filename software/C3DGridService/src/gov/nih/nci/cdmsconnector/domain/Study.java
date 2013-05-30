/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain;

import java.util.ArrayList;
import java.util.List;

public class Study {

	private String studyIdentifier, investigator;
	private HealthCareFacility studySite;
	List<StudySubject> studySubjects;
	
	// Events should be a subset of StudySubject --PRC
	 List<Event> events;

	 //List<CaseReportForm> crfs;
	 
	public Study(){
		events=new ArrayList<Event>();
		studySubjects=new ArrayList<StudySubject>();
		//crfs=new ArrayList<CaseReportForm>();		
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
    	
/*	public List<CaseReportForm> getCrfs() {
		return crfs;
	}

	public void setCrfs(List<CaseReportForm> crfs) {
		this.crfs = crfs;
	}
*/
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
