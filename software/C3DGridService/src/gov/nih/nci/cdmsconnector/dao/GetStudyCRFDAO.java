/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.dao;

import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsRequest;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFDataRequest;
import gov.nih.nci.cabig.ccts.domain.c3dstudydatametadata.StudyDataMetadata;

//import java.util.Set;

public interface GetStudyCRFDAO {

	public StudyDataMetadata getStudyCRFData(GetStudyCRFDataRequest getStudyCRFDataRequest) throws Exception;
	
	public StudyDataMetadata getStudyCRFs(GetStudyCRFsRequest getStudyCRFsRequest) throws Exception;

}
