package gov.nih.nci.cdmsconnector.dao;

import gov.nih.nci.cdmsconnector.domain.LoadLabsRequest;

public interface LoadLabsDAO {

	public void loadLabs(LoadLabsRequest request) throws Exception;

}
