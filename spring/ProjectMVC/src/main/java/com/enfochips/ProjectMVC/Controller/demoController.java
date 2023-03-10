package com.enfochips.ProjectMVC.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.enfochips.ProjectMVC.jdbc.UserJdbc;
import com.enfochips.ProjectMVC.model.User;

@RestController
public class demoController {
	
	@Autowired
	UserJdbc uj;
	
	@RequestMapping("home")
	public ModelAndView getHome() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("register")
	public ModelAndView getRegister() {
		return new ModelAndView("reg");
	} 
	
	@RequestMapping("checkuser")
	public ModelAndView getCheck(@RequestParam("uname") String name) {
		System.out.println(name);		
		return new ModelAndView("success");
	}
	
	@RequestMapping(value = "finduser", method = RequestMethod.POST)
	public ModelAndView getFind(@RequestParam String uname) {
		
		List<User> u = uj.getAllUsers();
		System.out.println(u);
		return new ModelAndView("success");
	}
}
