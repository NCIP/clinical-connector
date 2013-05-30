/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.c3d.capture;

import gov.nih.nci.cdmsconnector.capture.C3DCaptureManager;
import gov.nih.nci.clinicalconnector.dao.CaptureDAO;
import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;

import org.apache.log4j.Logger;
import org.globus.gsi.GlobusCredential;
import org.jasig.cas.authentication.Authentication;
import org.jasig.cas.authentication.principal.UsernamePasswordCredentials;

import com.opensymphony.xwork2.ActionContext;

public class C3DCaptureManagerImpl implements C3DCaptureManager {
	static final Logger log = Logger.getLogger(C3DCaptureManagerImpl.class
			.getName());

	private CaptureDAO dao;

	public String getCapture(String gridIdName, String gridIdPassword, 
			String userName, String password)
			throws AccessPermissionException {

		log.debug("Inside Capture Manager");
		System.out.println("Inside Capture Manager");

		String userDN = null;
		String delegatedReference = null;

		GlobusCredential globusCredential;

		try {
			org.cagrid.gaards.websso.authentication.CaGridAuthenticationManager authManager = new org.cagrid.gaards.websso.authentication.CaGridAuthenticationManager();
			UsernamePasswordCredentials credentials = new UsernamePasswordCredentials();
			credentials.setUsername(gridIdName.trim());
			credentials.setPassword(gridIdPassword.trim());
			Authentication auth = authManager.authenticate(credentials);
			
			log.debug("Grid Id Name authenticated");
			//System.out.println("Grid Id Name " + gridIdName +" authenticated");
			
			delegatedReference = authManager.getSerializedDelegationEpr();
			globusCredential = authManager.getCredentials();
			userDN=globusCredential.getIdentity();
			System.out.println("globusCredential getIdentity()= " + userDN);


		} catch (Exception e) {
			System.out.println("Error creating the client");
			e.printStackTrace();
			return "Error creating Grid Client.  Contact administrator.";
			//throw new RuntimeException(e);
		}
		
		dao.createTransaction(userDN, userName, password);
		return null;

	}

	public CaptureDAO getDao() {
		return dao;
	}

	public void setDao(CaptureDAO dao) {
		this.dao = dao;
	}


}
