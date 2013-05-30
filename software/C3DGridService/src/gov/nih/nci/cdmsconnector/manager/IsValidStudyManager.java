/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.manager;

import java.rmi.RemoteException;



public interface IsValidStudyManager {
	
	  public Object isValidStudy(Object isValidStudyRequest) throws RemoteException, Exception;
	
}
