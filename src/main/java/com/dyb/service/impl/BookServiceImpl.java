package com.dyb.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyb.dao.BookDao;
import com.dyb.entity.Book;
import com.dyb.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;

	public Book getById(long bookId) {
		return this.bookDao.selectByPrimaryKey(bookId);
	}

	public List<Book> getList() {
		List<Book> books = bookDao.queryAll(0, 4);
		return books;
	}

}
