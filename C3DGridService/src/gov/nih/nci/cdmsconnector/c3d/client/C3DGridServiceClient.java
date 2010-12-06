package gov.nih.nci.cdmsconnector.c3d.client;

import java.io.InputStream;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.AxisClient;
import org.apache.axis.client.Stub;
import org.apache.axis.configuration.FileProvider;
import org.apache.axis.message.addressing.EndpointReferenceType;
import org.apache.axis.types.URI.MalformedURIException;

import org.oasis.wsrf.properties.GetResourcePropertyResponse;

import org.globus.gsi.GlobusCredential;

import gov.nih.nci.cdmsconnector.c3d.stubs.C3DGridServicePortType;
import gov.nih.nci.cdmsconnector.c3d.stubs.service.C3DGridServiceAddressingLocator;
import gov.nih.nci.cdmsconnector.c3d.common.C3DGridServiceI;
import gov.nih.nci.cagrid.introduce.security.client.ServiceSecurityClient;

/**
 * This class is autogenerated, DO NOT EDIT GENERATED GRID SERVICE ACCESS METHODS.
 *
 * This client is generated automatically by Introduce to provide a clean unwrapped API to the
 * service.
 *
 * On construction the class instance will contact the remote service and retrieve it's security
 * metadata description which it will use to configure the Stub specifically for each method call.
 * 
 * @created by Introduce Toolkit version 1.3
 */
public class C3DGridServiceClient extends C3DGridServiceClientBase implements C3DGridServiceI {	

	public C3DGridServiceClient(String url) throws MalformedURIException, RemoteException {
		this(url,null);	
	}

	public C3DGridServiceClient(String url, GlobusCredential proxy) throws MalformedURIException, RemoteException {
	   	super(url,proxy);
	}
	
	public C3DGridServiceClient(EndpointReferenceType epr) throws MalformedURIException, RemoteException {
	   	this(epr,null);
	}
	
	public C3DGridServiceClient(EndpointReferenceType epr, GlobusCredential proxy) throws MalformedURIException, RemoteException {
	   	super(epr,proxy);
	}

	public static void usage(){
		System.out.println(C3DGridServiceClient.class.getName() + " -url <service url>");
	}
	
	public static void main(String [] args){
	    System.out.println("Running the Grid Service Client");
		try{
		if(!(args.length < 2)){
			if(args[0].equals("-url")){
			  C3DGridServiceClient client = new C3DGridServiceClient(args[1]);
			  // place client calls here if you want to use this main as a
			  // test....
			} else {
				usage();
				System.exit(1);
			}
		} else {
			usage();
			System.exit(1);
		}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

  /*public gov.nih.nci.cabig.ccts.domain.enrollpatient.EnrollPatientResponse enrollPatient(gov.nih.nci.cabig.ccts.domain.enrollpatient.EnrollPatientRequest enrollPatientRequest) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.EnrollPatientException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"enrollPatient");
    gov.nih.nci.cdmsconnector.c3d.stubs.EnrollPatientRequest params = new gov.nih.nci.cdmsconnector.c3d.stubs.EnrollPatientRequest();
    gov.nih.nci.cdmsconnector.c3d.stubs.EnrollPatientRequestEnrollPatientRequest enrollPatientRequestContainer = new gov.nih.nci.cdmsconnector.c3d.stubs.EnrollPatientRequestEnrollPatientRequest();
    enrollPatientRequestContainer.setEnrollPatientRequest(enrollPatientRequest);
    params.setEnrollPatientRequest(enrollPatientRequestContainer);
    gov.nih.nci.cdmsconnector.c3d.stubs.EnrollPatientResponse boxedResult = portType.enrollPatient(params);
    return boxedResult.getEnrollPatientResponse();
    }
  }*/

  public gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEDataResponse getStudyCDEData(gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEDataRequest getStudyCDEDataRequest) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.StudyDataException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getStudyCDEData");
    gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataRequest params = new gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataRequest();
    gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataRequestGetStudyCDEDataRequest getStudyCDEDataRequestContainer = new gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataRequestGetStudyCDEDataRequest();
    getStudyCDEDataRequestContainer.setGetStudyCDEDataRequest(getStudyCDEDataRequest);
    params.setGetStudyCDEDataRequest(getStudyCDEDataRequestContainer);
    gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEDataResponse boxedResult = portType.getStudyCDEData(params);
    return boxedResult.getGetStudyCDEDataResponse();
    }
  }

  public gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsResponse getStudyCDEs(gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsRequest getStudyCDEsRequest) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.StudyDataException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getStudyCDEs");
    gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEsRequest params = new gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEsRequest();
    gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEsRequestGetStudyCDEsRequest getStudyCDEsRequestContainer = new gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEsRequestGetStudyCDEsRequest();
    getStudyCDEsRequestContainer.setGetStudyCDEsRequest(getStudyCDEsRequest);
    params.setGetStudyCDEsRequest(getStudyCDEsRequestContainer);
    gov.nih.nci.cdmsconnector.c3d.stubs.GetStudyCDEsResponse boxedResult = portType.getStudyCDEs(params);
    return boxedResult.getGetStudyCDEsResponse();
    }
  }

/*  public gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsResponse loadLabs(gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsRequest loadLabsRequest) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.LoadLabsException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"loadLabs");
    gov.nih.nci.cdmsconnector.c3d.stubs.LoadLabsRequest params = new gov.nih.nci.cdmsconnector.c3d.stubs.LoadLabsRequest();
    gov.nih.nci.cdmsconnector.c3d.stubs.LoadLabsRequestLoadLabsRequest loadLabsRequestContainer = new gov.nih.nci.cdmsconnector.c3d.stubs.LoadLabsRequestLoadLabsRequest();
    loadLabsRequestContainer.setLoadLabsRequest(loadLabsRequest);
    params.setLoadLabsRequest(loadLabsRequestContainer);
    gov.nih.nci.cdmsconnector.c3d.stubs.LoadLabsResponse boxedResult = portType.loadLabs(params);
    return boxedResult.getLoadLabsResponse();
    }
  }
*/
  public gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse isValidStudy(gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyRequest isValidStudyRequest) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"isValidStudy");
    gov.nih.nci.cdmsconnector.c3d.stubs.IsValidStudyRequest params = new gov.nih.nci.cdmsconnector.c3d.stubs.IsValidStudyRequest();
    gov.nih.nci.cdmsconnector.c3d.stubs.IsValidStudyRequestIsValidStudyRequest isValidStudyRequestContainer = new gov.nih.nci.cdmsconnector.c3d.stubs.IsValidStudyRequestIsValidStudyRequest();
    isValidStudyRequestContainer.setIsValidStudyRequest(isValidStudyRequest);
    params.setIsValidStudyRequest(isValidStudyRequestContainer);
    gov.nih.nci.cdmsconnector.c3d.stubs.IsValidStudyResponse boxedResult = portType.isValidStudy(params);
    return boxedResult.getIsValidStudyResponse();
    }
  }

  public org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse getMultipleResourceProperties(org.oasis.wsrf.properties.GetMultipleResourceProperties_Element params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getMultipleResourceProperties");
    return portType.getMultipleResourceProperties(params);
    }
  }

  public org.oasis.wsrf.properties.GetResourcePropertyResponse getResourceProperty(javax.xml.namespace.QName params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"getResourceProperty");
    return portType.getResourceProperty(params);
    }
  }

  public org.oasis.wsrf.properties.QueryResourcePropertiesResponse queryResourceProperties(org.oasis.wsrf.properties.QueryResourceProperties_Element params) throws RemoteException {
    synchronized(portTypeMutex){
      configureStubSecurity((Stub)portType,"queryResourceProperties");
    return portType.queryResourceProperties(params);
    }
  }

}