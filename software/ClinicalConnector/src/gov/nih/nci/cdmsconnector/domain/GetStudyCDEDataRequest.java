/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain;

public class GetStudyCDEDataRequest {
    private CommonDataElement commonDataElement;
    private String studyName;
	
    public CommonDataElement getCommonDataElement() {
		return commonDataElement;
	}
	public void setCommonDataElement(
			CommonDataElement commonDataElement) {
		this.commonDataElement = commonDataElement;
	}
	public String getStudyName() {
		return studyName;
	}
	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}
    
}
