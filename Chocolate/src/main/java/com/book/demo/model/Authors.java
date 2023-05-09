package com.book.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Authors
{
@Id
@GeneratedValue
private Long authorid;
@Override
public String toString() {
return "Authors [authorid=" + authorid + ", authorname=" + authorname + ", bookwritten=" + bookwritten
+ ", bookyear=" + bookyear + ", dob=" + dob + ", birthplace=" + birthplace + "]";
}
public Authors()
{
super();
}
public Long getAuthorid() {
return authorid;
}
public void setAuthorid(Long authorid) {
this.authorid = authorid;
}
public String getAuthorname() {
return authorname;
}
public void setAuthorname(String authorname) {
this.authorname = authorname;
}
public String getBookwritten() {
return bookwritten;
}
public void setBookwritten(String bookwritten) {
this.bookwritten = bookwritten;
}
public int getBookyear() {
return bookyear;
}
public void setBookyear(int bookyear) {
this.bookyear = bookyear;
}
public String getDob() {
return dob;
}
public void setDob(String dob) {
this.dob = dob;
}
public String getBirthplace() {
return birthplace;
}
public void setBirthplace(String birthplace) {
this.birthplace = birthplace;
}
private String authorname;
private String bookwritten;
private int bookyear;
private String dob;
private String birthplace;

}