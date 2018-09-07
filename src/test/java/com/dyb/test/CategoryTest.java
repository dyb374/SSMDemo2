package com.dyb.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dyb.dao.CategoryDao;
import com.dyb.entity.Category;
import com.dyb.service.CategoryService;

public class CategoryTest extends BaseTest{
	private static Logger logger = Logger.getLogger(BookDaoTest.class);
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Test
	public void testList() throws Exception{
		List<Category> categories = categoryService.getList();
		for (Category category : categories) {
			logger.info(category.toString());
		}
	}
	
	@Test
	public void testAddTwo() throws Exception{
		categoryService.addTwo();
	}
	
	/*
	@Test
    public void testAdd() throws Exception{
        for (int i = 0; i < 100; i++) {
            Category category = new Category();
            category.setName("new Category");
            categoryDao.insert(category);
        }
 
    }
    */
}
