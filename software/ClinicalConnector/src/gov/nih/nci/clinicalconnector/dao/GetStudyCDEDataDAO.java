/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.dao;

import gov.nih.nci.cdmsconnector.domain.GetStudyCDEDataRequest;
import gov.nih.nci.cdmsconnector.domain.GetStudyCDEsRequest;
import gov.nih.nci.cdmsconnector.domain.Study;

import java.util.Set;

public interface GetStudyCDEDataDAO {

	public Set<Study> getStudyCDEData(GetStudyCDEDataRequest getStudyCDEDataRequest) throws Exception;
	
	public Set<Study> getStudyCDEs(GetStudyCDEsRequest getStudyCDEsRequest) throws Exception;

}
