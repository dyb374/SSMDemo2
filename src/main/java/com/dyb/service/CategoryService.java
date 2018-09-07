package com.dyb.service;

import java.util.List;

import com.dyb.entity.Category;

public interface CategoryService {
	public List<Category> getList();
	public void addTwo();
	public void delete(Integer integer);
	public void update(Category category);
	public Category get(Integer integer);
	public void add(Category category);
}
