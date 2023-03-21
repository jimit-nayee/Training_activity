package com.JPA.JPA.movieController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MovieController {
	
	@RequestMapping("home")
	public ModelAndView addHome() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("movie")
	public ModelAndView addMovie() {
		return new ModelAndView("movie");
	}
	
	@RequestMapping("viewmovies")
	public ModelAndView viewMovie() {
		return new ModelAndView("viewmovies");
	}
}
