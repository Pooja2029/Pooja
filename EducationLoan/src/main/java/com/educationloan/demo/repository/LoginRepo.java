
package com.educationloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationloan.demo.model.LoginModel;

@Repository
public interface LoginRepo extends JpaRepository<LoginModel,String>{

	void deleteByPass(String password);

}