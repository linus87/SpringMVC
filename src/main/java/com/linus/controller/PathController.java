package com.linus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.sun.istack.internal.logging.Logger;

@Controller
@RequestMapping("/path")
public class PathController {
//	org.springframework.web.servlet.support.RequestContextUtils
//	private final Logger logger = Logger.getLogger(PathController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/path");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{userId}")
	public ModelAndView getUser(@PathVariable("userId") String userId) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/path");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{userId}/pets/{petId}")
	public ModelAndView getPet(@PathVariable("userId") String userId, @PathVariable("petId") String petId) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/path");
		return mav;
	}
}
