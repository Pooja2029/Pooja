package com.instagram.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.demo.Service.*;
import com.instagram.demo.model.*;
@RestController
@Service
public class InstaController {

	@Autowired
	InstaService studService;
@GetMapping(value="/fetchStudents")

public List<Student>getAllStudent()
{
	List<Student>studList=studService.getAllStudents();
	return studList;
}
//http://localhost:9080/saveStudent
	
@PostMapping("/saveStudent")
public Student saveStudent(@RequestBody Student s)
{
	return studService.saveStudent(s);
}
@PutMapping("/updateStudent")
public Student updateStudent(@RequestBody Student s)
{
	return studService.saveStudent(s);
}

@DeleteMapping("/deleteStudent/{register}")
public void deleteStudent(@PathVariable("register")int register)
{
	 studService.deleteStudent(register);
}
@GetMapping("/getStudent/{register}")
public Student getStudent(@PathVariable("register")  int register)
{
	return studService.getStudent(register);
}
}
