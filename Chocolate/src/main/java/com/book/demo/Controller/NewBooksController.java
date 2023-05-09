package com.book.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.demo.Service.NewBooksService;
import com.book.demo.model.Books;
@RestController
public class NewBooksController {

@Autowired
public NewBooksService bser;

@PostMapping("/postbooks")
public Books add(@RequestBody Books name)
{
	return bser.addBooks(name);
}
@GetMapping("/getbooks")
public List<Books> getBooks()
{
	return bser.getBooks();
}
}