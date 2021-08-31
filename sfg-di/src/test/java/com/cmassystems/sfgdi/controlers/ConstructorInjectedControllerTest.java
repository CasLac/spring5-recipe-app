package com.cmassystems.sfgdi.controlers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cmassystems.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
		
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void gGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
