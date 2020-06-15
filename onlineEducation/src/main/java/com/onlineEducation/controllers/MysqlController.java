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

import com.onlineEducation.models.Mysql;
import com.onlineEducation.repositories.MysqlRepository;
import com.onlineEducation.services.MysqlService;

@RestController
@RequestMapping("/mysql")
@CrossOrigin
public class MysqlController {

	@Autowired
	private MysqlService mysqlService;

	@Autowired
	private MysqlRepository mysqlRepository;

	@RequestMapping("/mysql1")
	public List<Mysql> getAllMysql() {
		return mysqlService.getAllMysql();
	}

	@GetMapping(value = "mysql/{id}")
	public Optional<Mysql> findBynum(@PathVariable int id) {

		Optional<Mysql> mysql = mysqlRepository.findById(id);
		return mysql;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/post")
	public void addMysql(@RequestBody Mysql mysql) {
		mysqlService.addMysql(mysql);
	}
}
