/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.dao;

public interface IsValidStudyDAO {

	public boolean isValidStudy(String studyName) throws Exception;
	
	public boolean isStudyReadyForLoadLabs(String studyName) throws Exception;

}
