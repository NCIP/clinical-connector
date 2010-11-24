package gov.nih.nci.clinicalconnector.domain.validator;

import gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest;
import gov.nih.nci.clinicalconnector.domain.validator.DataValidationException;

public interface EnrollPatientRequestValidator {

	public boolean validate(EnrollPatientRequest request)
			throws DataValidationException, Exception;

}
