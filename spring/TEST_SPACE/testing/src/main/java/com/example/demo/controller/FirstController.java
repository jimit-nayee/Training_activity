package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Member;

@RestController
public class FirstController {

	
	@RequestMapping("/home")
	public String hello() {
		return "hello!!";
	}
	
	@RequestMapping("/index")
	public String getIndex() {
		Member member=null;
		return "hi";
	}
}
