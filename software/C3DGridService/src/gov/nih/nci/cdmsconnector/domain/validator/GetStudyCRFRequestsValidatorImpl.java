/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain.validator;

import gov.nih.nci.cdmsconnector.dao.IsValidStudyDAO;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFDataRequest;
//import gov.nih.nci.cdmsconnector.domain.GetStudyCRFDataRequest;
//import gov.nih.nci.cdmsconnector.domain.GetStudyCRFsRequest;

public class GetStudyCRFRequestsValidatorImpl implements
		GetStudyCRFRequestsValidator {
	
	IsValidStudyDAO isValidStudyDAO;

	public boolean validate(GetStudyCRFDataRequest request)
			throws Exception {
		if(!isValidStudyDAO.isValidStudy(request.getStudyName())){
			throw new DataValidationException("Invalid Study:"+request.getStudyName());
		}
		return true;
	}

	public boolean validate(GetStudyCRFsRequest request)
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
