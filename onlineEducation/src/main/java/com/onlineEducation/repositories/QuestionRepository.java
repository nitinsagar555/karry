package com.onlineEducation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineEducation.models.Question;


public interface QuestionRepository extends JpaRepository <Question, Integer> {

}
