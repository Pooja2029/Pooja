package com.book.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookDetails {
	@Id
	private int bookno;
private String name;
private String author;
private int year;
@Override
public String toString() {
	return "BookDetails [bookno=" + bookno + ", name=" + name + ", author=" + author + ", year=" + year + ", quantity="
			+ quantity + "]";
}
private int quantity;
public int getBookno() {
	return bookno;
}
public void setBookno(int bookno) {
	this.bookno = bookno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}