package com.spring.day1.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import com.spring.day1.Model.TrainModel;
import com.spring.day1.Repository.Trainrepo;

@Service

public class Trainservice 
{
	@Autowired
	public Trainrepo trepo;
	public TrainModel adddetails(TrainModel iml) {
		
		return trepo.save(iml);
	}
	
	public List<TrainModel> getAll() {
		List<TrainModel> railList=trepo.findAll();
		return railList;
	}

	public TrainModel save(TrainModel r) {
		TrainModel obj=trepo.save(r);
		return obj;
	}

	public TrainModel update(TrainModel r) {
		TrainModel obj=trepo.save(r);
		return obj;
	}

	public void delete(int sno)
	{
		trepo.deleteById(sno);
	}
	//sorting
	public List<TrainModel> sortDesc(String train_name)
	{
		return trepo.findAll(Sort.by(train_name).descending());
	}
	
	public List<TrainModel> paginationData(int pageNu, int pageSize,String train_name) 
    {
		Page<TrainModel> p=trepo.findAll(PageRequest.of(pageNu, pageSize,Sort.by(train_name).descending()));
		return p.getContent();
	}
	public List<TrainModel>fetchStudentsByNamePrefix(String prefix)
	{
	return trepo.fetchStudentsBySourcePrefix(prefix);
	}
	public List<TrainModel>fetchStudentsByNameSuffix(String suffix)
	{
	return trepo.fetchStudentsBySourceSuffix(suffix);
	}
	public List<TrainModel>fetchStudentsByDepartment(String department,String name)
	{
	return trepo.getStudentsByDestination(department,name);
	}
	public int deleteStudentByName(String name)
	{
	return trepo.deleteStudentByName(name);
	}
	public int updateStudent(String department,String name)
	{
	return trepo.updateStudentByName(department,name);

	}
	public List<TrainModel> fetchStudentByEmail(String email){
	return trepo.fetchStudentByEmail(email);
	}


	

	
}