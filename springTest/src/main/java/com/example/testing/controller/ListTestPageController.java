package com.example.testing.controller;

//import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.testing.model.Item;

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
	
	
	
	////////////////////////////////////////////////////////////////////////
	// 12/18/18 - SBL
	///////////////////////////////////////////
	
	/**
	 *  method for redirecting a link, from the list on list page, to second page
	 * @param item - message string 
	 * @return redirect to second page
	 */
	@RequestMapping(value="/secondPageRedirect", method = RequestMethod.GET)
	public ModelAndView SecondPageRedirect(@ModelAttribute Item item){
		return new ModelAndView("redirect:/secondPage?name="+item.getName());
	}
	
}