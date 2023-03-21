package com.Assignment.Assignment_movie.movie_controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class movie_controller {

	@RequestMapping("home")
	public ModelAndView addHome() {
		return new ModelAndView("home");
	}
	
}
