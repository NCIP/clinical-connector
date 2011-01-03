package gov.nih.nci.clinicalconnector.domain.validator;

public class StudyNotReadyException extends Exception {

	public StudyNotReadyException(String string) {
		super(string);
	}

	public StudyNotReadyException() {
		super();
	}

}
