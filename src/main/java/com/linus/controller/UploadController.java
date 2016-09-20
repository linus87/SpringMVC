package com.linus.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/upload")
public class UploadController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/upload");
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, params="format=XML")
	public ModelAndView post(@RequestPart("file") MultipartFile xmlFile) throws IOException {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("request/upload");
		mav.addObject("originalName", xmlFile.getOriginalFilename());
		mav.addObject("name", xmlFile.getName());
		mav.addObject("contentType", xmlFile.getContentType());
		mav.addObject("fileSize", xmlFile.getSize());
		
		if (!xmlFile.isEmpty()) {
			File newFile = new File("d:/upload/upload.xml");
			xmlFile.transferTo(newFile);
		}
		return mav;
	}
}
