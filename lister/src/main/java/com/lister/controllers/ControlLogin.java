package com.lister.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.lister.bll.impl.UserService;


@Controller
public class ControlLogin {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/Login/{error}", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView addContact(@PathVariable("error") String error) {
			  
		ModelAndView model = new ModelAndView("login");
		
			  
		return model;
	
		
	}
	
	
}
