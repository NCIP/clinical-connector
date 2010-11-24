package gov.nih.nci.clinicalconnector.dao;

import gov.nih.nci.cdmsconnector.domain.LoadLabsRequest;

public interface LoadLabsDAO {

	public void loadLabs(LoadLabsRequest request) throws Exception;

}
