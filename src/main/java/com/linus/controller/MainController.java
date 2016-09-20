package com.linus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sun.istack.internal.logging.Logger;

@Controller
@RequestMapping("/main")
public class MainController {
//	org.springframework.web.servlet.support.RequestContextUtils
	private final Logger logger = Logger.getLogger(MainController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/form");
		mav.addObject("message", "Hello World!");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView post(@RequestBody String body, @RequestParam("check") String check) {
		ModelAndView mav = new ModelAndView();
		logger.warning(body);		
		logger.warning(check);
		mav.setViewName("request/form");
		mav.addObject("message", "Hello World!");
		return mav;
	}
	
	@RequestMapping(value="/index.html", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		mav.addObject("message", "Hello World!");
		return mav;
	}
	
	@RequestMapping("helloWorld.form")
	public ModelAndView helloWorld() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		mav.addObject("message", "Hello World!");
		return mav;
	}
}
