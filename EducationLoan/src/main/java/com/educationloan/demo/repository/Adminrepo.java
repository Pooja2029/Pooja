package com.educationloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationloan.demo.model.AdminModel;

@Repository
public interface Adminrepo extends JpaRepository<AdminModel,String> {

	void deleteByPassword(String password);

}