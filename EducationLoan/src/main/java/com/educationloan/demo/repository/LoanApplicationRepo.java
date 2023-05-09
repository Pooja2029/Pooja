package com.educationloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educationloan.demo.model.LoanApplicationModel;

@Repository
public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer>{

}