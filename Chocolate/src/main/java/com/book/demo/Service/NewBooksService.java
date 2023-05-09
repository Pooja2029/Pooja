package com.book.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.demo.Repository.NewBooksRepository;
import com.book.demo.model.Books;

@Service
public class NewBooksService {
	@Autowired
	public NewBooksRepository brep;

public Books addBooks(Books name)
{
	return brep.save(name);
}
public List<Books> getBooks()
{
	return brep.findAll();
}
}