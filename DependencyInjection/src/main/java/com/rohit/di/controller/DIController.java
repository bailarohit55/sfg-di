package com.rohit.di.controller;

import org.springframework.stereotype.Controller;

import com.rohit.di.services.GreetingService;

@Controller
public class DIController {
	
	private final GreetingService greetingService;
	
	
	public DIController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello() {
		
		return greetingService.sayGreeting();
	}
}
