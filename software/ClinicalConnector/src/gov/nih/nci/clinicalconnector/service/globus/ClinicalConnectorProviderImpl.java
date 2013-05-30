/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.service.globus;

import gov.nih.nci.clinicalconnector.service.ClinicalConnectorImpl;

import java.rmi.RemoteException;

import org.springframework.web.context.support.XmlWebApplicationContext;

/** 
 * DO NOT EDIT:  This class is autogenerated!
 *
 * This class implements each method in the portType of the service.  Each method call represented
 * in the port type will be then mapped into the unwrapped implementation which the user provides
 * in the ClinicalConnectorImpl class.  This class handles the boxing and unboxing of each method call
 * so that it can be correclty mapped in the unboxed interface that the developer has designed and 
 * has implemented.  Authorization callbacks are automatically made for each method based
 * on each methods authorization requirements.
 * 
 * @created by Introduce Toolkit version 1.3
 * 
 */
public class ClinicalConnectorProviderImpl{
	
	ClinicalConnectorImpl impl;
	
	public ClinicalConnectorProviderImpl() throws RemoteException {
		XmlWebApplicationContext c = new XmlWebApplicationContext();
		c.setConfigLocation("classpath:applicationContext.xml");
		c.refresh();
		impl = (ClinicalConnectorImpl) c.getBean("clinicalConnectorService");
	}
	

    public gov.nih.nci.clinicalconnector.stubs.LoadLabsResponse loadLabs(gov.nih.nci.clinicalconnector.stubs.LoadLabsRequest params) throws RemoteException {
    gov.nih.nci.clinicalconnector.stubs.LoadLabsResponse boxedResult = new gov.nih.nci.clinicalconnector.stubs.LoadLabsResponse();
    boxedResult.setLoadLabsResponse(impl.loadLabs(params.getLoadLabsRequest().getLoadLabsRequest()));
    return boxedResult;
  }

    public gov.nih.nci.clinicalconnector.stubs.RegisterSubjectResponse registerSubject(gov.nih.nci.clinicalconnector.stubs.RegisterSubjectRequest params) throws RemoteException {
    gov.nih.nci.clinicalconnector.stubs.RegisterSubjectResponse boxedResult = new gov.nih.nci.clinicalconnector.stubs.RegisterSubjectResponse();
    boxedResult.setRegisterSubjectResponse(impl.registerSubject(params.getRegisterSubjectRequest().getRegisterSubjectRequest()));
    return boxedResult;
  }

}

