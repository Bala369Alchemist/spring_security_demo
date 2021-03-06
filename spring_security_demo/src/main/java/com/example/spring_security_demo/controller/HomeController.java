package com.example.spring_security_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value = "/home")
	public String home() {
		return "This is home page";
	}

	@GetMapping(value = "/admin")
	public String admin() {
		return "This is admin page";
	}

}
