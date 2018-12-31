/**
 * Opendap Controller
 * 		handles access and events of opendap.jsp page
 * 
 * 11/27/18 - SBL - initial creation of controller
 * 12/4/18 - SBL - testRedirectPost, testRedirectGet, and 
 * 		secondRedirect methods added
 */

package com.example.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OpendapController{
	
	/**
	 * method for accessing Opendap home page
	 * @return ModelAndView object redirecting to opendap.jsp
	 * 
	 * 11/27/18 - SBL - initial code
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
	 * >> BUTTON
	 * method for redirecting to list page from first button
	 * matches POST from opendap.jsp form tag
	 * @return ModelAndView object redirecting to listTestPage.jsp
	 * 
	 * 12/4/18 - SBL - Initial code
	 */
	@RequestMapping(value="/testRedirect",params="list", method=RequestMethod.POST)
	public ModelAndView testRedirectPost(){
		System.out.println("redirect to list checkpoint reached");
		return new ModelAndView("redirect:/listTestPage");
	}
	
	/**
	 * >> HYPER-LINK
	 * method for redirecting to list page from hyper-link
	 * use GET for Links
	 * @return ModelAndView object redirecting to secondPage.jsp
	 * 
	 * 12/4/18 - SBL - initial code
	 * 12/18/18 - SBL - Modified method
	 * 		successful test of one line redirect with variables 
	 */
	@RequestMapping(value="/testRedirect", method=RequestMethod.GET)
	public ModelAndView testRedirectGet(){
		System.out.println("redirect to list checkpoint reached");
		return new ModelAndView("redirect:/secondPage?name=hyperlink test");
	}
	
	/**
	 * >> BUTTON
	 * method for redirecting to second page from second button
	 * matches POST from opendap.jsp form tag
	 * @return ModelAndView object redirecting to secondPage.jsp
	 * 
	 * 12/4/18 - SBL - initial code
	 * 12/18/18 - SBL - Modified method
	 * 		successful test of using a ModelAndView to pass variables
	 */
	@RequestMapping(value="/testRedirect",params="second", method=RequestMethod.POST)
	public ModelAndView secondRedirect(){
		System.out.println("redirect to second page checkpoint reached");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("secondPage");
		String str = "button test";
		mav.addObject("message", str);
		return mav;
	}
	
	/**
	 * >> BUTTON
	 * method for redirecting to form page from third button
	 * matches POST from opendap.jsp form tag
	 * @return ModelAndView object redirecting to formPage.jsp
	 * 
	 * 12/4/18 - SBL - initial code
	 */
	@RequestMapping(value="/testRedirect",params="form", method=RequestMethod.POST)
	public ModelAndView formRedirect(){
		//System.out.println("redirect to second page checkpoint reached");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("formPage");
		return mav;
	}
	
}