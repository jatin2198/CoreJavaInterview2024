package com.dokerlearn.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/getHomescreen")
public String getHello() {
	return "Hello World";
	
	
}	

}
