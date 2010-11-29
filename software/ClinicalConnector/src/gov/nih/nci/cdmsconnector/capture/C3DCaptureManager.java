package gov.nih.nci.cdmsconnector.capture;

import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;

public interface C3DCaptureManager {

	public String getCapture(String gridIdName, String gridIdPassword, 
			String userName, String password)
			throws AccessPermissionException;

}
