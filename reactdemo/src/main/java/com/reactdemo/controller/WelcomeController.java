package com.reactdemo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/welcome")
	public String welcome() {
		return "from welcome";
	}
}
