/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain;


public class EnrollPatientRequest {
	
	private Study study;
	private StudySubject studySubject;

	public Study getStudy() {
		return study;
	}
	public void setStudy(Study study) {
		this.study = study;
	}
	public StudySubject getStudySubject() {
		return studySubject;
	}
	public void setStudySubject(StudySubject studySubject) {
		this.studySubject = studySubject;
	}

}
