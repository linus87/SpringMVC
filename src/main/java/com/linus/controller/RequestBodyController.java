package com.linus.controller;

import javax.xml.transform.Source;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/requestbody")
public class RequestBodyController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/request_body");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, params="format=STRING")
	public ModelAndView str(@RequestBody String content) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/request_body");
		mav.addObject("content", content);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, params="format=BYTE_ARRAY")
	public ModelAndView byteArray(@RequestBody byte[] content) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/request_body");
		mav.addObject("content", content);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, params="format=FORM")
	public ModelAndView form(@RequestBody MultiValueMap<String, String> content) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/request_body");
		mav.addObject("content", content);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="multipart", params="format=STRING")
	public ModelAndView source(@RequestPart("file") MultipartFile content) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/request_body");
		mav.addObject("content", content);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, params="format=MARSHALLING")
	public ModelAndView mashal(@RequestBody Source content) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/request_body");
		mav.addObject("content", content);
		return mav;
	}
}
