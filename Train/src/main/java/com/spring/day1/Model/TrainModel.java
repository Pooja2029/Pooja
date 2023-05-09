package com.spring.day1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="train_booking")
public class TrainModel
{
	@Id
	@Column(name="train_number")
   private int train_number;
   private String train_name;
   private String source;
   private String destination;
   private String start_time;
   private String reach_time;
   private String traveltime;
   private String class_seat;
   private String station_code;
  
   //login
          
public int getTrain_number() {
	return train_number;
}
public void setTrain_number(int train_number) {
	this.train_number = train_number;
}
public String getTrain_name() {
	return train_name;
}
public void setTrain_name(String train_name) {
	this.train_name = train_name;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getStart_time() {
	return start_time;
}
public void setStart_time(String start_time) {
	this.start_time = start_time;
}
public String getReach_time() {
	return reach_time;
}
public void setReach_time(String reach_time) {
	this.reach_time = reach_time;
}
public String getTraveltime() {
	return traveltime;
}
public void setTraveltime(String traveltime) {
	this.traveltime = traveltime;
}
public String getClass_seat() {
	return class_seat;
}
public void setClass_seat(String class_seat) {
	this.class_seat = class_seat;
}
public String getStation_code() {
	return station_code;
}
public void setStation_code(String station_code) {
	this.station_code = station_code;
}



   
}