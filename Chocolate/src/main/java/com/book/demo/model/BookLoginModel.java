package com.book.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BookLogin")
public class BookLoginModel
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public String getDob() {
return dob;
}
public void setDob(String dob) {
this.dob = dob;
}
public String getGuardian() {
return Guardian;
}
public void setGuardian(String guardian) {
Guardian = guardian;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public String getConfirmAddress() {
return confirmAddress;
}
public void setConfirmAddress(String confirmAddress) {
this.confirmAddress = confirmAddress;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
private String username;
private String password;
private int age;
private String gender;
private String dob;
private String Guardian;
private String address;
private String confirmAddress;
private String city;



}
