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
