package com.einfochips.demomvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/coffee")
	public String getCoffee() {
		return "coffee is available";
	}
	
	@RequestMapping("/Tea")
	public String getTea() {
		return "Tea is available";
	}
}