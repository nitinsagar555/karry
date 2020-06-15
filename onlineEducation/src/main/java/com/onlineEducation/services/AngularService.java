package com.onlineEducation.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineEducation.models.Angular;
import com.onlineEducation.repositories.AngularRepository;

@Service
public class AngularService {
	@Autowired
	private AngularRepository angularRepository;

	public List<Angular> getAllAngular() {
		List<Angular> angular = new ArrayList<>();
		angularRepository.findAll().forEach(angular::add);
		return angular;
	}

	public Angular getAngular(Integer id) {
		Optional<Angular> result = angularRepository.findById(id);
		return result.get();
	}

}
