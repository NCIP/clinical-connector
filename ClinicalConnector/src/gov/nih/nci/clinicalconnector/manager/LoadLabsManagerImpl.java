package gov.nih.nci.clinicalconnector.manager;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import gov.nih.nci.cdmsconnector.domain.LabResult;
import gov.nih.nci.cdmsconnector.domain.adapter.EnrollPatientAdapter;
import gov.nih.nci.cdmsconnector.domain.adapter.LoadLabsAdapter;
import gov.nih.nci.clinicalconnector.dao.LoadLabsDAO;
import gov.nih.nci.clinicalconnector.domain.adapter.bridg111.BRIDG111Adapter;
import gov.nih.nci.clinicalconnector.domain.validator.LoadLabsRequestValidator;
import gov.nih.nci.clinicalconnector.domain.validator.StudyNotReadyException;
import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;
import gov.nih.nci.clinicalconnector.manager.CDMSConnectorSecurityManager;
import gov.nih.nci.clinicalconnector.manager.LoadLabsManager;
import gov.nih.nci.clinicalconnector.manager.LoadLabsManagerImpl;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;
import gov.nih.nci.clinicalconnector.domain.adapter.bridg21.BRIDG21Adapter;
import gov.nih.nci.cabig.ctms.suite.authorization.SuiteRole;

import org.apache.log4j.Logger;

public class LoadLabsManagerImpl implements LoadLabsManager {
	private final static Logger log = Logger
			.getLogger(LoadLabsManagerImpl.class.getName());

	protected LoadLabsAdapter modelAdapter;
	protected LoadLabsDAO loadLabsDAO;
	protected LoadLabsRequestValidator validator;
	protected CDMSConnectorSecurityManager securityManager;

	/* PRC Turned OFF CCTSAdapter
	 * private gov.nih.nci.cdmsconnector.domain.adapter.LoadLabsAdapter cctsModelAdapter;
	 */
	private BRIDG111Adapter BRIDG111ModelAdapter;
	private BRIDG21Adapter bridg21ModelAdapter;

	public Object loadLabs(Object request) throws Exception {
		Properties props = null;
		try {
			props = PropertiesUtil.getPropertiesFromDB();
		} catch (Exception e) {
		}
		/*String userDN = null;
		try {
			userDN = gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils
					.getCallerIdentity();
			if (!securityManager.canAccess(userDN, CDMSConnectorSecurityManager.LOADLABS_SERVICE, 
					props.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMLabRole))) {
				throw new AccessPermissionException(
						"loadLabs permission denied to user:" + userDN);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new AccessPermissionException(e1.toString());
		}*/

		Object response = null;

		gov.nih.nci.cdmsconnector.domain.LoadLabsRequest cdmsRequest = null;

		/* PRC Turned off CCTSAdapter
		 * LoadLabsAdapter adapter = cctsModelAdapter;
		 
		if (cctsModelAdapter.getLoadLabsRequestType().isAssignableFrom(
				request.getClass())) {
			adapter = cctsModelAdapter;
		} else */
		if (bridg21ModelAdapter.getLoadLabsRequestType().isAssignableFrom(
				request.getClass())) {
			modelAdapter = bridg21ModelAdapter;
		} else {
			throw new InvalidRequestException("Invalid Model Passed");
		}

		cdmsRequest = modelAdapter.mapAndValidateLoadLabsRequest(request);

		String userDN = null;
	    try {
		     userDN = gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils
				.getCallerIdentity();
 		} catch (Exception e1) {
	    	e1.printStackTrace();
		    throw new AccessPermissionException(e1.toString());
 		}

		for (LabResult result : cdmsRequest.getResults()) {

			if (result == null) {
				continue;
			}

			String studyName = result.getStudy().getStudyIdentifier();
			String siteName = null;
		    try {
		    	SuiteRole suiteRole = securityManager.getRole(props.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMLabRole));
		    	securityManager.checkLabAuthorization(userDN, studyName, siteName, suiteRole);
      		} catch (Exception e1) {
		    	e1.printStackTrace();
			    throw new AccessPermissionException(e1.toString());
      		}
		}

		String error = null;
		try {
			validator.validate(cdmsRequest);
		} catch (StudyNotReadyException snre) {
			error = snre.getMessage();
		}

		loadLabsDAO.loadLabs(cdmsRequest);

		if (error == null) {
			response = modelAdapter
					.createLoadLabsResponse(LoadLabsAdapter.PROCESSED);
		} else {
			response = modelAdapter
					.createLoadLabsResponse(LoadLabsAdapter.SUBMITTED + " : "
							+ error);
		}

		return response;

	}

	public LoadLabsAdapter getModelAdapter() {
		return modelAdapter;
	}

	public void setModelAdapter(LoadLabsAdapter modelAdapter) {
		this.modelAdapter = modelAdapter;
	}

	public LoadLabsDAO getLoadLabsDAO() {
		return loadLabsDAO;
	}

	public void setLoadLabsDAO(LoadLabsDAO loadLabsDAO) {
		this.loadLabsDAO = loadLabsDAO;
	}

	public LoadLabsRequestValidator getValidator() {
		return validator;
	}

	public void setValidator(LoadLabsRequestValidator validator) {
		this.validator = validator;
	}

	public CDMSConnectorSecurityManager getSecurityManager() {
		return securityManager;
	}

	public void setSecurityManager(CDMSConnectorSecurityManager securityManager) {
		this.securityManager = securityManager;
	}

	public gov.nih.nci.clinicalconnector.domain.adapter.bridg21.BRIDG21Adapter getBridg21ModelAdapter() {
		return bridg21ModelAdapter;
	}

	public void setBridg21ModelAdapter(
			gov.nih.nci.clinicalconnector.domain.adapter.bridg21.BRIDG21Adapter bridg21ModelAdapter) {
		this.bridg21ModelAdapter = bridg21ModelAdapter;
	}

	/* PRC
	 * The CLASS May be wrong here should use CCTSAdapter, right?
	public LoadLabsAdapter getCctsModelAdapter() {
		return cctsModelAdapter;
	}

	public void setCctsModelAdapter(LoadLabsAdapter cctsModelAdapter) {
		this.cctsModelAdapter = cctsModelAdapter;
	} */

}
