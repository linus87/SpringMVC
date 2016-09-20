package com.linus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.linus.vo.FormatterTestVo;

@Controller
@RequestMapping("/conversion")
public class TypeConversionController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("conversion/index");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView post(@ModelAttribute("vo") FormatterTestVo vo) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("conversion/index");
		return mav;
	}

}
