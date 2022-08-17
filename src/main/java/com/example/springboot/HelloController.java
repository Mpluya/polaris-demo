package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() throws ClassNotFoundException {

		Class c = Class.forName("java.time.Instant");
		return "Should work as we want it to!";
	}

}