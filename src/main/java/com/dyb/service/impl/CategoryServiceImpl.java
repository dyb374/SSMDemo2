package com.dyb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyb.dao.CategoryDao;
import com.dyb.entity.Category;
import com.dyb.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryDao categoryDao;

	public List<Category> getList() {
		return categoryDao.list();
	}
	
}
