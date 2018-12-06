package com.example.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OpendapController{
	
	/**
	 * method for accessing Opendap home page
	 * @return 
	 */
	@RequestMapping(value="/opendap", method = RequestMethod.GET)
	public ModelAndView opendap() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("opendap");
	
		String str = "Test string for message variable?";
		mav.addObject("message", str);
		System.out.println("opendap checkpoint reached");
		return mav;
	}	
	
	/**
	 * method for redirecting to list page from first button
	 * @return
	 */
	@RequestMapping(value="/testRedirect",params="list", method=RequestMethod.POST)
	public ModelAndView testRedirectPost(){
		System.out.println("redirect to list checkpoint reached");
		return new ModelAndView("redirect:/listTestPage");
	}
	
	/**
	 * method for redirecting to list page from hyper-link
	 * @return
	 */
	@RequestMapping(value="/testRedirect", method=RequestMethod.GET)
	public ModelAndView testRedirectGet(){
		System.out.println("redirect to list checkpoint reached");
		return new ModelAndView("redirect:/listTestPage");
	}
	
	/**
	 * method for redirecting to second page from second page
	 * @return
	 */
	@RequestMapping(value="/testRedirect",params="second", method=RequestMethod.POST)
	public ModelAndView secondRedirect(){
		System.out.println("redirect to second page checkpoint reached");
		return new ModelAndView("redirect:/secondPage");
	}
	
}