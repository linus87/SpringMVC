package com.linus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cookie")
public class CookieController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get(@CookieValue("JSESSIONID") String jessionId) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("cookie/index");
		mav.addObject("jessionId", jessionId);
		return mav;
	}
}
