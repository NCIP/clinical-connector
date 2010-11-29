package gov.nih.nci.cdmsconnector.dao;

public interface HotLinkDAO {
	
	public String createTransaction(String userName, String password, String study, String patientPosition, String patientId);

}
