/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.domain.validator;

public class StudyNotReadyException extends Exception {

	public StudyNotReadyException(String string) {
		super(string);
	}

	public StudyNotReadyException() {
		super();
	}

}
