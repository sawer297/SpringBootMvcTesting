/**
 * Display Page Controller
 * 		handles initial access of displayPage.jsp
 * 		as well as execution of page methods
 * 
 * 12/28/18 - SBL - Initial creation of controller 	
 */

package com.example.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.testing.model.Data;

@Controller
public class DisplayPageController {

	/**
	 * handles accessing display page 
	 * @param data - model containing data used to set form variables
	 * @return ModelAndView object redirecting to displayPage.jsp
	 * 
	 * 12/28/18 - SBL - Initial code
	 */
	@RequestMapping(path = "/displayPage", method = RequestMethod.GET)
	public ModelAndView pageAccess(@ModelAttribute Data data){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("displayPage");
		
		mav.addObject("FName", data.getFname());
		mav.addObject("LName", data.getLname());
		mav.addObject("Job", data.getJob());
		mav.addObject("Age", data.getAge());
		
		return mav;
	}
}
