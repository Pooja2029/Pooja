package com.book.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.book.demo.Repository.bookRepository;
import com.book.demo.model.BookDetails;


import jakarta.transaction.Transactional;

import java.util.List;
@Service
public class BookService {
	@Autowired
	bookRepository repo;
	
	public List<BookDetails>getAllBooks()
	{
		List<BookDetails>bookList=repo.findAll();
		return bookList;
	}

	public BookDetails saveBooks(BookDetails s) {
		
		BookDetails obj=repo.save(s);
		return obj;
	}
	public BookDetails updateBooks(BookDetails s) {
		
		BookDetails obj=repo.save(s);
		return obj;
	}
	public void deleteBooks(int bookno)
	{
		repo.deleteById(bookno);
	}
	public BookDetails getBooks(int bookno) {
		BookDetails s=repo.findById(bookno).get();
		return s;
	}
	public List<BookDetails>sortBooksASC(String field)
	{
		return repo.findAll(Sort.by(field));
		
		
	}
	public List<BookDetails>sortBooksDES(String field)
	{
		return repo.findAll(Sort.by(Direction.DESC,field));
		
	}
	public Page<BookDetails> pagingBooks(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<BookDetails>bookData=repo.findAll(paging);
		//List<BookDetails>BookList=bookData.getContent();
	    return bookData;
	}
	public List<BookDetails>pagingAndSorting(int offset,int pageSize,String field)
	{
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<BookDetails>bk=repo.findAll(paging);
		return bk.getContent();
	}
	public List<BookDetails> fetchBooksByNamePrefix(String prefix)
	{
		  return repo.findByNameStartingWith(prefix);
	}
	public List<BookDetails> fetchBooksByNameSuffix(String suffix)
	{
		  return repo.findByNameEndingWith(suffix);
	}
	public List<BookDetails> getBooksByAuthor(String author,String name)
	{
		  return repo.getBooksByAuthor(author,name);
		  
	}
	@Transactional
	public int deleteBookByName(String name)
	{
		return repo.deleteBookByName(name);
		
	}
	@Transactional
	public int updateBook(String author,String name)
	{
		return repo.updateBook(author, name);
	}
	
	public List<BookDetails> fetchBookByAuthor(String  author)
	{
		return repo.fetchBookByAuthor(author);
}
}