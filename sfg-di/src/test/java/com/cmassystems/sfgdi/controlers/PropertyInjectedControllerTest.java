package com.cmassystems.sfgdi.controlers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cmassystems.sfgdi.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();	
		controller.greetingService = new ConstructorGreetingService();
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
