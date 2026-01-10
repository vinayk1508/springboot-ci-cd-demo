package com.example.springboot_ci_cd_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/api/hello")
	public String hello() {
		System.out.println("Hello Spring Boot REST API!!!!");
		return "Hello Spring Boot REST API!";
	}
}
