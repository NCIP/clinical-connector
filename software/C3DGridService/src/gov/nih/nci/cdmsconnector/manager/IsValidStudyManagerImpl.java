package gov.nih.nci.cdmsconnector.manager;

import java.util.Properties;

import gov.nih.nci.cdmsconnector.dao.IsValidStudyDAO;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;

import org.apache.log4j.Logger;

public class IsValidStudyManagerImpl implements IsValidStudyManager {
	private final static Logger log = Logger
			.getLogger(IsValidStudyManagerImpl.class.getName());

	protected IsValidStudyDAO dao;
	protected CDMSConnectorSecurityManager securityManager;

	public Object isValidStudy(Object isValidStudyRequest) throws Exception {
		Properties AppProps = null;
		try {
			AppProps = PropertiesUtil.getAppProperties();
		} catch (Exception e) {
		}
		String userDN=null;
		try {
			userDN=gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils.getCallerIdentity();
			if(!securityManager.canAccess(userDN, CDMSConnectorSecurityManager.ISVALIDSTUDY_SERVICE,
					AppProps.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMLabRole))){
				throw new AccessPermissionException("IsValidStudy permission denied to user:"+userDN);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new AccessPermissionException(e1.toString());
		}
		gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyRequest req = (gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyRequest) isValidStudyRequest;
		gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse response = new gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse();

		response.setIsValid(new Boolean(dao.isValidStudy(req.getStudyName())));
		return response;
	}

	public IsValidStudyDAO getDao() {
		return dao;
	}

	public void setDao(IsValidStudyDAO dao) {
		this.dao = dao;
	}
	public CDMSConnectorSecurityManager getSecurityManager() {
		return securityManager;
	}

	public void setSecurityManager(CDMSConnectorSecurityManager securityManager) {
		this.securityManager = securityManager;
	}

}
