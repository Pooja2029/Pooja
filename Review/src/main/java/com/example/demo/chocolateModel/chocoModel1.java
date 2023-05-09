package com.example.demo.chocolateModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CandyMenu") 
public class chocoModel1
{
	@Id
    @Column(name="id") 
	  private int id;
	  private String chocolatename;
	  private int price;
	  private String color;
	  private int manufacturedate;
	  private int expirydate;
	  private int netweight;
	  private String brand;
	  private String mainincrediants;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChocolatename() {
		return chocolatename;
	}
	public void setChocolatename(String chocolatename) {
		this.chocolatename = chocolatename;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getManufacturedate() {
		return manufacturedate;
	}
	public void setManufacturedate(int manufacturedate) {
		this.manufacturedate = manufacturedate;
	}
	public int getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(int expirydate) {
		this.expirydate = expirydate;
	}
	public int getNetweight() {
		return netweight;
	}
	public void setNetweight(int netweight) {
		this.netweight = netweight;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMainincrediants() {
		return mainincrediants;
	}
	public void setMainincrediants(String mainincrediants) {
		this.mainincrediants = mainincrediants;
	}
