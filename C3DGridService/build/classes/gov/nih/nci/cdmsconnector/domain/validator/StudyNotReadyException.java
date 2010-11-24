package gov.nih.nci.cdmsconnector.domain.validator;

public class StudyNotReadyException extends Exception {

	public StudyNotReadyException(String string) {
		super(string);
	}

	public StudyNotReadyException() {
		super();
	}

}
