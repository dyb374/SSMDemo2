package com.dyb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addTwo() {
		Category c1 = new Category();
		c1.setName("名字");
		categoryDao.insert(c1);
		
		Category c2 = new Category();
		c2.setName("名字很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长");
		categoryDao.insert(c2);
		
	}

	public void delete(Integer integer) {
		categoryDao.deleteByPrimaryKey(integer);
	}

	public void update(Category category) {
		categoryDao.updateByPrimaryKey(category);
	}

	public Category get(Integer integer) {
		return categoryDao.selectByPrimaryKey(integer);
	}

	public void add(Category category) {
		categoryDao.insert(category);
	}
	
}
