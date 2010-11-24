package gov.nih.nci.cdmsconnector.manager;

import java.rmi.RemoteException;



public interface IsValidStudyManager {
	
	  public Object isValidStudy(Object isValidStudyRequest) throws RemoteException, Exception;
	
}
