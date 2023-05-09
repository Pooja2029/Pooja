package com.book.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.book.demo.Service.BookService;
import com.book.demo.model.BookDetails;



@RestController
public class BookController {
@Autowired
BookService bs;
@GetMapping(value="/fetchBooks")

public List<BookDetails>getAllBooks()
{
	List<BookDetails>bookList=bs.getAllBooks();
	return bookList;
}
//http://localhost:8080/saveBooks

@PostMapping(value="/saveBooks")
public BookDetails saveBooks(@RequestBody BookDetails s)
{
	return bs.saveBooks(s);
}
@PutMapping(value="/updateBooks")
public BookDetails updateBooks(@RequestBody BookDetails s)
{
	return bs.saveBooks(s);
}
@DeleteMapping(value="/deleteBooks/{bookno}")
public void deleteBooks(@PathVariable("bookno")int bookno)
{
	 bs.deleteBooks(bookno);
}
@GetMapping(value="/getBooks/{bookno}")
public BookDetails getBooks(@PathVariable("bookno")  int bookno)
{
	return bs.getBooks(bookno);
}
@GetMapping("/sortBooksasc/{field}")
public List<BookDetails> sortBooksAsc(@PathVariable String field)
{
	 return bs.sortBooksASC(field);

}
@GetMapping("/sortBooksdes/{field}")
public List<BookDetails> sortBooksDes(@PathVariable String field)
{
	 return bs.sortBooksDES(field);

}
@GetMapping("/paging/{offset}/{pageSize}")
public Page<BookDetails>pagingBooks(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize)
{
	return bs.pagingBooks(offset, pageSize);
}
@GetMapping("/pagingAndSorting/{offset}/{pageSize}/{field}")
public List<BookDetails>pagingAndSorting(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize,@PathVariable("field") String field)
{
	return bs.pagingAndSorting(offset, pageSize,field);
}
@GetMapping("/fetchBookByNamePrefix/{prefix}")
public List<BookDetails>fetchBooksByNamePrefix(@PathVariable String prefix)
{
	return bs.fetchBooksByNamePrefix(prefix);
}
@GetMapping("/fetchBookByNameSuffix/{suffix}")
public List<BookDetails>fetchStudentsByNameSuffix(@PathVariable String suffix)
{
	return bs.fetchBooksByNameSuffix(suffix);
}
@GetMapping("/getBookByAuthor/{author}/{name}")
public List<BookDetails>fetchStudentsByDepartment(@PathVariable String author,@PathVariable String name)
{
	return bs.getBooksByAuthor(author,name);
}
@DeleteMapping("/deletebyquery/{name}")
public String deleteBookByName(@PathVariable("name") String name)
{
	int result=bs.deleteBookByName(name);
	if(result>0)
		return "Book record deleted";
	else
		return "Problem occured while deleting";
}
@PutMapping("/updatebyquery/{author}/{name}")
public String updateBook(@PathVariable ("author")String author,@PathVariable ("name")String name)
{
	int result= bs.updateBook(author,name);
	if(result>0)
		return "Book record updated";
	else
		return "Problem occured while updating";
	
	
}
@GetMapping("/fetchByAuthor/{author}")
public List<BookDetails> fetchTeamByLoses(@PathVariable String  author)
{
	return bs.fetchBookByAuthor(author);
}
}