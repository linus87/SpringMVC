package com.linus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.linus.vo.Person;

@Controller
@RequestMapping("/modelAttribute")
@SessionAttributes("message")
public class ModelAttributeController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("modelAttribute/form");
		return mav;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView post(@ModelAttribute("person") Person person) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("modelAttribute/form");
		mav.addObject("message", "From ModelAttribute");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, params="way=normal")
	public ModelAndView noModelAttribute(Person user) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("modelAttribute/form");
		mav.addObject("user", user);
		mav.addObject("message", "From POJO");
		return mav;
	}
}
