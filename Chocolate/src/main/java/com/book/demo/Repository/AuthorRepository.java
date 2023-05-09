package com.book.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.demo.model.Authors;

@Repository
public interface AuthorRepository extends JpaRepository <Authors,Long>{

}