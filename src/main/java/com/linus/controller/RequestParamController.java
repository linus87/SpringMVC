package com.linus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/requestparam")
public class RequestParamController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/request_param");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("role") String role, @RequestParam("action") String action) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/request_param");
		mav.addObject("message", "Delete User successful");
		mav.addObject("role", role);
		mav.addObject("action", action);
		return mav;
	}
}
