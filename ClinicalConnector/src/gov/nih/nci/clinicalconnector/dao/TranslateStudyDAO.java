package gov.nih.nci.clinicalconnector.dao;

//import gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest;

public interface TranslateStudyDAO {
	
	public String translateStudy(String studyName) throws Exception;

}
