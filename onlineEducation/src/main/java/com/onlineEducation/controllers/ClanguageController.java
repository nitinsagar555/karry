package com.onlineEducation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onlineEducation.models.Clanguage;
import com.onlineEducation.repositories.ClanguageRepository;
import com.onlineEducation.services.ClanguageService;

@RestController
@RequestMapping("/clanguage")
@CrossOrigin
public class ClanguageController {

	@Autowired
	private ClanguageService clanguageService;

	@Autowired
	private ClanguageRepository clanguageRepository;

	@RequestMapping("/clanguage1")
	public List<Clanguage> getAllClanguage() {
		return clanguageService.getAllClanguage();
	}

	@GetMapping(value = "clanguage/{id}")
	public Optional<Clanguage> findBynum(@PathVariable int id) {

		Optional<Clanguage> clanguage = clanguageRepository.findById(id);
		return clanguage;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/post")
	public void addClanguage(@RequestBody Clanguage clanguage) {
		clanguageService.addClanguage(clanguage);
	}

}
