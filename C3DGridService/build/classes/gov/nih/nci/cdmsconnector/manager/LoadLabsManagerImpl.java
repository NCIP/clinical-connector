package gov.nih.nci.cdmsconnector.manager;

import java.util.Properties;

import gov.nih.nci.cdmsconnector.dao.LoadLabsDAO;
import gov.nih.nci.cdmsconnector.domain.adapter.EnrollPatientAdapter;
import gov.nih.nci.cdmsconnector.domain.adapter.LoadLabsAdapter;
import gov.nih.nci.cdmsconnector.domain.adapter.bridg111.BRIDG111Adapter;
import gov.nih.nci.cdmsconnector.domain.validator.LoadLabsRequestValidator;
import gov.nih.nci.cdmsconnector.domain.validator.StudyNotReadyException;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;

import org.apache.log4j.Logger;

public class LoadLabsManagerImpl implements LoadLabsManager {
	private final static Logger log = Logger
			.getLogger(LoadLabsManagerImpl.class.getName());

	protected LoadLabsAdapter modelAdapter;
	protected LoadLabsDAO loadLabsDAO;
	protected LoadLabsRequestValidator validator;
	protected CDMSConnectorSecurityManager securityManager;

	private LoadLabsAdapter cctsModelAdapter;

	public Object loadLabs(Object request) throws Exception {
		/*Properties DBprops = null;
		try {
			DBprops = PropertiesUtil.getDBProperties();
		} catch (Exception e) {
		}*/
		Properties AppProps = null;
		try {
			AppProps = PropertiesUtil.getAppProperties();
		} catch (Exception e) {
		}
		String userDN = null;
		try {
			userDN = gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils
					.getCallerIdentity();
			if (!securityManager.canAccess(userDN, CDMSConnectorSecurityManager.LOADLABS_SERVICE, 
					AppProps.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMLabRole))) {
				throw new AccessPermissionException(
						"loadLabs permission denied to user:" + userDN);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new AccessPermissionException(e1.toString());
		}

		Object response = null;

		gov.nih.nci.cdmsconnector.domain.LoadLabsRequest cdmsRequest = null;

		LoadLabsAdapter adapter = cctsModelAdapter;
		if (cctsModelAdapter.getLoadLabsRequestType().isAssignableFrom(
				request.getClass())) {
			adapter = cctsModelAdapter;
		}

		cdmsRequest = adapter.mapAndValidateLoadLabsRequest(request);

		String error = null;
		try {
			validator.validate(cdmsRequest);
		} catch (StudyNotReadyException snre) {
			error = snre.getMessage();
		}

		loadLabsDAO.loadLabs(cdmsRequest);

		if (error == null) {
			response = adapter
					.createLoadLabsResponse(LoadLabsAdapter.PROCESSED);
		} else {
			response = adapter
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

	public LoadLabsAdapter getCctsModelAdapter() {
		return cctsModelAdapter;
	}

	public void setCctsModelAdapter(LoadLabsAdapter cctsModelAdapter) {
		this.cctsModelAdapter = cctsModelAdapter;
	}

}
