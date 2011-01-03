package gov.nih.nci.cdmsconnector.hotLink;

import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;

public interface HotLinkManager {

	public String getHotLink(String userName, String password, String study,
			String patientPosition, String patientId, boolean savePassword)
			throws AccessPermissionException;

}
