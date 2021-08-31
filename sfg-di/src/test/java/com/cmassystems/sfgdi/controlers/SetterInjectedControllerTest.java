package com.cmassystems.sfgdi.controlers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cmassystems.sfgdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() {	
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void GetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
