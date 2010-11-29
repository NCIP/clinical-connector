package gov.nih.nci.clinicalconnector.manager;

import gov.nih.nci.cabig.ctms.suite.authorization.SuiteRole;
import gov.nih.nci.clinicalconnector.manager.CDMSConnectorSecurityManager;
import gov.nih.nci.security.authorization.domainobjects.User;
import gov.nih.nci.security.util.StringEncrypter.EncryptionException;

public interface CSMCDMSConnectorSecurityManager extends
		CDMSConnectorSecurityManager {

	public boolean canAccess(String userName, String serviceName, String privName);
	public void checkLabAuthorization(String callerId, String studyName, String siteName, SuiteRole checkRole) throws Exception;
	public SuiteRole getRole(String roleText);
	public void checkAuthorization(String callerId, String studyName, String siteName, SuiteRole checkRole) throws Exception;
	public User getUser(String userName) throws EncryptionException;
	public void saveUser(User user) throws EncryptionException;

}
