package com.bookstore.Service;

import java.util.List;

import com.bookstore.Entity.Book;

public interface BookService {
	List<Book> findAll();

	Book findOne(Long id);
}
