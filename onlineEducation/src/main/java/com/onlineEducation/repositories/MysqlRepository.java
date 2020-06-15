package com.onlineEducation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineEducation.models.Mysql;

public interface MysqlRepository extends JpaRepository<Mysql, Integer> {

}
