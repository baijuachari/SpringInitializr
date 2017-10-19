package com.baiju.SpringInit.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getGreeting() {
		return "Hello from Spring";
	}

}
