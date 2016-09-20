package com.linus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.istack.internal.logging.Logger;

@Controller
@RequestMapping("/json")
public class JSONController {
	private final Logger logger = Logger.getLogger(JSONController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("json/request");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String post(@RequestParam("name") String students) {
		logger.warning(students);
		return "hello world";
	}
}
