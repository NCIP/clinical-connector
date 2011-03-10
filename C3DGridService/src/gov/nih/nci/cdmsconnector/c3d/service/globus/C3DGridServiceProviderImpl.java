package gov.nih.nci.cdmsconnector.c3d.service.globus;

import gov.nih.nci.cdmsconnector.c3d.service.C3DGridServiceImpl;
import gov.nih.nci.cdmsconnector.util.FileLoader;

import java.io.FileInputStream;
import java.rmi.RemoteException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * DO NOT EDIT: This class is autogenerated!
 * 
 * This class implements each method in the portType of the service. Each method
 * call represented in the port type will be then mapped into the unwrapped
 * implementation which the user provides in the C3DGridServiceImpl class. This
 * class handles the boxing and unboxing of each method call so that it can be
 * correclty mapped in the unboxed interface that the developer has designed and
 * has implemented. Authorization callbacks are automatically made for each
 * method based on each methods authorization requirements.
 * 
 * @created by Introduce Toolkit version 1.2
 * 
 */
public class C3DGridServiceProviderImpl {

	C3DGridServiceImpl impl;

	public C3DGridServiceProviderImpl() throws RemoteException {
		XmlWebApplicationContext c = new XmlWebApplicationContext();
		c.setConfigLocation("classpath:applicationContext.xml");
		c.refresh();
		impl = (C3DGridServiceImpl) c.getBean("c3DGridService");
	}

    /* public gov.nih.nci.cdmsconnector.c3d.stubs.EnrollPatientResponse enrollPatient(gov.nih.nci.cdmsconnector.c3d.stubs.EnrollPatientRequest params) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.EnrollPatientException {
    gov.nih.nci.cdmsconnector.c3d.stubs.EnrollPatientResponse boxedResult = new gov.nih.nci.cdmsconnector.c3d.stubs.EnrollPatientResponse();
    boxedResult.setEnrollPatientResponse(impl.enrollPatient(params.getEnrollPatientRequest().getEnrollPatientRequest()));
    return boxedResult;
  } */

    /* public gov.nih.nci.cdmsconnector.c3d.stubs.LoadLabsResponse loadLabs(gov.nih.nci.cdmsconnector.c3d.stubs.LoadLabsRequest params) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.LoadLabsException {
    gov.nih.nci.cdmsconnector.c3d.stubs.LoadLabsResponse boxedResult = new gov.nih.nci.cdmsconnector.c3d.stubs.LoadLabsResponse();
    boxedResult.setLoadLabsResponse(impl.loadLabs(params.getLoadLabsRequest().getLoadLabsRequest()));
    return boxedResult;
  } */

    public gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataResponse getStudyCDEData(gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataRequest params) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.StudyDataException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException {
    gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataResponse boxedResult = new gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataResponse();
    boxedResult.setGetStudyCDEDataResponse(impl.getStudyCDEData(params.getGetStudyCDEDataRequest().getGetStudyCDEDataRequest()));
    return boxedResult;
  }

    public gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEsResponse getStudyCDEs(gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEsRequest params) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.StudyDataException {
    gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEsResponse boxedResult = new gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEsResponse();
    boxedResult.setGetStudyCDEsResponse(impl.getStudyCDEs(params.getGetStudyCDEsRequest().getGetStudyCDEsRequest()));
    return boxedResult;
  }

    public gov.nih.nci.cdmsconnector.c3d.stubs.IsValidStudyResponse isValidStudy(gov.nih.nci.cdmsconnector.c3d.stubs.IsValidStudyRequest params) throws RemoteException {
    gov.nih.nci.cdmsconnector.c3d.stubs.IsValidStudyResponse boxedResult = new gov.nih.nci.cdmsconnector.c3d.stubs.IsValidStudyResponse();
    boxedResult.setIsValidStudyResponse(impl.isValidStudy(params.getIsValidStudyRequest().getIsValidStudyRequest()));
    return boxedResult;
  }

    public gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCRFDataResponse getStudyCRFData(gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCRFDataRequest params) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.StudyDataException {
    gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCRFDataResponse boxedResult = new gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCRFDataResponse();
    boxedResult.setGetStudyCRFDataResponse(impl.getStudyCRFData(params.getGetStudyCRFDataRequest().getGetStudyCRFDataRequest()));
    return boxedResult;
  }

    public gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCRFsResponse getStudyCRFs(gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCRFsRequest params) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.StudyDataException {
    gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCRFsResponse boxedResult = new gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCRFsResponse();
    boxedResult.setGetStudyCRFsResponse(impl.getStudyCRFs(params.getGetStudyCRFsRequest().getGetStudyCRFsRequest()));
    return boxedResult;
  }

}