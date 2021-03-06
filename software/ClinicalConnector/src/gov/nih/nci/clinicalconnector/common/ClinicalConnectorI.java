/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.common;

import java.rmi.RemoteException;

/** 
 * This class is autogenerated, DO NOT EDIT.
 * 
 * This interface represents the API which is accessable on the grid service from the client. 
 * 
 * @created by Introduce Toolkit version 1.3
 * 
 */
public interface ClinicalConnectorI {

  public org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse getMultipleResourceProperties(org.oasis.wsrf.properties.GetMultipleResourceProperties_Element params) throws RemoteException ;

  public org.oasis.wsrf.properties.GetResourcePropertyResponse getResourceProperty(javax.xml.namespace.QName params) throws RemoteException ;

  public org.oasis.wsrf.properties.QueryResourcePropertiesResponse queryResourceProperties(org.oasis.wsrf.properties.QueryResourceProperties_Element params) throws RemoteException ;

  /**
   * Load Laboratory Test Result to Clinical Study
   *
   * @param loadLabsRequest
   */
  public clinicalconnector.nci.nih.gov.LoadLabsResponse loadLabs(clinicalconnector.nci.nih.gov.LoadLabsRequest loadLabsRequest) throws RemoteException ;

  /**
   * Register Subject on Clinical Study
   *
   * @param registerSubjectRequest
   */
  public clinicalconnector.nci.nih.gov.RegisterSubjectResponse registerSubject(clinicalconnector.nci.nih.gov.RegisterSubjectRequest registerSubjectRequest) throws RemoteException ;

}

