package com.WebFlux1.WebFlux1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class homeController {
	
	@RequestMapping("home")
	public ModelAndView addHome() {
		return new ModelAndView("home");
	}
	
	
}
