/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain;

import java.util.ArrayList;
import java.util.List;

public class StudySite {

	private String studySiteName;
	List<StudySubject> studySubjects;
	 
	public StudySite(){
		studySubjects=new ArrayList<StudySubject>();
	}
	
	public List<StudySubject> getStudySubjects() {
		return studySubjects;
	}

	public void setStudySubjects(List<StudySubject> studySubjects) {
		this.studySubjects = studySubjects;
	}
	
	public String getStudySiteName() {
		return studySiteName;
	}

	public void setStudySiteName(String studySiteName) {
		this.studySiteName = studySiteName;
	}

}
