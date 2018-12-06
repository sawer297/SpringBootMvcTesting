package com.example.testing.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("unused")
@Controller
public class IndexController {
	
	/**
	 * method used to redirect to a default page
	 * @return ModelAndView object redirecting to opendap.jsp page
	 */
	@RequestMapping("/")
	public ModelAndView index(){
		return new ModelAndView("redirect:/opendap");
	}
	
	//methods below are not used for varies reasons, but
	// kept for future references 
	
	//method used to redirect to a default page
	//not used because variables in JSP page do not get set
	/*
	@RequestMapping("/")
	public String index(){
		return "opendap";
	}
	*/
	
	//method used to redirect to a default page
	//not used because of slight delay in redirect and page flickering 
	/*
	@RequestMapping("/")
	public void index(HttpServletResponse response) throws IOException{
		response.sendRedirect("/opendap");
	}
	*/
}