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
