package com.onlineEducation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "html")
public class JavaScript {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int questionId;
	private String questionName;
	private String questionAnswer;

	public JavaScript() {

	}

	public JavaScript(int questionId, String questionName, String questionAnswer) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;
		this.questionAnswer = questionAnswer;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public String getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

}
