package gov.nih.nci.cdmsconnector.domain.validator;

public class DataValidationException extends Exception {

	public DataValidationException(String string) {
		super(string);
	}

	public DataValidationException() {
		super();
	}

}
