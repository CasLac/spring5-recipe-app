package com.cmassystems.sfgdi.controlers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.cmassystems.sfgdi.services.GreetingService;

@Controller
public class I18nController {

	private final GreetingService greetingService;

	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
