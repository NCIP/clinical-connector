/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain.validator;

import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFDataRequest;
//import gov.nih.nci.cdmsconnector.domain.GetStudyCRFsRequest;

public interface GetStudyCRFRequestsValidator {

	public boolean validate(GetStudyCRFDataRequest request)
			throws DataValidationException, Exception;

	public boolean validate(GetStudyCRFsRequest request)
			throws DataValidationException, Exception;

}
