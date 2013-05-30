/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain;

public class Question {
	private int id, repeatSequence;
	private String name, defaultPrompt, value;
	private CommonDataElement cde;

	public CommonDataElement getCde() {
		return cde;
	}
	public void setCde(CommonDataElement cde) {
		this.cde = cde;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRepeatSequence() {
		return repeatSequence;
	}
	public void setRepeatSequence(int repeatSequence) {
		this.repeatSequence = repeatSequence;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDefaultPrompt() {
		return defaultPrompt;
	}
	public void setDefaultPrompt(String defaultPrompt) {
		this.defaultPrompt = defaultPrompt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
