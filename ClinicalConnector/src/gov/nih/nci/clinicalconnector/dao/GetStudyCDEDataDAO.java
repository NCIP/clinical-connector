package gov.nih.nci.clinicalconnector.dao;

import gov.nih.nci.cdmsconnector.domain.GetStudyCDEDataRequest;
import gov.nih.nci.cdmsconnector.domain.GetStudyCDEsRequest;
import gov.nih.nci.cdmsconnector.domain.Study;

import java.util.Set;

public interface GetStudyCDEDataDAO {

	public Set<Study> getStudyCDEData(GetStudyCDEDataRequest getStudyCDEDataRequest) throws Exception;
	
	public Set<Study> getStudyCDEs(GetStudyCDEsRequest getStudyCDEsRequest) throws Exception;

}
