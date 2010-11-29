package gov.nih.nci.cdmsconnector.c3d.service;

/*import gov.nih.nci.cabig.ccts.domain.Registration;
import gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsResponse;
import gov.nih.nci.cabig.ccts.domain.enrollpatient.EnrollPatientResponse;
import gov.nih.nci.cabig.ccts.domain.loadlabs.Acknowledgement;
import gov.nih.nci.cabig.ccts.domain.loadlabs.LoadLabsRequest;*/
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEDataResponse;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsResponse;
import gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse;
import gov.nih.nci.cagrid.common.Utils;
/*import gov.nih.nci.ccts.grid.common.RegistrationConsumerI;
import gov.nih.nci.ccts.grid.stubs.types.InvalidRegistrationException;
import gov.nih.nci.ccts.grid.stubs.types.RegistrationConsumptionException;
import gov.nih.nci.cdmsconnector.manager.EnrollPatientManager;*/
import gov.nih.nci.cdmsconnector.manager.GetStudyCDEDataManager;
import gov.nih.nci.cdmsconnector.manager.GetStudyCDEsManager;
import gov.nih.nci.cdmsconnector.manager.IsValidStudyManager;
/*import gov.nih.nci.cdmsconnector.manager.LoadLabsManager;*/

import java.io.StringWriter;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse;
import org.oasis.wsrf.properties.GetMultipleResourceProperties_Element;
import org.oasis.wsrf.properties.GetResourcePropertyResponse;
import org.oasis.wsrf.properties.QueryResourcePropertiesResponse;
import org.oasis.wsrf.properties.QueryResourceProperties_Element;

/*import webservices.common.LoadLabServiceI;*/

/**
 * TODO:I am the service side implementation class. IMPLEMENT AND DOCUMENT ME
 * 
 * @created by Introduce Toolkit version 1.2
 * 
 */
public class C3DGridServiceImpl extends C3DGridServiceImplBase { /*implements RegistrationConsumerI, LoadLabServiceI{*/
	private final static Logger log = Logger.getLogger(C3DGridServiceImpl.class
			.getName());

	/*protected EnrollPatientManager enrollPatientManager;
	protected LoadLabsManager loadLabsManager;*/
	protected GetStudyCDEsManager getStudyCDEsManager;
	protected GetStudyCDEDataManager getStudyCDEDataManager;
	protected IsValidStudyManager isValidStudyManager;

	public C3DGridServiceImpl() throws RemoteException {
		super();
	}

  /*public gov.nih.nci.cabig.ccts.domain.enrollpatient.EnrollPatientResponse enrollPatient(gov.nih.nci.cabig.ccts.domain.enrollpatient.EnrollPatientRequest enrollPatientRequest) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.EnrollPatientException {
		EnrollPatientResponse enrollPatientResponse = null;
		StringWriter writer = new StringWriter();
		try {
			Utils.serializeObject(enrollPatientRequest, new QName(
					"EnrollPatientRequest"), writer);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		System.out.println("Received enrollPatientRequest");
		log.debug("Received enrollPatientRequest");
		log.debug(writer.getBuffer().toString());

		try {
			enrollPatientResponse = (EnrollPatientResponse) enrollPatientManager
					.enrollPatient(enrollPatientRequest);
		} catch (Exception e) {

			e.printStackTrace();
			throw new RemoteException(e.getMessage());

		}

		writer = new StringWriter();
		try {
			Utils.serializeObject(enrollPatientResponse, new QName(
					"EnrollPatientResponse"), writer);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		log.debug("Sending enrollPatientResponse");
		log.debug(writer.getBuffer().toString());

		return enrollPatientResponse;
	}*/

  public gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEDataResponse getStudyCDEData(gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEDataRequest getStudyCDEDataRequest) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.StudyDataException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException {
		GetStudyCDEDataResponse response = null;
		StringWriter writer = new StringWriter();
		try {
			Utils.serializeObject(getStudyCDEDataRequest, new QName(
					"GetCDEDataRequest"), writer);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		log.debug(writer.getBuffer().toString());

		try {
			response = (GetStudyCDEDataResponse) getStudyCDEDataManager
					.getStudyCDEData(getStudyCDEDataRequest);

			try {
				Utils.serializeObject(response,
						new QName("GetCDEDataResponse"), writer);
			} catch (Exception e) {
				e.printStackTrace();
			}
			log.debug("The response is: ");
			log.debug(writer.getBuffer().toString());

		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage());
		}

		return response;
	}

  public gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsResponse getStudyCDEs(gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsRequest getStudyCDEsRequest) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.StudyDataException {
		GetStudyCDEsResponse response = null;
		StringWriter writer = new StringWriter();
		try {
			Utils.serializeObject(getStudyCDEsRequest, new QName(
					"GetStudyCDEsRequest"), writer);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		log.debug(writer.getBuffer().toString());

		try {
			response = (GetStudyCDEsResponse) getStudyCDEsManager
					.getStudyCDEs(getStudyCDEsRequest);

			try {
				Utils.serializeObject(response, new QName(
						"GetStudyCDEsResponse"), writer);
			} catch (Exception e) {
				e.printStackTrace();
			}
			log.debug("The response is: ");
			log.debug(writer.getBuffer().toString());

		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage());
		}

		return response;
	}

  /*public gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsResponse loadLabs(gov.nih.nci.cabig.ccts.domain.bridg.loadlabs.LoadLabsRequest loadLabsRequest) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.LoadLabsException {
		LoadLabsResponse response = null;
		StringWriter writer = new StringWriter();
		try {
			Utils.serializeObject(loadLabsRequest,
					new QName("LoadLabsRequest"), writer);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		log.debug(writer.getBuffer().toString());

		try {
			response = (LoadLabsResponse) loadLabsManager
					.loadLabs(loadLabsRequest);

			try {
				Utils.serializeObject(response, new QName("LoadLabsResponse"),
						writer);
			} catch (Exception e) {
				e.printStackTrace();
			}
			log.debug("The response is: ");
			log.debug(writer.getBuffer().toString());

		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage());
		}

		return response;
	}

	public EnrollPatientManager getEnrollPatientManager() {
		return enrollPatientManager;
	}

	public void setEnrollPatientManager(
			EnrollPatientManager enrollPatientManager) {
		this.enrollPatientManager = enrollPatientManager;
	}

	public LoadLabsManager getLoadLabsManager() {
		return loadLabsManager;
	}*/

	/*public void setLoadLabsManager(LoadLabsManager loadLabsManager) {
		this.loadLabsManager = loadLabsManager;
	}*/

	public GetStudyCDEsManager getGetStudyCDEsManager() {
		return getStudyCDEsManager;
	}

	public void setGetStudyCDEsManager(GetStudyCDEsManager getStudyCDEsManager) {
		this.getStudyCDEsManager = getStudyCDEsManager;
	}

	public GetStudyCDEDataManager getGetStudyCDEDataManager() {
		return getStudyCDEDataManager;
	}

	public void setGetStudyCDEDataManager(
			GetStudyCDEDataManager getStudyCDEDataManager) {
		this.getStudyCDEDataManager = getStudyCDEDataManager;
	}

  public gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse isValidStudy(gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyRequest isValidStudyRequest) throws RemoteException {
		gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse response = null;
		StringWriter writer = new StringWriter();
		try {
			Utils.serializeObject(isValidStudyRequest, new QName(
					"IsValidStudyRequest"), writer);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		log.debug(writer.getBuffer().toString());

		try {
			response = (IsValidStudyResponse) isValidStudyManager
					.isValidStudy(isValidStudyRequest);

			try {
				Utils.serializeObject(response, new QName(
						"IsValidStudyResponse"), writer);
			} catch (Exception e) {
				e.printStackTrace();
			}
			log.debug("The response is: ");
			log.debug(writer.getBuffer().toString());

		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage());
		}

		return response;

	}

	public IsValidStudyManager getIsValidStudyManager() {
		return isValidStudyManager;
	}

	public void setIsValidStudyManager(IsValidStudyManager isValidStudyManager) {
		this.isValidStudyManager = isValidStudyManager;
	}

	/*public void commit(Registration registration) throws RemoteException,
			InvalidRegistrationException {
		// TODO Auto-generated method stub
		
	}

	public Registration register(Registration registration)
			throws RemoteException, InvalidRegistrationException,
			RegistrationConsumptionException {
		Registration response;
		StringWriter writer = new StringWriter();
		try {
			Utils.serializeObject(registration, new QName(
					"Registration"), writer);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		log.debug("Received Registration");
		log.debug(writer.getBuffer().toString());

		try {
			response = (Registration) enrollPatientManager
					.enrollPatient(registration);
		} catch (Exception e) {

			e.printStackTrace();
			throw new RemoteException(e.getMessage());

		}

		writer = new StringWriter();
		try {
			Utils.serializeObject(registration, new QName(
					"Registration"), writer);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		log.debug("Sending enrollPatientResponse");
		log.debug(writer.getBuffer().toString());

		return response;
	}

	public Acknowledgement loadLabs(LoadLabsRequest loadLabsRequest)
	throws RemoteException {
		Acknowledgement response = null;
		StringWriter writer = new StringWriter();
		try {
			Utils.serializeObject(loadLabsRequest,
					new QName("LoadLabsRequest"), writer);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		log.debug(writer.getBuffer().toString());

		try {
			response = (Acknowledgement) loadLabsManager
					.loadLabs(loadLabsRequest);

			try {
				Utils.serializeObject(response, new QName("LoadLabsResponse"),
						writer);
			} catch (Exception e) {
				e.printStackTrace();
			}
			log.debug("The response is: ");
			log.debug(writer.getBuffer().toString());

		} catch (Exception e) {
			e.printStackTrace();
			throw new RemoteException(e.getMessage());
		}

		return response;
	}

	public void rollback(Registration registration) throws RemoteException,
			InvalidRegistrationException {
		// TODO Auto-generated method stub
		
	} */

	public GetMultipleResourcePropertiesResponse getMultipleResourceProperties(
			GetMultipleResourceProperties_Element params)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public GetResourcePropertyResponse getResourceProperty(QName arg0)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public QueryResourcePropertiesResponse queryResourceProperties(
			QueryResourceProperties_Element arg0) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
