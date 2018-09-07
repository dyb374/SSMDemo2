package com.dyb.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dyb.entity.Category;
import com.dyb.entity.Page;
import com.dyb.service.CategoryService;
import com.dyb.test.BookDaoTest;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("")
public class CategoryController {
	private static Logger logger = Logger.getLogger(BookDaoTest.class);

	@Autowired
	CategoryService categoryService;

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public ModelAndView listCategory(Page page) {
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(), 5);
		List<Category> cs = categoryService.getList();
		int total = (int) new PageInfo<Category>(cs).getTotal();
		logger.info("ok ,total is " + total);
		page.caculateLast(total);
		logger.info("ok");
		mav.addObject("cs", cs);
		mav.setViewName("listCategory");
		return mav;
	}

	@RequestMapping(value = "/category", method = RequestMethod.PUT)
	public ModelAndView addCategory(Category category) {
		System.out.println("category.getName():" + category.getName());
		categoryService.add(category);
		ModelAndView mav = new ModelAndView("redirect:/category");
		return mav;
	}

	@RequestMapping(value = "/category/{id}", method = RequestMethod.DELETE)
	public ModelAndView deleteCategory(@PathVariable Integer id) {
		categoryService.delete(id);
		ModelAndView mav = new ModelAndView("redirect:/category");
		return mav;
	}

	@RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
	public ModelAndView editCategory(@PathVariable Integer id) {
		Category c = categoryService.get(id);
		ModelAndView mav = new ModelAndView("editCategory");
		mav.addObject("c", c);
		return mav;
	}

	@RequestMapping(value = "/category/{id}", method = RequestMethod.POST)
	public ModelAndView updateCategory(Category category) {
		categoryService.update(category);
		ModelAndView mav = new ModelAndView("redirect:/category");
		return mav;
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	@ResponseBody
	public String welcomeHandler() {
		return "welcome";
	}

	@RequestMapping(value = "/getJson", method = RequestMethod.GET)
	@ResponseBody
	public List<Category> getJson() {
		List<Category> cs = categoryService.getList();
		return cs;
	}
}
