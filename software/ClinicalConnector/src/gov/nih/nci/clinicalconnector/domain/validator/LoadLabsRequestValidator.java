/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.domain.validator;

import gov.nih.nci.cdmsconnector.domain.LoadLabsRequest;
import gov.nih.nci.clinicalconnector.domain.validator.DataValidationException;
import gov.nih.nci.clinicalconnector.manager.InvalidStudyException;

public interface LoadLabsRequestValidator {

	public boolean validate(LoadLabsRequest request)
			throws DataValidationException, InvalidStudyException, Exception;

}
