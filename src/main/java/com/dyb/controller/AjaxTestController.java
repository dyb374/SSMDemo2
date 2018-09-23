package com.dyb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class AjaxTestController {

	@RequestMapping(value="/ajax", method=RequestMethod.GET)
	public ModelAndView ajaxTest() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ajaxTest");
		return mav;		
	}
	
	@RequestMapping(value="/demo_get", method=RequestMethod.GET,produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getTest() {
		return "这是从服务端异步传回的信息";
	}
	
	@RequestMapping(value="/demo_post", method=RequestMethod.POST,produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String postTest(HttpServletRequest request) {
		String name = request.getParameter("name");
		return "Hello " + name;
	}
	
	@RequestMapping(value="/demo_json", method=RequestMethod.POST,produces="application/json;charset=UTF-8")
	@ResponseBody
	public String jsonTest(HttpServletRequest request) {
		String name = request.getParameter("name");
		return "{\"success\":true,\"msg\":\"" + name + "\"}";
	}
}
