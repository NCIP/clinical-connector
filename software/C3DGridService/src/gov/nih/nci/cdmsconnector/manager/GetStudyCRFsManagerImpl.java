package gov.nih.nci.cdmsconnector.manager;

import gov.nih.nci.cdmsconnector.dao.GetStudyCRFDAO;
//import gov.nih.nci.cdmsconnector.domain.Study;
//import gov.nih.nci.cdmsconnector.domain.adapter.GetStudyCRFsAdapter;
//import gov.nih.nci.cdmsconnector.domain.Study;
import gov.nih.nci.cdmsconnector.domain.validator.GetStudyCRFRequestsValidator;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsResponse;
//import gov.nih.nci.cabig.ccts.domain.bridg.StudyProtocol;
import gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudyDataMetadata;
//import gov.nih.nci.cabig.ccts.domain.cdt.II;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

public class GetStudyCRFsManagerImpl implements GetStudyCRFsManager {
	private final static Logger log = Logger
			.getLogger(GetStudyCRFsManagerImpl.class.getName());

	//protected GetStudyCRFsAdapter modelAdapter;
	protected GetStudyCRFDAO dao;
	protected GetStudyCRFRequestsValidator validator;
	protected CDMSConnectorSecurityManager securityManager;

	public Object getStudyCRFs(Object getStudyCRFsRequest)
			throws Exception {

		GetStudyCRFsRequest request = (gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsRequest) getStudyCRFsRequest;
		
		validator.validate(request);
		GetStudyCRFsResponse response = new GetStudyCRFsResponse();
		StudyDataMetadata[] studyDesign = new StudyDataMetadata[1];
		studyDesign[0] = dao.getStudyCRFs(request);
		/*StudyDataMetadata[] studyArr = new StudyDataMetadata[studies.size()];
		int i = 0;
		for (Iterator<StudyDataMetadata> iterator = studies.iterator(); iterator.hasNext();) {
			StudyDataMetadata study = (StudyDataMetadata) iterator.next();
			studyArr[i] = new StudyDataMetadata();
			studyArr[i].setStudyName(study.getStudyName());
			studyArr[i].setStudyMetadata(study.getStudyMetadata());
			studyArr[i].setStudyData(study.getStudyData());
		}*/

		response.setStudyDataMetadata(studyDesign);

		return response;		
	}

	/*public GetStudyCRFsAdapter getModelAdapter() {
		return modelAdapter;
	}

	public void setModelAdapter(GetStudyCRFsAdapter modelAdapter) {
		this.modelAdapter = modelAdapter;
	}*/

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
