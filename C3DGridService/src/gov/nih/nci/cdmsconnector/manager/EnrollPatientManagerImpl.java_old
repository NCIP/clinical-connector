package gov.nih.nci.cdmsconnector.manager;

import java.util.Properties;

import gov.nih.nci.cabig.ccts.domain.Registration;
import gov.nih.nci.cdmsconnector.dao.EnrollmentDAO;
import gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest;
import gov.nih.nci.cdmsconnector.domain.adapter.EnrollPatientAdapter;
import gov.nih.nci.cdmsconnector.domain.validator.EnrollPatientRequestValidator;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;

import org.apache.log4j.Logger;

public class EnrollPatientManagerImpl implements EnrollPatientManager {
	private final static Logger log = Logger
			.getLogger(EnrollPatientManagerImpl.class.getName());

	private boolean saveBirthDate, saveGender, saveName, saveInitials,
			saveEnrollmentDate;
	protected EnrollPatientAdapter modelAdapter;
	protected EnrollmentDAO enrollmentDAO;
	protected EnrollPatientRequestValidator validator;
	protected CDMSConnectorSecurityManager securityManager;

	private EnrollPatientAdapter cctsModelAdapter;
	
	public Object enrollPatient(
			Object enrollPatientRequest)
			throws InvalidRequestException, AccessPermissionException {
		Properties AppProps = null;
		try {
			AppProps = PropertiesUtil.getAppProperties();
		} catch (Exception e) {
		}
		String userDN=null;
		try {
			userDN=gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils.getCallerIdentity();
			if(!securityManager.canAccess(userDN, CDMSConnectorSecurityManager.ENROLLPATIENT_SERVICE, 
					AppProps.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMRegRole)))
			{
				throw new AccessPermissionException("EnrollPatient permission denied to user:"+userDN);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new AccessPermissionException(e1.toString());
		}

		try {
			System.out.println("Inside EnrollPatientManagerImpl.enrollPatient");

			System.out.println("setting cdmsEnrollPatientRequest NULL");
			gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest cdmsEnrollPatientRequest = null;
			
			System.out.println("setting adapter");
			
			EnrollPatientAdapter adapter = modelAdapter;
			if(cctsModelAdapter.getEnrollPatientRequestType().isAssignableFrom(enrollPatientRequest.getClass())){
				adapter = cctsModelAdapter;
			}
			
			System.out.println("setting cdmsEnrollPatientRequest from adapter.map...");
			cdmsEnrollPatientRequest = adapter.mapAndValidateEnrollPatientRequest(enrollPatientRequest);
			
			System.out.println("validator...");
			validator.validate(cdmsEnrollPatientRequest);
			
			System.out.println("patientPosition...");
			String patientPosition = enrollPatient(cdmsEnrollPatientRequest);

			System.out.println("adapter...");
			return adapter.createEnrollPatientResponse(enrollPatientRequest, patientPosition);

		} catch (Exception e) {
			e.printStackTrace();
			throw new InvalidRequestException(e.toString());
		}
	}

	private String enrollPatient(EnrollPatientRequest cdmsEnrollPatientRequest) throws Exception {
		if (!isSaveEnrollmentDate()) {
			cdmsEnrollPatientRequest.getStudySubject().setEnrollDate(null);
		}

		if (!isSaveGender()) {
			cdmsEnrollPatientRequest.getStudySubject().setGender(null);
		}

		if (!isSaveName()) {
			cdmsEnrollPatientRequest.getStudySubject().setFirstName(null);
			cdmsEnrollPatientRequest.getStudySubject().setLastName(null);
			cdmsEnrollPatientRequest.getStudySubject().setInitials(null);
		}

		if (!isSaveBirthDate()) {
			cdmsEnrollPatientRequest.getStudySubject().setBirthDate(null);
		}

		return enrollmentDAO.enrollPatient(cdmsEnrollPatientRequest);
	}

	public boolean isSaveBirthDate() {
		return saveBirthDate;
	}

	public void setSaveBirthDate(boolean saveBirthDate) {
		this.saveBirthDate = saveBirthDate;
	}

	public boolean isSaveGender() {
		return saveGender;
	}

	public void setSaveGender(boolean saveGender) {
		this.saveGender = saveGender;
	}

	public boolean isSaveName() {
		return saveName;
	}

	public void setSaveName(boolean saveName) {
		this.saveName = saveName;
	}

	public boolean isSaveInitials() {
		return saveInitials;
	}

	public void setSaveInitials(boolean saveInitials) {
		this.saveInitials = saveInitials;
	}

	public boolean isSaveEnrollmentDate() {
		return saveEnrollmentDate;
	}

	public void setSaveEnrollmentDate(boolean saveEnrollmentDate) {
		this.saveEnrollmentDate = saveEnrollmentDate;
	}

	public EnrollmentDAO getEnrollmentDAO() {
		return enrollmentDAO;
	}

	public void setEnrollmentDAO(EnrollmentDAO enrollmentDAO) {
		this.enrollmentDAO = enrollmentDAO;
	}

	public EnrollPatientAdapter getModelAdapter() {
		return modelAdapter;
	}

	public void setModelAdapter(EnrollPatientAdapter modelAdapter) {
		this.modelAdapter = modelAdapter;
	}

	public EnrollPatientRequestValidator getValidator() {
		return validator;
	}

	public void setValidator(EnrollPatientRequestValidator validator) {
		this.validator = validator;
	}

	public CDMSConnectorSecurityManager getSecurityManager() {
		return securityManager;
	}

	public void setSecurityManager(CDMSConnectorSecurityManager securityManager) {
		this.securityManager = securityManager;
	}
	
	public EnrollPatientAdapter getCctsModelAdapter() {
		return cctsModelAdapter;
	}

	public void setCctsModelAdapter(EnrollPatientAdapter cctsModelAdapter) {
		this.cctsModelAdapter = cctsModelAdapter;
	}

}
