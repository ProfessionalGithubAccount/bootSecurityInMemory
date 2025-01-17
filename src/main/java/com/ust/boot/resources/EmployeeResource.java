package com.ust.boot.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
	
	@GetMapping("/")
	public String greet() {
		return "Welcome....";
	}
	
	@GetMapping
	@RequestMapping("/admin")
	public String greetAdmin() {
		return "Admin@work";
	}
	
	@GetMapping
	@RequestMapping("/user")
	public String greetUSer() {
		return "USer@work";
	}

}
