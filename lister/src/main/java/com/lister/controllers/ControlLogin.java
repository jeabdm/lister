package com.lister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlLogin {

	@RequestMapping(value = "/Login/{error}", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView addContact(@PathVariable("error") String error) {
			  
		ModelAndView model = new ModelAndView("login");
		
			  
		return model;
	
		
	}
	
	
}
