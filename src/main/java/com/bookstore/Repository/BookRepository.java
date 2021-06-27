package com.bookstore.Repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.Entity.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
	
	List<Book> findByTitleContaining(String title);
}
