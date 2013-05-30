/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.c3d.security;

import gov.nih.nci.clinicalconnector.manager.CSMCDMSConnectorSecurityManager;
//import gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol;
//import gov.nih.nci.cabig.ccts.domain.cdt.II;
import gov.nih.nci.cdmsconnector.domain.Study;
import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;
import gov.nih.nci.clinicalconnector.manager.CDMSConnectorSecurityManager;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;
import gov.nih.nci.security.AuthorizationManager;
import gov.nih.nci.security.SecurityServiceProvider;
import gov.nih.nci.security.authorization.domainobjects.User;
import gov.nih.nci.security.exceptions.CSConfigurationException;
import gov.nih.nci.security.exceptions.CSException;
import gov.nih.nci.security.util.StringEncrypter;
import gov.nih.nci.security.util.StringEncrypter.EncryptionException;
//import gov.nih.nci.security.authorization.domainobjects.Group;
//import gov.nih.nci.security.authorization.domainobjects.User;
//import gov.nih.nci.security.authorization.domainobjects.ProtectionGroupRoleContext;
//import gov.nih.nci.security.authorization.domainobjects.Role;
import gov.nih.nci.cabig.ctms.suite.authorization.SuiteRole;
import gov.nih.nci.cabig.ctms.suite.authorization.SuiteRoleMembership;
import gov.nih.nci.cabig.ctms.suite.authorization.SuiteAuthorizationAccessException;
import gov.nih.nci.cabig.ctms.suite.authorization.SuiteRoleMembershipLoader;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CSMCDMSConnectorSecurityManagerImpl implements
		CSMCDMSConnectorSecurityManager {

	Map<String, Boolean> csmAccessPermissions;

    public void checkLabAuthorization(String callerId, String studyName, 
    		String siteName, SuiteRole checkRole) throws Exception {
	    Properties props = null;
    	
        if (callerId == null) {
            throw new Exception("No user credentials provided");
        }

        int beginIndex = callerId.lastIndexOf("=") + 1;
        int endIndex = callerId.length();
        String username = callerId.substring(beginIndex, endIndex);
 
        try {
			props = PropertiesUtil.getPropertiesFromDB();
		} catch (Exception e) {
		}
		
        try {
    		AuthorizationManager authManager;
			authManager = SecurityServiceProvider.getAuthorizationManager(
					props.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMAppName));

			User user = authManager.getUser(username);
	        if (user == null) {
	        	throw new Exception("User" + username + " (" + callerId +") not found within CSM.");
	        }
	        long userId = user.getUserId().longValue();

   			SuiteRoleMembershipLoader suiteRoleMemLoader = new SuiteRoleMembershipLoader();
   			suiteRoleMemLoader.setAuthorizationManager(authManager);

        	Map<SuiteRole, SuiteRoleMembership> userRoleMemberships = suiteRoleMemLoader.getRoleMemberships(userId);
        	
            //SuiteRole checkRole = SuiteRole.REGISTRAR;
            if (userRoleMemberships.containsKey(checkRole)) {
               if (checkRole.isScoped()) {
                   SuiteRoleMembership userRoleMembership = userRoleMemberships.get(checkRole);
                   if (checkRole.isStudyScoped()) {
                       if (studyName == null) {
                           throw new SuiteAuthorizationAccessException(
                         		"Role %s is study scoped - study identifier is null", checkRole.getDisplayName());
                       }
                       // if the user has permission to access specific studies (not all studies), then verify the study
                       if (!userRoleMembership.isAllStudies() 
                     		  && !userRoleMembership.getStudyIdentifiers().contains(studyName)) {
                           throw new SuiteAuthorizationAccessException("Username %s is not authorized for study %s", username, studyName);
                       }
                   }

                   if (checkRole.isSiteScoped()) {
                       if (!(siteName == null)) {
                          // if the user has permission to access specific sites (not all sites), then verify the sites
                          if (!userRoleMembership.isAllSites() 
                       		   && !userRoleMembership.getSiteIdentifiers().contains(siteName)) {
                              throw new SuiteAuthorizationAccessException(
                           		"User %s is not authorized for site %s", username, siteName);
                          }
                       }
                   }
               }
           } else {
               throw new SuiteAuthorizationAccessException("Username %s is not authorized for role %s", username, checkRole.getDisplayName());
               }
           }
           catch (SuiteAuthorizationAccessException e) {
               //log.error("Error saving lab: ", e);
               throw new Exception(e.getMessage());
           }
    }

    public void checkAuthorization(String callerId, String studyName, 
    		String siteName, SuiteRole checkRole) throws Exception {
	    Properties props = null;
    	
        if (callerId == null) {
            throw new Exception("No user credentials provided");
        }

        //log.debug("Service called by: " + callerId);                            
        int beginIndex = callerId.lastIndexOf("=") + 1;
        int endIndex = callerId.length();
        String username = callerId.substring(beginIndex, endIndex);
 
        try {
			props = PropertiesUtil.getPropertiesFromDB();
		} catch (Exception e) {
		}
		
        try {
    		AuthorizationManager authManager;
			authManager = SecurityServiceProvider.getAuthorizationManager(
					props.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMAppName));

			User user = authManager.getUser(username);
	        if (user == null) {
	        	throw new Exception("User" + username + " (" + callerId + ") not found within CSM.");
	        }
	        long userId = user.getUserId().longValue();

   			SuiteRoleMembershipLoader suiteRoleMemLoader = new SuiteRoleMembershipLoader();
   			suiteRoleMemLoader.setAuthorizationManager(authManager);

        	Map<SuiteRole, SuiteRoleMembership> userRoleMemberships = suiteRoleMemLoader.getRoleMemberships(userId);
        	
            //SuiteRole checkRole = SuiteRole.REGISTRAR;
            if (userRoleMemberships.containsKey(checkRole)) {
               if (checkRole.isScoped()) {
                   SuiteRoleMembership userRoleMembership = userRoleMemberships.get(checkRole);
                   if (checkRole.isStudyScoped()) {
                       if (studyName == null) {
                           throw new SuiteAuthorizationAccessException(
                         		"Role %s is study scoped - study identifier is null", checkRole.getDisplayName());
                       }
                       // if the user has permission to access specific studies (not all studies), then verify the study
                       if (!userRoleMembership.isAllStudies() 
                     		  && !userRoleMembership.getStudyIdentifiers().contains(studyName)) {
                           throw new SuiteAuthorizationAccessException("Username %s is not authorized for study %s", username, studyName);
                       }
                   }

                   if (checkRole.isSiteScoped()) {
                       if (siteName == null) {
                           throw new SuiteAuthorizationAccessException(
                        		"Role %s is site scoped - site code is null", checkRole.getDisplayName());
                       }
                                                                    
                       // if the user has permission to access specific sites (not all sites), then verify the sites
                       if (!userRoleMembership.isAllSites() 
                    		   && !userRoleMembership.getSiteIdentifiers().contains(siteName)) {
                           throw new SuiteAuthorizationAccessException(
                        		"User %s is not authorized for site %s", username, siteName);
                       }
                   }
               }
           } else {
               throw new SuiteAuthorizationAccessException("Username %s is not authorized for role %s with study %s", username, checkRole.getDisplayName(), studyName);
               }
           }
           catch (SuiteAuthorizationAccessException e) {
               //log.error("Error saving lab: ", e);
               throw new Exception(e.getMessage());
           }
    }
    
	public SuiteRole getRole(String roleText){
		
		try {
			SuiteRole suiteRole = SuiteRole.getByCsmName(roleText);
			return suiteRole;
	
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new SuiteAuthorizationAccessException(e1.toString());
		}
	
	}
    
	public boolean canAccess(String userName, String protElemName, String rollName) {
		Properties props = null;
		
		try {
			props = PropertiesUtil.getPropertiesFromDB();
		} catch (Exception e) {
		}
		/*if (!csmAccessPermissions.get(protElemName))
			return true;*/
		AuthorizationManager authManager;
		try {
			authManager = SecurityServiceProvider
			        .getAuthorizationManager(props.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMAppName));
			SuiteRoleMembershipLoader suiteRoleMemLoader = new SuiteRoleMembershipLoader();
			suiteRoleMemLoader.setAuthorizationManager(authManager);
			//User csmUser = authManager.getUser(userName);
					//.getAuthorizationManager("c3d");
			//protElemName = "HealthcareSite." + protElemName;
			return authManager.checkPermission(userName, protElemName, rollName);
			/*String userId = csmUser.getUserId().toString();
			Set<Group> groups = authManager.getGroups(userId);
			Set<ProtectionGroupRoleContext> prGroups = authManager.getProtectionGroupRoleContextForUser(userId);

			for (Iterator<ProtectionGroupRoleContext> iterator = prGroups.iterator(); iterator.hasNext();) {
				ProtectionGroupRoleContext pGroup = (ProtectionGroupRoleContext) iterator.next();
				Set<Role> roles = pGroup.getRoles();
				for (Iterator<Role> iterator2 = roles.iterator(); iterator2.hasNext();) {
					Role role = (Role) iterator2.next();
				    if (role.getName().equals(privName)) {
					return true;
				    }
			    }
			}
			
			for (Iterator<Group> iterator = groups.iterator(); iterator.hasNext();) {
				Group group = (Group) iterator.next();
				if (group.getGroupName().equals(privName)) {
					return true;
				}
			}*/
			
		//Constants.CSM_ACCESS_PRIVILEGE) Use getGroups, then check returned set;
		} catch (CSConfigurationException e) {
			e.printStackTrace();
		} catch (CSException e) {
			e.printStackTrace();
		}
		return false;
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
