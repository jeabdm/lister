package com.lister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlLogin {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView addContact() {
			  
		ModelAndView model = new ModelAndView("login");
		
			  
		return model;
	
		
	}
	
	
}
