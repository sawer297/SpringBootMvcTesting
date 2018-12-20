/**
 * List Test Page Controller
 * 		handles access and events of listTestPage.jsp
 * 
 * 11/27/18 - SBL - initial creation of controller
 * 12/18/18 - SBL - SecondPageRedirect method added
 */

package com.example.testing.controller;

//import java.util.List;

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
	 * @return ModelAndView object redirecting to listTestPage.jsp
	 * 
	 * 11/27/18 - SBL - initial code
	 * 12/19/18 - SBL - do not try to pass an List<> object
	 * 		page will 'Internal Server Error - 500' on loading
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
	
	/**
	 * method for redirecting a link, from the list on list page, to second page
	 * @param item - model containing a string that is used to set 'message' variable
	 * @return ModelAndView object redirecting to secondPage.jsp
	 * 
	 * 12/18/18 - SBL - Initial Code
	 * 12/20/18 - SBL - method no longer used, 
	 * 		list items redirect straight to secondPage.jsp from listTestPage.jsp
	 */
	@RequestMapping(value="/secondPageRedirect", method = RequestMethod.GET)
	public ModelAndView SecondPageRedirect(@ModelAttribute Item item){
		return new ModelAndView("redirect:/secondPage?name="+item.getName());
	}
	
}