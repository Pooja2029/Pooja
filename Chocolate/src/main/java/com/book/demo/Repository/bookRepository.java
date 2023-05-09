package com.book.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.book.demo.model.BookDetails;
@Repository
public interface bookRepository extends JpaRepository<BookDetails,Integer>{
	//positional parameters
		@Query("select s from BookDetails s where s.author=?1 and s.name=?2")
		public List<BookDetails>getBooksByAuthor(String author,String name);
		//named parameter
		@Query("select s from BookDetails s where s.author=:author")
		public List<BookDetails>getBooksByAuthor(String author);
		//DML
		@Modifying
		@Query("delete from BookDetails s where s.name=?1")
	    public int deleteBookByName(String name);
	@Modifying
	@Query("update BookDetails s set s.author=?1 where s.name=?2 ")
	 int updateBook(String author,String name);

	@Query(value="select * from book_details  s where  s.author= ?1", nativeQuery=true)
	public List<BookDetails> fetchBookByAuthor(String  author);
		
		List <BookDetails>findByNameStartingWith(String prefix);
	   
		List <BookDetails>findByAuthor(String author);
	    List <BookDetails>findByNameEndingWith(String suffix);
}