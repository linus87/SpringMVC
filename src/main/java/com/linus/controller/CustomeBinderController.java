package com.linus.controller;

import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.linus.propertyeditors.ColorEditor;
import com.linus.vo.PropertyEditorTestVo;
import com.sun.istack.internal.logging.Logger;

@Controller
@RequestMapping("/customBinder")
public class CustomeBinderController {
	private final Logger logger = Logger.getLogger(CustomeBinderController.class);
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@InitBinder
	public void initBinder2(WebDataBinder binder, WebRequest request) {
		logger.warning(request.getHeader("Content-Type"));
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
		
		binder.registerCustomEditor(Color.class, new ColorEditor());
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("customBinder/index");
		mav.addObject("date", new Date(10, 10, 100));
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView post(@ModelAttribute("vo") PropertyEditorTestVo vo) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("customBinder/index");
		return mav;
	}
}
