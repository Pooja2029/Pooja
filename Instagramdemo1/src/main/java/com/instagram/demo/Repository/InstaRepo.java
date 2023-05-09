package com.instagram.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.instagram.demo.model.Student;

public interface InstaRepo extends JpaRepository<Student, Integer> {

}
