/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.test;

import gov.nih.nci.cdmsconnector.c3d.security.CSMCDMSConnectorSecurityManagerImpl;
import gov.nih.nci.cdmsconnector.manager.CDMSConnectorSecurityManager;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import junit.framework.TestCase;

public class CSMCDMSConnectorSecurityManagerTest extends TestCase{
	
	private String status;

	public void testCanAccess(){
		Map<String, Boolean> csmAccessPermissions = new HashMap<String, Boolean>();
		Properties AppProps = null;
		try {
			AppProps = PropertiesUtil.getAppProperties();
		} catch (Exception e) {
		}
		csmAccessPermissions.put(CDMSConnectorSecurityManager.ENROLLPATIENT_SERVICE, true);
		
		CSMCDMSConnectorSecurityManagerImpl securityManager = new CSMCDMSConnectorSecurityManagerImpl();
		securityManager.setCsmAccessPermissions(csmAccessPermissions);
		
		setName("PermissionsTest");
		
		StringBuffer message= new StringBuffer();
		boolean success=true;
		
		if(!securityManager.canAccess("testUser1", CDMSConnectorSecurityManager.ENROLLPATIENT_SERVICE, 
				AppProps.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMRegRole))){
			success=false;
			message.append("testUser1 not allowed to enroll: with csm check\n");
		}
		
		if(securityManager.canAccess("testUser2", CDMSConnectorSecurityManager.ENROLLPATIENT_SERVICE, 
				AppProps.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMRegRole))){
			success=false;
			message.append("testUser2 allowed to enroll: with csm check\n");
		}

		csmAccessPermissions.put(CDMSConnectorSecurityManager.ENROLLPATIENT_SERVICE, false);
		
		if(!securityManager.canAccess("testUser1", CDMSConnectorSecurityManager.ENROLLPATIENT_SERVICE, 
				AppProps.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMRegRole))){
			success=false;
			message.append("testUser1 not allowed to enroll: without csm check\n");
		}
		
		if(!securityManager.canAccess("testUser2", CDMSConnectorSecurityManager.ENROLLPATIENT_SERVICE, 
				AppProps.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMRegRole))){
			success=false;
			message.append("testUser2 not allowed to enroll: without csm check\n");
		}
		
		status = message.toString();
		
		//if(!success){
			//fail(status);
		//}
		
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}

