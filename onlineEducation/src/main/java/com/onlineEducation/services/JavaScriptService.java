package com.onlineEducation.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineEducation.models.JavaScript;
import com.onlineEducation.repositories.JavaScriptRepository;

@Service
public class JavaScriptService {
	@Autowired
	private JavaScriptRepository javaScriptRepository;

	public List<JavaScript> getAllJavaScript() {
		List<JavaScript> javaScript = new ArrayList<>();
		javaScriptRepository.findAll().forEach(javaScript::add);
		return javaScript;
	}

	public JavaScript getJavaScript(Integer id) {
		Optional<JavaScript> result = javaScriptRepository.findById(id);
		return result.get();
	}

}
