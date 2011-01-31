package gov.nih.nci.cdmsconnector.domain.validator;

import gov.nih.nci.cdmsconnector.dao.IsValidStudyDAO;
import gov.nih.nci.cdmsconnector.domain.HealthCareFacility;
import gov.nih.nci.cdmsconnector.domain.LabResult;
import gov.nih.nci.cdmsconnector.domain.LoadLabsRequest;
import gov.nih.nci.cdmsconnector.domain.Study;
import gov.nih.nci.cdmsconnector.domain.StudySubject;

public class LoadLabsRequestValidatorImpl implements LoadLabsRequestValidator {

	IsValidStudyDAO isValidStudyDAO;

	public boolean validate(LoadLabsRequest request) throws Exception {
		if (request == null) {
			throw new DataValidationException("corrupt request");
		}
		LabResult[] results = request.getResults();
		if (results == null || results.length == 0) {
			throw new DataValidationException("No Lab Results received");
		}
		for (LabResult labResult : results) {
			validateLabResult(labResult);
		}
		if (!isValidStudyDAO.isStudyReadyForLoadLabs(request.getResults()[0]
				.getStudy().getStudyIdentifier())) {
			throw new StudyNotReadyException("Study '"
					+ request.getResults()[0].getStudy().getStudyIdentifier()
					+ "' not ready for LoadLabs");
		}
		return true;
	}

	private void validateLabResult(LabResult labResult) throws Exception {
		if (labResult == null) {
			throw new DataValidationException("Corrupt LabResult");
		}
		Study study = labResult.getStudy();
		validateStudy(study);
		StudySubject studySubject = labResult.getStudySubject();
		validateStudySubject(studySubject);
		String textResult = labResult.getTextResult();
		if (textResult == null || "".equals(textResult)) {
			throw new DataValidationException("Result missing from LabResult");
		}
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
		if (!isValidStudyDAO.isValidStudy(study.getStudyIdentifier())) {
			throw new DataValidationException("Invalid Study:"
					+ study.getStudyIdentifier());
		}
		HealthCareFacility site = study.getStudySite();
	}

	public IsValidStudyDAO getIsValidStudyDAO() {
		return isValidStudyDAO;
	}

	public void setIsValidStudyDAO(IsValidStudyDAO isValidStudyDAO) {
		this.isValidStudyDAO = isValidStudyDAO;
	}

}
