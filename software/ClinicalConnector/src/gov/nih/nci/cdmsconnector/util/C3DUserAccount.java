/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.util;

import gov.nih.nci.clinicalconnector.c3d.security.C3DUser;
import gov.nih.nci.clinicalconnector.dao.BaseJDBCDAO;
import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;
import gov.nih.nci.security.AuthorizationManager;
import gov.nih.nci.security.SecurityServiceProvider;

import java.sql.Connection;

import org.apache.log4j.Logger;

public class C3DUserAccount {

	private final static Logger log = Logger
	.getLogger(C3DUserAccount.class.getName());
	
	public C3DUserAccount(String UName, String PWord)
	throws Exception {

		//String studyName = getStudyCDEDataRequest.getStudyName();
		//CommonDataElement cde = getStudyCDEDataRequest.getCommonDataElement();

		//PRC study access checking
		Connection cn = null;
				
	
		//C3DUser c3dUser = null;
		String c3dUserName = null, c3dPassword = null, userDN = null;
		//CSMCDMSConnectorSecurityManagerImpl securityManager = null;
		AuthorizationManager authManager;
		C3DUser user=null;
	
		try {
		//log.fatal("FATAL - " + "userDN() = '" 	+ userDN + "'");
		userDN = gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils.getCallerIdentity();
		//log.fatal("FATAL - " + "userDN() = '" 	+ userDN + "'");
		authManager = SecurityServiceProvider.getAuthorizationManager("c3d");
		user= (C3DUser) authManager.getUser(userDN);
		//log.fatal("FATAL - " + "user.getC3dUserName() = '" 	+ user.getC3dUserName()+ "'");
        // --
		c3dUserName = user.getC3dUserName();
		c3dPassword = user.getC3dPassword();
		//user.setC3dPassword((new gov.nih.nci.cdmsconnector.util.StringEncrypter()).encrypt("oc#dev15b"));
		//user.setC3dUserName(c3dUserName);
		//log.fatal("FATAL - " + "user.getC3dPassword() = '" 	+ user.getC3dPassword()+ "'");
		//log.fatal("FATAL - " + "Calling modifyUser" + "'");
		//authManager.modifyUser(user);
		//log.fatal("FATAL - " + "After modifyUser" + "'");
		//c3dPassword = user.getC3dPassword();
        //--
		gov.nih.nci.cdmsconnector.util.StringEncrypter encrypter = new gov.nih.nci.cdmsconnector.util.StringEncrypter();
		c3dPassword = encrypter.oDecrypt(c3dPassword);
		//log.fatal("FATAL - " + "decrypted c3dPassword = '" 	+ c3dPassword + "'");
	} catch (Exception e1) {
		e1.printStackTrace();
		throw new AccessPermissionException(e1.toString());
	}

	//if (c3dUserName == null || c3dPassword == null) {
	//	throw new AccessPermissionException("Permission denied to user:"
	//			+ userDN + "Username or Password cannot be null");
	//}

	log.fatal("FATAL - " + "c3dUserName='" + c3dUserName + "'");
	log.fatal("FATAL - " + "c3dPassword='" + c3dPassword + "'");
	try {
		BaseJDBCDAO.getConnection(c3dUserName, c3dPassword);
	} catch (Exception e) {
		e.printStackTrace();
		throw new AccessPermissionException("Bad username ('" + c3dUserName +
				"') or password ('" + c3dPassword + "')");
	}
	
}

	public static class EncryptionException extends Exception {
		public EncryptionException(Throwable t) {
			super(t);
		}
	}
	
	public static void main(String args[]){
		try{
			C3DUserAccount se = new C3DUserAccount(null, null);
			
			//System.out.println( se.encrypt("C3DDCAPI") );
			
			//System.out.println( se.decrypt("nB5wkF1GNcs=") );
			
		}catch(Throwable e){
			e.printStackTrace();
		}
		
		
	}
}

