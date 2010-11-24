package gov.nih.nci.cdmsconnector.domain.validator;

import gov.nih.nci.cdmsconnector.domain.LoadLabsRequest;

public interface LoadLabsRequestValidator {

	public boolean validate(LoadLabsRequest request)
			throws DataValidationException, Exception;

}
