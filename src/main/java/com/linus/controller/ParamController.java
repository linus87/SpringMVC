package com.linus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/param")
public class ParamController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/param");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, params={"action=DELETE", "role!=MEMBER", "role!=GUEST"})
	public ModelAndView add() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/param");
		mav.addObject("message", "Delete User successful");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, params={"action=DELETE", "role!=MODERATOR", "role!=ADMIN"})
	public ModelAndView forbidden() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/param");
		mav.addObject("message", "Sorry, you don't have the right to delete new user.");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, params="action=ADD")
	public ModelAndView delete() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/param");
		mav.addObject("message", "Add User success");
		return mav;
	}
}
