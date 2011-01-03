package gov.nih.nci.clinicalconnector.dao;

public interface HotLinkDAO {
	
	public String createTransaction(String userName, String password, String study, String patientPosition, String patientId);

}
