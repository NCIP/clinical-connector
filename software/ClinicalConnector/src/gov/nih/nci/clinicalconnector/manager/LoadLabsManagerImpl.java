/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.manager;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import gov.nih.nci.cdmsconnector.domain.LabResult;
import gov.nih.nci.cdmsconnector.domain.adapter.EnrollPatientAdapter;
import gov.nih.nci.cdmsconnector.domain.adapter.LoadLabsAdapter;
import gov.nih.nci.clinicalconnector.dao.LoadLabsDAO;
import gov.nih.nci.clinicalconnector.domain.adapter.bridg111.BRIDG111Adapter;
import gov.nih.nci.clinicalconnector.domain.validator.LoadLabsRequestValidator;
import gov.nih.nci.clinicalconnector.domain.validator.StudyNotReadyException;
import gov.nih.nci.clinicalconnector.manager.AccessPermissionException;
import gov.nih.nci.clinicalconnector.manager.CDMSConnectorSecurityManager;
import gov.nih.nci.clinicalconnector.manager.LoadLabsManager;
import gov.nih.nci.clinicalconnector.manager.LoadLabsManagerImpl;
import gov.nih.nci.cdmsconnector.util.PropertiesUtil;
import gov.nih.nci.clinicalconnector.domain.adapter.bridg21.BRIDG21Adapter;
import gov.nih.nci.cabig.ctms.suite.authorization.SuiteRole;
import gov.nih.nci.clinicalconnector.dao.TranslateStudyDAO;
import gov.nih.nci.cdmsconnector.domain.Study;


import org.apache.log4j.Logger;

public class LoadLabsManagerImpl implements LoadLabsManager {
	private final static Logger log = Logger
			.getLogger(LoadLabsManagerImpl.class.getName());

	protected LoadLabsAdapter modelAdapter;
	protected LoadLabsDAO loadLabsDAO;
	protected LoadLabsRequestValidator validator;
	protected CDMSConnectorSecurityManager securityManager;
	private BRIDG111Adapter BRIDG111ModelAdapter;
	private BRIDG21Adapter bridg21ModelAdapter;
	protected TranslateStudyDAO translator;

	public Object loadLabs(Object request) throws Exception {
		Properties props = null;
		try {
			props = PropertiesUtil.getPropertiesFromDB();
		} catch (Exception e) {
		}

		Object response = null;

		gov.nih.nci.cdmsconnector.domain.LoadLabsRequest cdmsRequest = null;

		if (bridg21ModelAdapter.getLoadLabsRequestType().isAssignableFrom(
				request.getClass())) {
			modelAdapter = bridg21ModelAdapter;
		} else {
			throw new InvalidRequestException("Invalid Model Passed.");
		}

		cdmsRequest = modelAdapter.mapAndValidateLoadLabsRequest(request);

		String userDN = null;
		String useCSM = props.getProperty("loadLabsService.useCSM");
		
		try {
			userDN = gov.nih.nci.cagrid.introduce.servicetools.security.SecurityUtils
				.getCallerIdentity();
		} catch (Exception e1) {
			e1.printStackTrace();
			throw new AccessPermissionException(e1.toString());
		}
		
		for (LabResult result : cdmsRequest.getResults()) {

			if (result == null) {
				continue;
			}

			String studyName = result.getStudy().getStudyIdentifier();
			String siteName = null;
			/*TODO
			 * Put the Overall CSM Check here.  If we use CSM, then do the try else skip it 
			 */
			
			if (useCSM != null && useCSM.equalsIgnoreCase("true")) {

				try {
					SuiteRole suiteRole = securityManager.getRole(props.getProperty(gov.nih.nci.cdmsconnector.util.Constants.ClinConCSMLabRole));
					securityManager.checkLabAuthorization(userDN, studyName, siteName, suiteRole);
				} catch (Exception e1) {
					e1.printStackTrace();
					throw new AccessPermissionException(e1.toString());
				}
			}
		}

		String error = null;
		//try {
		//	validator.validate(cdmsRequest);
		//} catch (StudyNotReadyException snre) {
		//	error = snre.getMessage();
		//}

		try {
			validator.validate(cdmsRequest);
		} catch (InvalidStudyException e1) {
			//e1.printStackTrace();
			System.out.println("Inside Validation Exception Handler.");
			for (LabResult result : cdmsRequest.getResults()) {

				if (result == null) {
					continue;
				}

				String studyName = result.getStudy().getStudyIdentifier();
//				String siteName = null;
				
				try {
					System.out.println("Study Not Found, Performing Translation.");
					String oldStudy = result.getStudy().getStudyIdentifier();
					String newStudy = translator.translateStudy(oldStudy);

				    System.out.println("Study name '" + oldStudy + "' successfully " + 
							           "translated to '" + newStudy + "'.");
					Study study = result.getStudy();
					study.setStudyIdentifier(newStudy);
					result.setStudy(study);
				} catch (Exception ec) {
					ec.printStackTrace();
					throw new AccessPermissionException(ec.toString());
				}
				
			}

		} catch (Exception e1) {
				throw new InvalidStudyOrPatientException(e1.toString());
		}
		
		loadLabsDAO.loadLabs(cdmsRequest);

		if (error == null) {
			response = modelAdapter
					.createLoadLabsResponse(LoadLabsAdapter.PROCESSED);
		} else {
			response = modelAdapter
					.createLoadLabsResponse(LoadLabsAdapter.SUBMITTED + " : "
							+ error);
		}

		return response;

	}

	public LoadLabsAdapter getModelAdapter() {
		return modelAdapter;
	}

	public void setModelAdapter(LoadLabsAdapter modelAdapter) {
		this.modelAdapter = modelAdapter;
	}

	public LoadLabsDAO getLoadLabsDAO() {
		return loadLabsDAO;
	}

	public void setLoadLabsDAO(LoadLabsDAO loadLabsDAO) {
		this.loadLabsDAO = loadLabsDAO;
	}

	public LoadLabsRequestValidator getValidator() {
		return validator;
	}

	public void setValidator(LoadLabsRequestValidator validator) {
		this.validator = validator;
	}

	public TranslateStudyDAO getTranslator() {
		return translator;
	}

	public void setTranslator(TranslateStudyDAO translator) {
		this.translator = translator;
	}

	public CDMSConnectorSecurityManager getSecurityManager() {
		return securityManager;
	}

	public void setSecurityManager(CDMSConnectorSecurityManager securityManager) {
		this.securityManager = securityManager;
	}

	public gov.nih.nci.clinicalconnector.domain.adapter.bridg21.BRIDG21Adapter getBridg21ModelAdapter() {
		return bridg21ModelAdapter;
	}

	public void setBridg21ModelAdapter(
			gov.nih.nci.clinicalconnector.domain.adapter.bridg21.BRIDG21Adapter bridg21ModelAdapter) {
		this.bridg21ModelAdapter = bridg21ModelAdapter;
	}

	/* PRC
	 * The CLASS May be wrong here should use CCTSAdapter, right?
	public LoadLabsAdapter getCctsModelAdapter() {
		return cctsModelAdapter;
	}

	public void setCctsModelAdapter(LoadLabsAdapter cctsModelAdapter) {
		this.cctsModelAdapter = cctsModelAdapter;
	} */

}
