package com.onlineEducation.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineEducation.models.Clanguage;
import com.onlineEducation.repositories.ClanguageRepository;

@Service
public class ClanguageService {

	@Autowired
	private ClanguageRepository clanguageRepository;

	public List<Clanguage> getAllClanguage() {
		List<Clanguage> clanguage = new ArrayList<>();
		clanguageRepository.findAll().forEach(clanguage::add);
		return clanguage;
	}

	public void addClanguage(Clanguage clanguage) {
		clanguageRepository.save(clanguage);

	}

}
