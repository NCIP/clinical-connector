/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.manager;

import gov.nih.nci.cdmsconnector.dao.GetStudyCRFDAO;
import gov.nih.nci.cdmsconnector.domain.validator.GetStudyCRFRequestsValidator;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFDataRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFDataResponse;
import gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudyDataMetadata;
import org.apache.log4j.Logger;
import gov.nih.nci.cdmsconnector.util.Utilities;

public class GetStudyCRFDataManagerImpl implements GetStudyCRFDataManager {
	private final static Logger log = Logger
			.getLogger(GetStudyCRFDataManagerImpl.class.getName());

	protected GetStudyCRFDAO dao;
	protected GetStudyCRFRequestsValidator validator;
	protected CDMSConnectorSecurityManager securityManager;

	public Object getStudyCRFData(Object getStudyCRFDataRequest)
			throws Exception {
		
		System.out.println(Utilities.getDateTime() + " - Get Study CRF Data.");

		GetStudyCRFDataRequest request = (gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFDataRequest) getStudyCRFDataRequest;
		validator.validate(request);
		GetStudyCRFDataResponse response = new GetStudyCRFDataResponse();
		StudyDataMetadata[] studyDesign = new StudyDataMetadata[1]; 
		studyDesign[0] = dao.getStudyCRFData(request);
		
		response.setStudyDataMetadata(studyDesign);
		
		return response;		

	}

	public GetStudyCRFDAO getDao() {
		return dao;
	}

	public void setDao(GetStudyCRFDAO dao) {
		this.dao = dao;
	}
	
	public GetStudyCRFRequestsValidator getValidator() {
		return validator;
	}

	public void setValidator(GetStudyCRFRequestsValidator validator) {
		this.validator = validator;
	}
	public CDMSConnectorSecurityManager getSecurityManager() {
		return securityManager;
	}

	public void setSecurityManager(CDMSConnectorSecurityManager securityManager) {
		this.securityManager = securityManager;
	}

}
