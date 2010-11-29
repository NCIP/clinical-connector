package gov.nih.nci.clinicalconnector.domain.validator;

import gov.nih.nci.cdmsconnector.domain.LoadLabsRequest;
import gov.nih.nci.clinicalconnector.domain.validator.DataValidationException;

public interface LoadLabsRequestValidator {

	public boolean validate(LoadLabsRequest request)
			throws DataValidationException, Exception;

}
