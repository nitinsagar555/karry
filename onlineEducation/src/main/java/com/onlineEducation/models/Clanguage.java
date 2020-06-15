package com.onlineEducation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clanguage")
public class Clanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int questionId;
	private String questionName;
	private String questionAnswer;

	public Clanguage() {

	}

	public Clanguage(int questionId, String questionName, String questionAnswer) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;

		this.questionAnswer = questionAnswer;
	}

	public String getQuestionAnswer() {
		return questionAnswer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

}
