package gov.nih.nci.cdmsconnector.domain;

public class LoadLabsRequest {
	
	private LabResult[] results;

	public LabResult[] getResults() {
		return results;
	}

	public void setResults(LabResult[] results) {
		this.results = results;
	}
}
