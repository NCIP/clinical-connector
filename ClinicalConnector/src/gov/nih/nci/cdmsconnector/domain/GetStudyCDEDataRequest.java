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
