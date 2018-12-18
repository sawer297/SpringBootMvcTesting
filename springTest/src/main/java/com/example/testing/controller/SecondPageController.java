package com.example.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.testing.model.Item;

@Controller
public class SecondPageController{
	
	@RequestMapping(value="/secondPage", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView secondPage(@ModelAttribute Item item){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("secondPage");
		
		//String str = "something something something, so hard to come up with testing lines";
		
		// 12/18/18 - SBL
		// modified so that second page message can be passed from another page
		String str = item.getName();
		mav.addObject("message", str);
		System.out.println("second page checkpoint reached");
		return mav;
	}
	
}