package com.linus.excel.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.linus.excel.ISheetReader;
import com.linus.excel.SheetReader;
import com.linus.excel.po.User;

@Controller
@RequestMapping("/excel")
public class ExcelController {
	
	private Logger logger = Logger.getLogger(ExcelController.class.getName());
	private ObjectMapper mapper = new ObjectMapper();
	
	@Autowired
	private Validator validator;
	
	@RequestMapping(method = RequestMethod.GET, value="/get")
	public ModelAndView get(ServletRequest request) throws IOException {
		ServletContext context = request.getServletContext();
		
		Set<ConstraintViolation<Object>> constraintViolations = new HashSet<ConstraintViolation<Object>>();
		
		ISheetReader sheetReader = new SheetReader();
		sheetReader.setValidator(validator);
		
		File file = new File(context.getRealPath("excel/sheetreader.xlsx"));
		FileInputStream fis = null;
		Workbook wb = null;
		
		try {
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet sheet = wb.getSheetAt(0);
		List<Object> users = sheetReader.readSheet(sheet, User.class, 1, constraintViolations);
		
		if (constraintViolations != null) {
			System.out.println(constraintViolations.size());
			Iterator<ConstraintViolation<Object>> violationIter = constraintViolations.iterator();
			while(violationIter.hasNext()) {
				ConstraintViolation<Object> error = violationIter.next();
				
				logger.warn("Error message: " + error.getMessage());
				logger.warn("Invalid: " + error.getInvalidValue());
			}
		}		
		
		if (users != null && !users.isEmpty()) {
			Iterator<Object> iter = users.iterator();
			while (iter.hasNext()) {
				User user = (User)iter.next();
				logger.info(mapper.writeValueAsString(user));
			}
		}
		
		fis.close();
		wb.close();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("excel/index");
		mav.addObject("errors", constraintViolations);
		return mav;
	}
}
