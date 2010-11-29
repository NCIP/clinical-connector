package gov.nih.nci.cdmsconnector.domain;

import java.util.ArrayList;
import java.util.List;

public class QuestionGroup {
	private int id;
	private String name;
	private List<Question> questions;
	
	public QuestionGroup(){
		questions=new ArrayList<Question>();
	}

	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}
	public int getId() {
		return id;
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