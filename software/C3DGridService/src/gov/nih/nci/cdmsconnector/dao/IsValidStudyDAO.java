package gov.nih.nci.cdmsconnector.dao;

public interface IsValidStudyDAO {

	public boolean isValidStudy(String studyName) throws Exception;
	
	public boolean isStudyReadyForLoadLabs(String studyName) throws Exception;

}
