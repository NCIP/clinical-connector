package gov.nih.nci.clinicalconnector.manager;

import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;
import gov.nih.nci.clinicalconnector.manager.InvalidRequestException;


public interface EnrollPatientManager {
	
    //public void enrollPatient(gov.nih.nci.cabig.ccts.domain.EnrollPatientRequest enrollPatientRequest) throws InvalidRequestException;

	public Object enrollPatient(Object request) throws InvalidRequestException, AccessPermissionException;

}
