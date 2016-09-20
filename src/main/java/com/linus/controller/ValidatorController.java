package com.linus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.linus.validator.PersonValidator;
import com.linus.vo.Person;

@Controller
@RequestMapping("/validation")
public class ValidatorController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("validation/form");
		return mav;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView post(@Validated Person person, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("validation/form");
		
		if (result.hasErrors()) {
			mav.addObject("message", "Validation fail");
		} else {
			mav.addObject("message", "Validation is passed");
		}
		
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, params="way=normal")
	public ModelAndView noModelAttribute(@Validated Person user) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("validation/form");
		mav.addObject("user", user);
		mav.addObject("message", "From POJO");
		return mav;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new PersonValidator());
	}
}
