/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.capture;

import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;

public interface C3DCaptureManager {

	public String getCapture(String gridIdName, String gridIdPassword, 
			String userName, String password)
			throws AccessPermissionException;

}
