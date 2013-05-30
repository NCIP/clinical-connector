/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class StudySubject {
	private String patientPosition, participantIdentifier, gender, firstName, lastName,
			initials;
	private Date enrollDate, birthDate; //, consentDate;
	private HealthCareFacility registrationSite;
	private PerformedSubjectMilestone subjectMilestone; //consentDate;
	private Event event;
	//private PerformedSubjectMilestone consentVersion;

	// Events should be a subset of StudySubject --PRC
	 List<Event> events;
	
	// Events should be a subset of StudySubject --PRC
	public StudySubject(){
		events=new ArrayList<Event>();
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	public String getPatientPosition() {
		return patientPosition;
	}
	public void setPatientPosition(String patientPosition) {
		this.patientPosition = patientPosition;
	}
	public String getParticipantIdentifier() {
		return participantIdentifier;
	}
	public void setParticipantIdentifier(String participantIdentifier) {
		this.participantIdentifier = participantIdentifier;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public HealthCareFacility getRegistrationSite() {
		return registrationSite;
	}
	public void setRegistrationSite(HealthCareFacility registrationSite) {
		this.registrationSite = registrationSite;
	}
	/*public PerformedSubjectMilestone getConsentDate() {
		return getConsentDate();
	}
	public void setConsentDate(PerformedSubjectMilestone subjectMilestone) {
		this.subjectMilestone = subjectMilestone;
	}
	public PerformedSubjectMilestone getConsentVersion() {
		return getConsentVersion();
	}
	public void setConsentVersion(PerformedSubjectMilestone subjectMilestone) {
		this.subjectMilestone = subjectMilestone;
	}*/
	public PerformedSubjectMilestone getSubjectMilesStone() {
		return this.subjectMilestone;
	}
	public void setSubjectMilesStone(PerformedSubjectMilestone subjectMilestone) {
		this.subjectMilestone = subjectMilestone;
	}
	public Event getEvent() {
		return this.event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
}
