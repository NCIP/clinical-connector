package gov.nih.nci.cdmsconnector.c3d.security;

import gov.nih.nci.cdmsconnector.manager.CSMCDMSConnectorSecurityManager;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;
import gov.nih.nci.security.AuthorizationManager;
import gov.nih.nci.security.SecurityServiceProvider;
import gov.nih.nci.security.authorization.domainobjects.User;
import gov.nih.nci.security.exceptions.CSConfigurationException;
import gov.nih.nci.security.exceptions.CSException;
import gov.nih.nci.security.util.StringEncrypter;
import gov.nih.nci.security.util.StringEncrypter.EncryptionException;

import java.util.Map;
import java.util.Properties;

public class CSMCDMSConnectorSecurityManagerImpl implements
		CSMCDMSConnectorSecurityManager {

	Map<String, Boolean> csmAccessPermissions;

	public boolean canAccess(String userName, String serviceName, String privName) {
		/*Properties props = null;
		try {
			props = PropertiesUtil.getProperties();
		} catch (Exception e) {
		}*/
		if (!csmAccessPermissions.get(serviceName))
			return true;
		/* PRC Turned off Role and Privilege Checking
		
		AuthorizationManager authManager;
		
		try {
			authManager = SecurityServiceProvider
			        .getAuthorizationManager(props.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMAppName));
					//.getAuthorizationManager("c3d");
			return authManager.checkPermission(userName, serviceName, privName);
					//Constants.CSM_ACCESS_PRIVILEGE);
		} catch (CSConfigurationException e) {
			e.printStackTrace();
		} catch (CSException e) {
			e.printStackTrace();
		}
		return false;*/
		return true;
	}

	public C3DUser getUser(String userName) throws EncryptionException {
		AuthorizationManager authManager;
		C3DUser user=null;
		try {
			authManager = SecurityServiceProvider
					.getAuthorizationManager("c3d");
			user= (C3DUser)authManager.getUser(userName);
			user.setC3dPassword((new StringEncrypter()).decrypt(user.getC3dPassword().trim()));
			
		} catch (CSConfigurationException e) {
			e.printStackTrace();
		} catch (CSException e) {
			e.printStackTrace();
		}
		return user;
	}

	public Map<String, Boolean> getCsmAccessPermissions() {
		return csmAccessPermissions;
	}

	public void setCsmAccessPermissions(
			Map<String, Boolean> csmAccessPermissions) {
		this.csmAccessPermissions = csmAccessPermissions;
	}

	public void saveUser(User user) throws EncryptionException {
		AuthorizationManager authManager;
		C3DUser csmUser = (C3DUser) ((C3DUser)user).clone();
		csmUser.setC3dPassword((new StringEncrypter()).encrypt(csmUser.getC3dPassword().trim()));
		try {
			authManager = SecurityServiceProvider
					.getAuthorizationManager("c3d");
			authManager.modifyUser(user);
		} catch (CSConfigurationException e) {
			e.printStackTrace();
		} catch (CSException e) {
			e.printStackTrace();
		}
	}

}
