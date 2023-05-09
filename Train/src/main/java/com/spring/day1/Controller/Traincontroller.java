package com.spring.day1.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.day1.Model.TrainModel;
import com.spring.day1.Service.Trainservice;
@RestController
public class Traincontroller 
{
	@Autowired
  public Trainservice tser;
  
	public TrainModel addDetails(@RequestBody TrainModel iml)
	{
		return tser.adddetails(iml);
	}
	@GetMapping(value="/fetch")
	public List<TrainModel> getAll()
	{
		List<TrainModel> railList=tser.getAll();
		return railList;
	}
	
	@PostMapping(value="/save")
	public TrainModel save(@RequestBody TrainModel r)
	{
		return tser.save(r);
	}
	
	@PutMapping(value="/update")
	public TrainModel update(@RequestBody TrainModel r)
	{
		return tser.update(r);
	}
	
	@DeleteMapping(value="/delete/{sno}")
	public void delete(@PathVariable("sno") int sno)
	{
		tser.delete(sno);
	}
	//sort by descending order
	@GetMapping("/sortDes/{field}")
	public List<TrainModel> sortPlayer(@PathVariable("field") String field)
	{
		return tser.sortDesc(field);
	}
	//pagination
	@GetMapping("/pagination/{pnu}/{psize}/{train_name}")
	public List<TrainModel> paginationData(@PathVariable("pnu") int pnu,@PathVariable("psize")int psize,@PathVariable("train_name") String train_name)
	{
		return tser.paginationData(pnu, psize, train_name);
	}

	@GetMapping("/fetchStudentByNamePrefix")
	public List<TrainModel>fetchStudentsByNamePrefix(@RequestParam String prefix)
	{
	return tser.fetchStudentsByNamePrefix(prefix);
	}
	@GetMapping("/fetchStudentByNameSuffix")
	public List<TrainModel>fetchStudentsByNameSuffix(@RequestParam String suffix)
	{
	return tser.fetchStudentsByNameSuffix(suffix);
	}
	@GetMapping("/getStudentByDepartment/{department}/{name}")
	public List<TrainModel>fetchStudentsByDepartment(@PathVariable String department,@PathVariable String name)
	{
	return tser.getStudentsByDepartment(department,name);
	}
	@DeleteMapping("/deletebyquery/{name}")
	public String deleteStudentByName(@PathVariable("name") String name)
	{
	int result=tser.deleteStudentByName(name);
	if(result>0)
	return "Student record deleted";
	else
	return "Problem occured while deleting";
	}
	@PutMapping("/updatebyquery/{department}/{name}")
	public String updateStudent(@PathVariable ("department")String department,@PathVariable ("name")String name)
	{
	int result= tser.updateStudent(department,name);
	if(result>0)
	return "Student record updated";
	else
	return "Problem occured while updating";


	}
	@GetMapping("fetchbymail/{email}")
	public List<TrainModel> fetchStudentByEmail(@PathVariable String email){
	return tser.fetchStudentByEmail(email);
	}
}
