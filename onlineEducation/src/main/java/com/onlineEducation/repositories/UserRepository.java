package com.onlineEducation.repositories;

import org.springframework.data.repository.CrudRepository;

import com.onlineEducation.models.User;
public interface UserRepository extends CrudRepository<User, Integer> {

}
