package com.lister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlWeb {

	
	// http://bootsnipp-env.elasticbeanstalk.com/iframe/00ADR
	
	// http://websystique.com/spring-security/spring-security-4-role-based-login-example/
	
	// http://www.journaldev.com/3524/spring-hibernate-integration-example-tutorial-spring-4-hibernate-3-and-hibernate-4
	
	// http://websystique.com/spring-security/spring-security-4-remember-me-example-with-hibernate/
	
	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	   public ModelAndView addContact() {
			  
		ModelAndView model = new ModelAndView("login");
		
		
			  
		return model;
		
		
		
	}
	
	
}
