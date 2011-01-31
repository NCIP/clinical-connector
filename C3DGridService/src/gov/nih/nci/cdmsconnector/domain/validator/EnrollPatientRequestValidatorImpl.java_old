package gov.nih.nci.cdmsconnector.domain.validator;

import gov.nih.nci.cdmsconnector.dao.IsValidStudyDAO;
import gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest;
import gov.nih.nci.cdmsconnector.domain.HealthCareFacility;
import gov.nih.nci.cdmsconnector.domain.Study;
import gov.nih.nci.cdmsconnector.domain.StudySubject;

public class EnrollPatientRequestValidatorImpl implements
		EnrollPatientRequestValidator {
	
	IsValidStudyDAO isValidStudyDAO;

	public boolean validate(EnrollPatientRequest request)
			throws Exception {
		if (request == null) {
			throw new DataValidationException("Corrupt request");
		}
		validateStudy(request.getStudy());
		validateStudySubject(request.getStudySubject());
		return true;
	}

	private void validateStudySubject(StudySubject studySubject)
			throws DataValidationException {
		if (studySubject == null
				|| studySubject.getParticipantIdentifier() == null
				|| "".equals(studySubject.getParticipantIdentifier())) {
			throw new DataValidationException("MRN Not Received");
		}
	}

	private void validateStudy(Study study) throws Exception {
		if (study == null || study.getStudyIdentifier() == null
				|| "".equals(study.getStudyIdentifier())) {
			throw new DataValidationException("Study Not Received");
		}
		if(!isValidStudyDAO.isValidStudy(study.getStudyIdentifier())){
			throw new DataValidationException("Invalid Study:"+study.getStudyIdentifier());
		}
		HealthCareFacility site = study.getStudySite();
		validateStudySite(site);
	}

	private void validateStudySite(HealthCareFacility site)
			throws DataValidationException {
		if (site == null || site.getOrganizationName() == null
				|| "".equals(site.getOrganizationName())) {
			throw new DataValidationException("Organization Name not received");
		}
	}

	public IsValidStudyDAO getIsValidStudyDAO() {
		return isValidStudyDAO;
	}

	public void setIsValidStudyDAO(IsValidStudyDAO isValidStudyDAO) {
		this.isValidStudyDAO = isValidStudyDAO;
	}

}
