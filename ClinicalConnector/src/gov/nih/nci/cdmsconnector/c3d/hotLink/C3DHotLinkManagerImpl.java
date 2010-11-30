package gov.nih.nci.cdmsconnector.c3d.hotLink;

import gov.nih.nci.cdmsconnector.hotLink.HotLinkManager;
import gov.nih.nci.clinicalconnector.c3d.security.C3DUser;
import gov.nih.nci.clinicalconnector.c3d.security.CSMCDMSConnectorSecurityManagerImpl;
import gov.nih.nci.clinicalconnector.dao.BaseJDBCDAO;
import gov.nih.nci.clinicalconnector.dao.HotLinkDAO;
import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;
import gov.nih.nci.cdmsconnector.util.Constants;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;

import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.cagrid.gaards.websso.utils.WebSSOConstants;

import com.opensymphony.xwork2.ActionContext;

public class C3DHotLinkManagerImpl implements HotLinkManager {
	static final Logger log = Logger.getLogger(C3DHotLinkManagerImpl.class
			.getName());

	private HotLinkDAO dao;
	private CSMCDMSConnectorSecurityManagerImpl securityManager;

	public String getHotLink(String userName, String password, String study,
			String patientPosition, String patientId, boolean savePassword)
			throws AccessPermissionException {
		log.debug("hotlink request received for study:" + study
				+ " and patientId:" + patientId);
		
		C3DUser c3dUser = null;
		String c3dUserName = null, c3dPassword = null;
		String userDN = null;

		try {
			Map parameters = ActionContext.getContext().getSession();
			userDN = (String) parameters
					.get(WebSSOConstants.CAGRID_SSO_GRID_IDENTITY);
			c3dUser = (C3DUser) securityManager.getUser(userDN);

			if (userName != null && password != null && !"".equals(userName)
					&& !"".equals(password)) {
				c3dUserName = userName;
				c3dPassword = password;
			} else {
				c3dUserName = c3dUser.getC3dUserName();
				c3dPassword = c3dUser.getC3dPassword();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new AccessPermissionException(e1.toString());
		}

		if (c3dUserName == null || c3dPassword == null) {
			throw new AccessPermissionException("Permission denied to user:"
					+ userDN);
		}

		try {
			BaseJDBCDAO.getConnection(c3dUserName, c3dPassword.substring(0,
					c3dPassword.indexOf('@'))).close();
			c3dUser.setC3dPassword(c3dPassword);
			c3dUser.setC3dUserName(c3dUserName);
			if(savePassword){
				securityManager.saveUser(c3dUser);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new AccessPermissionException("Bad username or password");
		}

		String transactionId = dao.createTransaction(c3dUserName, c3dPassword,
				study, patientPosition, patientId);

		return createHotLink(transactionId);
	}

	protected String createHotLink(String transactionId) {
		Properties props = null;
		try {
			props = PropertiesUtil.getPropertiesFromDB();
		} catch (Exception e) {

		}

		String c3dHotLinkURL = props.getProperty(Constants.C3D_HOT_LINK_URL);
		return c3dHotLinkURL + "?config=hotlinkrdc&otherparams=param_transid="
				+ transactionId
				+ "&HTMLbeforeForm=Please do not close this window";
	}

	public HotLinkDAO getDao() {
		return dao;
	}

	public void setDao(HotLinkDAO dao) {
		this.dao = dao;
	}

	public CSMCDMSConnectorSecurityManagerImpl getSecurityManager() {
		return securityManager;
	}

	public void setSecurityManager(
			CSMCDMSConnectorSecurityManagerImpl securityManager) {
		this.securityManager = securityManager;
	}

}
