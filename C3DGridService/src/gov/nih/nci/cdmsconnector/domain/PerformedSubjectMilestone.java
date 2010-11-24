package gov.nih.nci.cdmsconnector.domain;

import java.util.Date;


public class PerformedSubjectMilestone {
	
	private Date consentDate;
	private String consentVersion;

	public Date getConsentDate() {
		return consentDate;
	}

	public void setConsetDate(Date consentDate) {
		this.consentDate = consentDate;
	}

	public String getConsentVersion() {
		return consentVersion;
	}

	public void setConsentVersion(String consentVersion) {
		this.consentVersion = consentVersion;
	}

}
