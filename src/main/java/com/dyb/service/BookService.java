package com.dyb.service;


import java.util.List;

import com.dyb.entity.Book;

public interface BookService {
	public Book getById (long bookId);
	public List<Book> getList();
}
