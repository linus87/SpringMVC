package com.linus.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ajax/request");
		return mav;
	}
	
	@RequestMapping(value="/form", method = RequestMethod.POST, headers="content-type=application/x-www-form-urlencoded")
	@ResponseBody
	public String post(@RequestParam("name") String name, @RequestParam("english") float score) {
		return name + ":" + score;
	}
	
	@RequestMapping(value="/form", method = RequestMethod.POST, headers="content-type=multipart/form-data")
	@ResponseBody
	public String formData(@RequestParam("name") String name, @RequestParam("english") float score) {
		return name + ":" + score;
	}
	
	@RequestMapping(value="/file", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView file() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ajax/file");
		
		return mav;
	}
	
	@RequestMapping(value="/file", method = RequestMethod.POST, headers="content-type=multipart/form-data")
	@ResponseBody
	public String fileUpload(@RequestParam("file") MultipartFile file) throws IOException {
		if (!file.isEmpty()) {
			File newFile = new File("d:/upload/" + file.getOriginalFilename());
			file.transferTo(newFile);
		}
		
		return "File Upload Success";
	}
}
