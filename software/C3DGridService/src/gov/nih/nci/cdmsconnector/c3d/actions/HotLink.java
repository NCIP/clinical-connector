package gov.nih.nci.cdmsconnector.c3d.actions;

import gov.nih.nci.cdmsconnector.hotLink.HotLinkManager;
import gov.nih.nci.cdmsconnector.manager.AccessPermissionException;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class HotLink extends ActionSupport {
	private final static Logger log = Logger.getLogger(HotLink.class.getName());

	private String study, patientId, hotLink, patientPosition, remember;
	//private boolean remember;
	private HotLinkManager hotLinkManager;
	private String c3dUserName, c3dPassword;

	public String execute() throws Exception {
		log.debug("creating hotlink for study:" + study + " and patientId:"
				+ patientId);

		boolean savePassword = !(remember==null || "".equals(remember));
		try {
			hotLink = hotLinkManager.getHotLink(c3dUserName, c3dPassword,
					study, patientPosition, patientId, savePassword);
		} catch (AccessPermissionException e) {
			e.printStackTrace();
			return ERROR;
		}

		return SUCCESS;

	}

	public String getHotLink() {
		return hotLink;
	}

	public String getStudy() {
		return study;
	}

	public void setStudy(String study) {
		this.study = study;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientPosition() {
		return patientPosition;
	}

	public void setPatientPosition(String patientPosition) {
		this.patientPosition = patientPosition;
	}

	public String getC3dUserName() {
		return c3dUserName;
	}

	public void setC3dUserName(String userName) {
		c3dUserName = userName;
	}

	public String getC3dPassword() {
		return c3dPassword;
	}

	public void setC3dPassword(String password) {
		c3dPassword = password;
	}

	public HotLinkManager getHotLinkManager() {
		return hotLinkManager;
	}

	public void setHotLinkManager(HotLinkManager hotLinkManager) {
		this.hotLinkManager = hotLinkManager;
	}

	public String isRemember() {
		return remember;
	}

	public void setRemember(String remember) {
		this.remember = remember;
	}
	
}
