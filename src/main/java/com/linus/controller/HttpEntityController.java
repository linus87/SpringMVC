package com.linus.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/entity")
public class HttpEntityController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("entity/index");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView add(HttpEntity<String> requestEntity) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("entity/index");
		HttpHeaders headers = requestEntity.getHeaders();
		mav.addObject("contentType", headers.getContentType().getType());
		mav.addObject("body", requestEntity.getBody());
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, headers="content-type=multipart/form-data")
	public ModelAndView multipart(HttpEntity<byte[]> requestEntity) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("entity/index");
		HttpHeaders headers = requestEntity.getHeaders();
		mav.addObject("contentType", headers.getContentType().getType());
		mav.addObject("body", requestEntity.getBody().length);
		return mav;
	}
}
