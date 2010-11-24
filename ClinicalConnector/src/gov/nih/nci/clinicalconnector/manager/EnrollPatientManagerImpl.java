package gov.nih.nci.clinicalconnector.manager;

import java.util.Properties;

//import gov.nih.nci.cabig.ccts.domain.Registration;
import clinicalconnector.nci.nih.gov.RegisterSubjectRequest;
import gov.nih.nci.cabig.ctms.suite.authorization.SuiteRole;
import gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest;
import gov.nih.nci.cdmsconnector.domain.adapter.EnrollPatientAdapter;
import gov.nih.nci.clinicalconnector.dao.EnrollmentDAO;
import gov.nih.nci.clinicalconnector.domain.validator.EnrollPatientRequestValidator;
import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;
import gov.nih.nci.clinicalconnector.manager.CDMSConnectorSecurityManager;
import gov.nih.nci.clinicalconnector.manager.EnrollPatientManager;
import gov.nih.nci.clinicalconnector.manager.EnrollPatientManagerImpl;
import gov.nih.nci.clinicalconnector.manager.InvalidRequestException;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;
import gov.nih.nci.clinicalconnector.domain.adapter.bridg21.BRIDG21Adapter;
import gov.nih.nci.clinicalconnector.domain.adapter.ccts.CCTSAdapter;
//import gov.nih.nci.security.AuthorizationManager;
//import gov.nih.nci.security.CommonSecurityManager;
//import gov.nih.nci.security.SecurityServiceProvider;
//import gov.nih.nci.security.acegi.authentication.CSMUserDetails;
//import gov.nih.nci.security.authentication.loginmodules.CSMLoginModule;
//import gov.nih.nci.security.authorization.jaas.AccessPermission;

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
	protected BRIDG21Adapter bridg21ModelAdapter;
	/* PRC Turned off CCTSAdapter
	 * protected CCTSAdapter cctsModelAdapter; 
	 * */
	
	public Object enrollPatient(
			Object enrollPatientRequest)
			throws InvalidRequestException, AccessPermissionException {
		Properties props = null;
		try {
			props = PropertiesUtil.getProperties();
		} catch (Exception e) {
		}
		String userDN=null;
		/*try {
			userDN=gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils.getCallerIdentity();
			if(!securityManager.canAccess(userDN, CDMSConnectorSecurityManager.ENROLLPATIENT_SERVICE, 
					props.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMRegRole)))
			{
				throw new AccessPermissionException("EnrollPatient permission denied to user:"+userDN);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new AccessPermissionException(e1.toString());
		}*/

		try {
			System.out.println("Inside EnrollPatientManagerImpl.enrollPatient");

			System.out.println("setting cdmsEnrollPatientRequest NULL");
			EnrollPatientRequest cdmsEnrollPatientRequest = null;
			
			System.out.println("setting adapter");
			
			EnrollPatientAdapter adapter = modelAdapter;
			/* PRC TUrned OFF cctsAdapter
			 * if(cctsModelAdapter.getEnrollPatientRequestType().isAssignableFrom(enrollPatientRequest.getClass())){
			 
				adapter = cctsModelAdapter;
			} else*/
			if (bridg21ModelAdapter.getEnrollPatientRequestType().isAssignableFrom(enrollPatientRequest.getClass())){
				adapter = bridg21ModelAdapter;
			} else {
				throw new InvalidRequestException("Invalid Model Passed");
			}

			System.out.println("setting cdmsEnrollPatientRequest from adapter.map...");
			cdmsEnrollPatientRequest = adapter.mapAndValidateEnrollPatientRequest(enrollPatientRequest);
			
			System.out.println("validator...");
			validator.validate(cdmsEnrollPatientRequest);
			
			System.out.println("patientPosition...");

			String studyName = cdmsEnrollPatientRequest.getStudy().getStudyIdentifier();
			String siteName = cdmsEnrollPatientRequest.getStudy().getStudySite().getOrganizationName();
			try {
				userDN=gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils.getCallerIdentity();
			    try {
			    	 SuiteRole suiteRole = securityManager.getRole(props.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMRegRole));
				     securityManager.checkAuthorization(userDN, studyName,siteName, suiteRole);
	      		} catch (Exception e1) {
			    	e1.printStackTrace();
				    throw new AccessPermissionException(e1.toString());
	      		}
			} catch (Exception e1) {
				e1.printStackTrace();
				throw new AccessPermissionException(e1.toString());
			}

			String patientPosition = (String) enrollPatient(cdmsEnrollPatientRequest);

			System.out.println("adapter...");

			return adapter.createEnrollPatientResponse(enrollPatientRequest, patientPosition);

		} catch (Exception e) {
			e.printStackTrace();
			throw new InvalidRequestException(e.toString());
		}
	}

	private String enrollPatient(gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest cdmsEnrollPatientRequest) throws Exception {
		/*if (!isSaveEnrollmentDate()) {
			cdmsEnrollPatientRequest.getStudySubject().setEnrollDate(null);
			//cdmsEnrollPatientRequest.getPerformedSubjectMilestone().setRegistrationDate(null);
		}

		if (!isSaveGender()) {
			cdmsEnrollPatientRequest.getStudySubject().setGender(null);
			//cdmsEnrollPatientRequest.getStudySubject().setSexCode(null);
		}

		if (!isSaveName()) {
			cdmsEnrollPatientRequest.getStudySubject().setFirstName(null);
			cdmsEnrollPatientRequest.getStudySubject().setLastName(null);
			cdmsEnrollPatientRequest.getStudySubject().setInitials(null);
			//cdmsEnrollPatientRequest.getStudySubject().setName(null);
		}

		if (!isSaveBirthDate()) {
			cdmsEnrollPatientRequest.getStudySubject().setBirthDate(null);
			//cdmsEnrollPatientRequest.getStudySubject().setBirthDate(null);
		}*/

		return enrollmentDAO.enrollPatient(cdmsEnrollPatientRequest,isSaveEnrollmentDate(),
				isSaveGender(),isSaveInitials(), isSaveBirthDate());
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
	
	/* PRC
	 * The CLASS May be wrong here should use CCTSAdapter, right?
	 * public EnrollPatientAdapter getCctsModelAdapter() {
	 
		return cctsModelAdapter;
	}

	public void setCctsModelAdapter(CCTSAdapter cctsModelAdapter) {
		this.cctsModelAdapter = cctsModelAdapter;
	}*/

	public BRIDG21Adapter getBridg21ModelAdapter() {
		return bridg21ModelAdapter;
	}

	public void setBridg21ModelAdapter(BRIDG21Adapter bridg21ModelAdapter) {
		this.bridg21ModelAdapter = bridg21ModelAdapter;
	}

}
