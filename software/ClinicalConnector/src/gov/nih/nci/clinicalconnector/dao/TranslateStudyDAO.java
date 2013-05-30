/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.clinicalconnector.dao;

//import gov.nih.nci.cdmsconnector.domain.EnrollPatientRequest;

public interface TranslateStudyDAO {
	
	public String translateStudy(String studyName) throws Exception;

}
