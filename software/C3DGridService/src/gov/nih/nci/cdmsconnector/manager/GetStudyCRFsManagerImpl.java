/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.manager;

import gov.nih.nci.cdmsconnector.dao.GetStudyCRFDAO;
import gov.nih.nci.cdmsconnector.domain.validator.GetStudyCRFRequestsValidator;
import gov.nih.nci.cdmsconnector.util.Utilities;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsResponse;
import gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudyDataMetadata;


import org.apache.log4j.Logger;

public class GetStudyCRFsManagerImpl implements GetStudyCRFsManager {
	private final static Logger log = Logger
			.getLogger(GetStudyCRFsManagerImpl.class.getName());

	protected GetStudyCRFDAO dao;
	protected GetStudyCRFRequestsValidator validator;
	protected CDMSConnectorSecurityManager securityManager;

	public Object getStudyCRFs(Object getStudyCRFsRequest)
			throws Exception {

		System.out.println(Utilities.getDateTime() + " - Get Study CRFs.");
		
		GetStudyCRFsRequest request = (gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsRequest) getStudyCRFsRequest;
		
		validator.validate(request);
		GetStudyCRFsResponse response = new GetStudyCRFsResponse();
		StudyDataMetadata[] studyDesign = new StudyDataMetadata[1];
		
		try {
			studyDesign[0] = dao.getStudyCRFs(request);
		}
		catch (Exception e1) {
			e1.printStackTrace();
			throw new AccessPermissionException(e1.toString());
		}

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
