package com.onlineEducation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.onlineEducation.models.Question;
import com.onlineEducation.repositories.QuestionRepository;
import com.onlineEducation.services.QuestionService;

@RestController
@RequestMapping("/questions")
@CrossOrigin
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private QuestionRepository repos;

	@GetMapping("/questions1")
	public List<Question> getAllQuestion() {
		return questionService.getAllQuestion();
	}

	@PostMapping("/post")
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Question question) {
		repos.save(question);
	}

	@GetMapping("/questions1/{id}")
	public Question getQuestion(@PathVariable Integer id) {
		return questionService.getQuestion(id);
	}

}
