package com.dyb.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dyb.entity.*;
import com.dyb.service.BookService;

public class BookDaoTest extends BaseTest {
	private static Logger logger = Logger.getLogger(BookDaoTest.class);
	@Autowired
	private BookService bookService = null;

	@Test
	public void testQueryById() throws Exception {
		long bookId = 1000;
		Book book = bookService.getById(bookId);
		logger.info(book.toString());
	}

	@Test
	public void testQueryAll() throws Exception {
		List<Book> books = bookService.getList();
		for (Book book : books) {
			logger.info(book.toString());
		}
	}

}