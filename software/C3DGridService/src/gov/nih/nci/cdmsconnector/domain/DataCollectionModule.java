/*
 * Copyright Ekagra and SemanticBits, LLC
 * 
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/clinical-connector/LICENSE.txt for details.
 */
package gov.nih.nci.cdmsconnector.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataCollectionModule {

	private Date date;
	private int id, eventSubsetNumber;
	private String name;
	private List<QuestionGroup> questionGroups;
	
	public DataCollectionModule(){
		questionGroups=new ArrayList<QuestionGroup>();
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<QuestionGroup> getQuestionGroups() {
		return questionGroups;
	}
	public void setQuestionGroups(ArrayList<QuestionGroup> questionGroups) {
		this.questionGroups = questionGroups;
	}
	public int getId() {
		return id;
	}
	public int getEventSubsetNumber() {
		return eventSubsetNumber;
	}
	public void setEventSubsetNumber(int eventSubsetNumber) {
		this.eventSubsetNumber = eventSubsetNumber;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
