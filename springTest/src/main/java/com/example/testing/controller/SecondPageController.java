/**
 * Second Page Controller
 * 		handles access and events of second page
 * 		mostly for testing redirections
 * 
 * 12/4/18 - SBL - initial creation of controller
 */

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
	
	/**
	 * handles accessing second page as well as setting 'message' variable
	 * @param item - model containing a string that is used to set 'message' variable
	 * @return ModelAndView object redirecting to secondPage.jsp
	 * 
	 * 12/4/18 - SBL - initial code
	 * 12/18/18 - SBL - modified code with model element, 
	 * 		'message' variable now  set from passed in Item Model 
	 */
	@RequestMapping(value="/secondPage", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView secondPage(@ModelAttribute Item item){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("secondPage");
		
		//String str = "something something something, so hard to come up with testing lines";
		String str = item.getName();
		mav.addObject("message", str);
		System.out.println("second page checkpoint reached");
		
		return mav;
	}
	
}