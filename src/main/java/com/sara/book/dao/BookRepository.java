package com.sara.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sara.book.dao.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> 
{
	
}
