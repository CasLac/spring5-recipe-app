package com.cmassystems.sfgdi.controlers;

import org.springframework.stereotype.Controller;

import com.cmassystems.sfgdi.services.GreetingService;

@Controller
public class MyController {
	
	
	private final GreetingService greetingService;
	
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
