package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	private static final String MY_SECRET = "47828a8dd77ee1eb9dde2d5e93cb221ce8c32b37";
	
	@RequestMapping("/")
	public String index() {
		System.out.println(MY_SECRET);
		return "this took too long!!!";
	}

}