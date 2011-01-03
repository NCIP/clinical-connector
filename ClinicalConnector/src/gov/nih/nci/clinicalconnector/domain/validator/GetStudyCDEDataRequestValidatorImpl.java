package gov.nih.nci.clinicalconnector.domain.validator;

import gov.nih.nci.cdmsconnector.domain.GetStudyCDEDataRequest;
import gov.nih.nci.cdmsconnector.domain.GetStudyCDEsRequest;
import gov.nih.nci.clinicalconnector.dao.IsValidStudyDAO;
import gov.nih.nci.clinicalconnector.domain.validator.DataValidationException;
import gov.nih.nci.clinicalconnector.domain.validator.GetStudyCDEDataRequestValidator;

public class GetStudyCDEDataRequestValidatorImpl implements
		GetStudyCDEDataRequestValidator {
	
	IsValidStudyDAO isValidStudyDAO;

	public boolean validate(GetStudyCDEDataRequest request)
			throws Exception {
		if(!isValidStudyDAO.isValidStudy(request.getStudyName())){
			throw new DataValidationException("Invalid Study:"+request.getStudyName());
		}
		return true;
	}

	public boolean validate(GetStudyCDEsRequest request)
			throws Exception {
		if(!isValidStudyDAO.isValidStudy(request.getStudyName())){
			throw new DataValidationException("Invalid Study:"+request.getStudyName());
		}
		return true;
	}

	public IsValidStudyDAO getIsValidStudyDAO() {
		return isValidStudyDAO;
	}

	public void setIsValidStudyDAO(IsValidStudyDAO isValidStudyDAO) {
		this.isValidStudyDAO = isValidStudyDAO;
	}
	
	
}
