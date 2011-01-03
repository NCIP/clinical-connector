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
