package com.example.demo.chocolateService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.chocolateModel.chocoModel1;


@Service
public class chocoService1 
{
	@Autowired
	public chocoRep1 crepo;
	
	public chocoModel1 saveInfo1(chocoModel1 c)
	{
		return crepo.save(c);
	}
	public List<chocoModel1> getInfo()
	{
		return crepo.findAll();
	}
	public chocoModel1 updateInfo(chocoModel1 iu)
	{
		return crepo.saveAndFlush(iu);
	}
	public void deleteInfo(int id)
	{
		crepo.deleteById(id);
	}
	//sort by descending order
		@GetMapping("/sortDes/{chocolatename}")
		public List<chocoModel1> sortPlayer(@PathVariable("train_name") String train_name)
		{
			return  crepo.sortDesc(train_name);
		}
		//pagination
		@GetMapping("/pagination/{pnu}/{psize}/{pname}")
		public List<chocoModel1> paginationData(@PathVariable("pnu") int pnu,@PathVariable("psize")int psize,@PathVariable("pname") String pname)
		{
			return  crepo.paginationData(pnu, psize, pname);
		}
		public List<chocoModel1> sortDesc(String id) {
			// TODO Auto-generated method stub
			return null;
		}
