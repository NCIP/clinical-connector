package gov.nih.nci.cdmsconnector.domain;

public class GetStudyCRFDataRequest {
    private String crfName;
    private String studyName;
	
    public String getCrfName() {
		return crfName;
	}
	public void setCrfName(
			String crfName) {
		this.crfName = crfName;
	}
	public String getStudyName() {
		return studyName;
	}
	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}
    
}
