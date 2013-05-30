/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.hotLink;

import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;

public interface HotLinkManager {

	public String getHotLink(String userName, String password, String study,
			String patientPosition, String patientId, boolean savePassword)
			throws AccessPermissionException;

}
