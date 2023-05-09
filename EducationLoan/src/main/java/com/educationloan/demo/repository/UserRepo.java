package com.educationloan.demo.repository;

import org.springframework.stereotype.Repository;

import com.educationloan.demo.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer> {

}