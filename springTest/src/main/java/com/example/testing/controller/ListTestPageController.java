package com.example.testing.controller;

//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListTestPageController{
	
	String[] list = {"item 1","item 2","item 3", "item 4", "item 5", "item 6", "item 7"};
	
	/**
	 * method for accessing ListTestPage page
	 * @return
	 */
	@RequestMapping(value="/listTestPage", method = RequestMethod.GET)
	public ModelAndView listTestPage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("listTestPage");
		
		mav.addObject("message", "The List to end all lists.");
		mav.addObject("items", list);
		System.out.println("list page checkpoint reached");
		return mav;
	}
	
}