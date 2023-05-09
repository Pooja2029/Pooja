package com.book.demo.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.book.demo.model.Books;
@Repository
public interface NewBooksRepository extends JpaRepository<Books,Long> {
	@Query(value="select b from Books b join b.author a")
	List<Books>getBooks();
}