/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.manager;

import gov.nih.nci.cdmsconnector.dao.GetStudyCDEDataDAO;
import gov.nih.nci.cdmsconnector.domain.Study;
import gov.nih.nci.cdmsconnector.domain.adapter.GetStudyCDEDataAdapter;
import gov.nih.nci.cdmsconnector.domain.validator.GetStudyCDEDataRequestValidator;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;
import gov.nih.nci.cdmsconnector.util.Utilities;

import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

public class GetStudyCDEDataManagerImpl implements GetStudyCDEDataManager {
	private final static Logger log = Logger
			.getLogger(GetStudyCDEDataManagerImpl.class.getName());

	protected GetStudyCDEDataAdapter modelAdapter;
	protected GetStudyCDEDataDAO dao;
	protected GetStudyCDEDataRequestValidator validator;
	protected CDMSConnectorSecurityManager securityManager;

	public Object getStudyCDEData(Object getStudyCDEDataRequest)
			throws Exception {
		
		System.out.println(Utilities.getDateTime() + " - Get Study CDE Data.");
		
		Properties AppProps = null;
		try {
			AppProps = PropertiesUtil.getAppProperties();
		} catch (Exception e) {
		}
		String userDN=null;
		try {
			userDN=gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils.getCallerIdentity();
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new AccessPermissionException(e1.toString());
		}

		gov.nih.nci.cdmsconnector.domain.GetStudyCDEDataRequest cdmsRequest = modelAdapter.mapGetStudyCDEDataRequest(getStudyCDEDataRequest);
		validator.validate(cdmsRequest);
		Set<Study> studies = dao.getStudyCDEData(cdmsRequest);
		
		return modelAdapter.createGetStudyCDEDataResponse(studies);
	}

	public GetStudyCDEDataAdapter getModelAdapter() {
		return modelAdapter;
	}

	public void setModelAdapter(GetStudyCDEDataAdapter modelAdapter) {
		this.modelAdapter = modelAdapter;
	}

	public GetStudyCDEDataDAO getDao() {
		return dao;
	}

	public void setDao(GetStudyCDEDataDAO dao) {
		this.dao = dao;
	}
	
	public GetStudyCDEDataRequestValidator getValidator() {
		return validator;
	}

	public void setValidator(GetStudyCDEDataRequestValidator validator) {
		this.validator = validator;
	}
	public CDMSConnectorSecurityManager getSecurityManager() {
		return securityManager;
	}

	public void setSecurityManager(CDMSConnectorSecurityManager securityManager) {
		this.securityManager = securityManager;
	}

}
