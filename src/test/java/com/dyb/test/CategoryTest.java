package com.dyb.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dyb.entity.Category;
import com.dyb.service.CategoryService;

public class CategoryTest extends BaseTest{
	private static Logger logger = Logger.getLogger(BookDaoTest.class);
	@Autowired
	CategoryService categoryService;
	
	@Test
	public void testList() throws Exception{
		List<Category> categories = categoryService.getList();
		for (Category category : categories) {
			logger.info(category.toString());
		}
	}
}
