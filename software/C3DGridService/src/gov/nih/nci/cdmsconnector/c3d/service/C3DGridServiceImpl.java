package gov.nih.nci.cdmsconnector.c3d.service;

import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEDataResponse;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCDEsResponse;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFDataResponse;
import gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsResponse;
import gov.nih.nci.cabig.ccts.domain.studydata.IsValidStudyResponse;
import gov.nih.nci.cagrid.common.Utils;
import gov.nih.nci.cdmsconnector.manager.GetStudyCDEDataManager;
import gov.nih.nci.cdmsconnector.manager.GetStudyCDEsManager;
import gov.nih.nci.cdmsconnector.manager.GetStudyCRFDataManager;
import gov.nih.nci.cdmsconnector.manager.GetStudyCRFsManager;
import gov.nih.nci.cdmsconnector.manager.IsValidStudyManager;
import java.io.StringWriter;
import java.rmi.RemoteException;
import javax.xml.namespace.QName;
import org.apache.log4j.Logger;
import org.oasis.wsrf.properties.GetMultipleResourcePropertiesResponse;
import org.oasis.wsrf.properties.GetMultipleResourceProperties_Element;
import org.oasis.wsrf.properties.GetResourcePropertyResponse;
import org.oasis.wsrf.properties.QueryResourcePropertiesResponse;
import org.oasis.wsrf.properties.QueryResourceProperties_Element;

/**
 * TODO:I am the service side implementation class. IMPLEMENT AND DOCUMENT ME
 * 
 * @created by Introduce Toolkit version 1.2
 * 
 */
public class C3DGridServiceImpl extends C3DGridServiceImplBase { /*implements RegistrationConsumerI, LoadLabServiceI{*/
	private final static Logger log = Logger.getLogger(C3DGridServiceImpl.class
			.getName());

	protected GetStudyCDEsManager getStudyCDEsManager;
	protected GetStudyCDEDataManager getStudyCDEDataManager;
	protected GetStudyCRFsManager getStudyCRFsManager;
	protected GetStudyCRFDataManager getStudyCRFDataManager;
	protected IsValidStudyManager isValidStudyManager;

	public C3DGridServiceImpl() throws RemoteException {
		super();
	}

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

  public gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFDataResponse getStudyCRFData(gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFDataRequest getStudyCRFDataRequest) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.StudyDataException {
    //TODO: Implement this autogenerated method
    //throw new RemoteException("Not yet implemented");
	GetStudyCRFDataResponse response = null;
	StringWriter writer = new StringWriter();
	try {
		Utils.serializeObject(getStudyCRFDataRequest, new QName("GetCRFDataRequest"), writer);
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException(e);
	}
	log.debug(writer.getBuffer().toString());

	try {
		response = (GetStudyCRFDataResponse) getStudyCRFDataManager.getStudyCRFData(getStudyCRFDataRequest);
		try {
			Utils.serializeObject(response,
					new QName("GetCRFDataResponse"), writer);
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
  

  public gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsResponse getStudyCRFs(gov.nih.nci.cabig.ccts.domain.studydata.GetStudyCRFsRequest getStudyCRFsRequest) throws RemoteException, gov.nih.nci.cdmsconnector.c3d.stubs.types.InValidStudyException, gov.nih.nci.cdmsconnector.c3d.stubs.types.StudyDataException {
    //TODO: Implement this autogenerated method
	  GetStudyCRFsResponse response = null;
		StringWriter writer = new StringWriter();
		try {
			Utils.serializeObject(getStudyCRFsRequest, new QName("GetCRFsRequest"), writer);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		log.debug(writer.getBuffer().toString());

		try {
			response = (GetStudyCRFsResponse) getStudyCRFsManager.getStudyCRFs(getStudyCRFsRequest);
			try {
				Utils.serializeObject(response,
						new QName("GetCRFsResponse"), writer);
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
  
	public GetStudyCRFsManager getGetStudyCRFsManager() {
		return getStudyCRFsManager;
	}

	public void setGetStudyCRFsManager(GetStudyCRFsManager getStudyCRFsManager) {
		this.getStudyCRFsManager = getStudyCRFsManager;
	}

	public GetStudyCRFDataManager getGetStudyCRFDataManager() {
		return getStudyCRFDataManager;
	}

	public void setGetStudyCRFDataManager(
			GetStudyCRFDataManager getStudyCRFDataManager) {
		this.getStudyCRFDataManager = getStudyCRFDataManager;
	}

}
