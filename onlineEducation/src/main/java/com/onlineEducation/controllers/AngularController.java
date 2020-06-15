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

import com.onlineEducation.models.Angular;
import com.onlineEducation.repositories.AngularRepository;
import com.onlineEducation.services.AngularService;

@RestController
@RequestMapping("/angular")
@CrossOrigin
public class AngularController {
	@Autowired
	private AngularService angularService;
	@Autowired
	private AngularRepository repos;

	@GetMapping("/angular1")
	public List<Angular> getAllAngular() {
		return angularService.getAllAngular();
	}

	@PostMapping("/post")
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Angular angular) {
		repos.save(angular);
	}

	@GetMapping("/angular1/{id}")
	public Angular getAngular(@PathVariable Integer id) {
		return angularService.getAngular(id);
	}

}
