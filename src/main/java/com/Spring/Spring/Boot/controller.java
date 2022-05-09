package com.Spring.Spring.Boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping
	public String home('/home') {
		return "Welcome to Home Page";
	}
}
