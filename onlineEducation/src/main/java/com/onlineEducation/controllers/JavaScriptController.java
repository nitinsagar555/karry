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

import com.onlineEducation.models.JavaScript;
import com.onlineEducation.repositories.JavaScriptRepository;
import com.onlineEducation.services.JavaScriptService;

@RestController
@RequestMapping("/javascript")
@CrossOrigin
public class JavaScriptController {

	@Autowired
	private JavaScriptService javaScriptService;
	@Autowired
	private JavaScriptRepository repos;

	@GetMapping("/javascript1")
	public List<JavaScript> getAllJavaScript() {
		return javaScriptService.getAllJavaScript();
	}

	@PostMapping("/post")
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody JavaScript java) {
		repos.save(java);
	}

	@GetMapping("/javascript1/{id}")
	public JavaScript getStudent(@PathVariable Integer id) {
		return javaScriptService.getJavaScript(id);
	}
}
