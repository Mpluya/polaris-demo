package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	private String name = null;

	@RequestMapping("/")
	public String index(String greetee) {
		if (greetee != null) {
			this.name = greetee;
		}

		return "Hello " + this.name;  // if greetee is null, you see the previous user's data;
	}

}