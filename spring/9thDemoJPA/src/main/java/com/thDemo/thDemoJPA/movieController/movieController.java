package com.thDemo.thDemoJPA.movieController;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.thDemo.thDemoJPA.Movie.Movie;
import com.thDemo.thDemoJPA.MovieDao.MovieDao;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class movieController {
	
	@RequestMapping("home")
	public ModelAndView addHome() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("movie")
	public ModelAndView addMovie() {
		return new ModelAndView("addmovie");
	}
	
//	@RequestMapping(value="actionmovie" , method=RequestMethod.POST)
//	public ModelAndView insertMovie( @RequestParam("mid") int mid,@RequestParam("mname") String mname ,@RequestParam("director") String director , @RequestParam("language") String language) {
//	
//		System.out.println(mid);
//		System.out.println(mname);
//		System.out.println(director);
//		System.out.println(language);
//		
//		
//		
//		return new ModelAndView("success");
//	
//	}
	
	
	@RequestMapping("viewmovies")
	public ModelAndView insertMovie(HttpServletRequest req) throws Exception {
		ModelAndView mv = new ModelAndView("viewallmovies.jsp");
		
		int mid = Integer.parseInt(req.getParameter("mid"));
		mv.addObject("v1",mid);
		
		String mname = req.getParameter("mname");
		mv.addObject("v2",mname);
		
		String director = req.getParameter("director");
		mv.addObject("v3",director);
		
		String language = req.getParameter("language");
		mv.addObject("v4",language);
		
		MovieDao md = new MovieDao();
		Movie m = new Movie(mid,mname,language,director);
		md.insertUser(m);
		
		return mv;
	}
	
//	@RequestMapping("viewmovies")
//	public ModelAndView viewAllMovies() {
//		List<Movie> li = md.findAll();
//		ModelAndView mav = new ModelAndView("viewallmovies");
//		mav.addObject("movies",li);
//		return mav;
//	}
}
