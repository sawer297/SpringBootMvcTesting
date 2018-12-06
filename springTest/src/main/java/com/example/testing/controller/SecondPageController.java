package com.example.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondPageController{
	
	@RequestMapping(value="/secondPage", method=RequestMethod.GET)
	public ModelAndView secondPage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("secondPage");
		
		String str = "something something something, so hard to come up with testing lines";
		mav.addObject("message", str);
		System.out.println("second page checkpoint reached");
		return mav;
	}
	
}