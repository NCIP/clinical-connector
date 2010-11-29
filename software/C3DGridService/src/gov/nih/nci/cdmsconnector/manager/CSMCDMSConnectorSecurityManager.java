package gov.nih.nci.cdmsconnector.manager;

import gov.nih.nci.security.authorization.domainobjects.User;
import gov.nih.nci.security.util.StringEncrypter.EncryptionException;

public interface CSMCDMSConnectorSecurityManager extends
		CDMSConnectorSecurityManager {

	public boolean canAccess(String userName, String serviceName, String privName);
	public User getUser(String userName) throws EncryptionException;
	public void saveUser(User user) throws EncryptionException;

}
