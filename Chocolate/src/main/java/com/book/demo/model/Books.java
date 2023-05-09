package com.book.demo.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Books {
	@Id
	@GeneratedValue
    private Long bookid;
	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", name=" + name + ", quantity=" + quantity + ",  publisher=" + publisher + "]";
	}
	public Books()
	{
		super();
		}
	public Long getBookid() {
		return bookid;
	}
	public void setBookid(Long bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	private String name;
	private int quantity;
	private String publisher;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "")
	private Authors author;
	public Authors getAuthor() {
		return author;
	}
	public void setAuthor(Authors author) {
		this.author = author;
	}
	
	
	
}