package com.lister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlWeb {

	
	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	   public ModelAndView addContact() {
			  
		ModelAndView model = new ModelAndView("home");
			  
		return model;
		
		
		
	}
	
	
}
