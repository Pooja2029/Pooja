package com.instagram.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.demo.Repository.InstaRepo;
import com.instagram.demo.model.*;
@Service
public class InstaService {

	@Autowired
	InstaRepo studRepository;

	public List<Student>getAllStudents()
	{
		List<Student>studList=studRepository.findAll();
		return studList;
	}

	public Student saveStudent(Student s) {
		
		Student obj=studRepository.save(s);
		return obj;
	}
	public Student updateStudent(Student s) {
		
		Student obj=studRepository.save(s);
		return obj;
	}
	public void deleteStudent(int register)
	{
		studRepository.deleteById(register);
	}
	public Student getStudent(int register) {
		Student s=studRepository.findById(register).get();
		return s;
		
	}
}
