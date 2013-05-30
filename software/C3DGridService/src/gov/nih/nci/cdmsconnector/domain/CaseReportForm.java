/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain;

public class CaseReportForm {

	private DataCollectionInstrument dci;
	private String name;
	
	public DataCollectionInstrument getDci() {
		return dci;
	}
	public void setDci(DataCollectionInstrument dci) {
		this.dci = dci;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

