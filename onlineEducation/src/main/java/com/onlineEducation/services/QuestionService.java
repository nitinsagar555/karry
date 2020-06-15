package com.onlineEducation.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineEducation.models.Question;
import com.onlineEducation.repositories.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository questionRepository;

	public List<Question> getAllQuestion() {
		List<Question> question = new ArrayList<>();
		questionRepository.findAll().forEach(question::add);
		return question;
	}

	public Question getQuestion(Integer id) {
		Optional<Question> result = questionRepository.findById(id);
		return result.get();
	}

}
