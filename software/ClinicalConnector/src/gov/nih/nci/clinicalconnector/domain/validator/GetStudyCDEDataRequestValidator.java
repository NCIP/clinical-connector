/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.domain.validator;

import gov.nih.nci.cdmsconnector.domain.GetStudyCDEDataRequest;
import gov.nih.nci.cdmsconnector.domain.GetStudyCDEsRequest;
import gov.nih.nci.clinicalconnector.domain.validator.DataValidationException;

public interface GetStudyCDEDataRequestValidator {

	public boolean validate(GetStudyCDEDataRequest request)
			throws DataValidationException, Exception;

	public boolean validate(GetStudyCDEsRequest request)
			throws DataValidationException, Exception;

}
