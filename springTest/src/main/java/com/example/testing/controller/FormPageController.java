/**
 * Form Page Controller
 * 		handles initial access of formPage.jsp
 * 		as well as execution of page methods
 * 
 *  12/27/18 - SBL - Initial creation of controller
 *  12/28/18 - SBL - displayData method added
 */

package com.example.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormPageController {

	/**
	 * handles accessing form page
	 * @return ModelAndView object redirecting to form page
	 * 
	 * 12/27/18 - SBL - Initial code
	 */
	@RequestMapping(path = "/formPage", method = RequestMethod.GET)
	public ModelAndView pageAccess(){
		return new ModelAndView("formPage");
	}
	
	/**
	 * handles collection of data from form and passing data to the
	 * 		display page
	 * @param FName - test variable
	 * @param LName - test variable
	 * @param Job - test variable
	 * @param Age - test variable
	 * @return string redirecting to display page
	 * 
	 * 12/28/18 - SBL - initial code
	 */
	@RequestMapping(path = "/displayData", method= RequestMethod.POST)
	public ModelAndView displayData(@RequestParam String FName, 
			@RequestParam String LName, 
			@RequestParam String Job, 
			@RequestParam String Age){
		
		long convertedAge = Integer.parseInt(Age);
		if (LName.isEmpty()){
			System.out.println("LName empty checkpoint");
			return new ModelAndView("redirect:/displayPage?fname="+FName
					+"&lname=...&job="+Job
					+"&age="+convertedAge);
		}
		else{
			System.out.println("LName non-empty checkpoint");
			return new ModelAndView("redirect:/displayPage?fname="+FName
					+"&lname="+LName
					+"&job="+Job
					+"&age="+convertedAge);
		}
	}
}
