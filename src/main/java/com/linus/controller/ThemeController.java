package com.linus.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/theme")
public class ThemeController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("theme/index");
		return mav;
	}
}
