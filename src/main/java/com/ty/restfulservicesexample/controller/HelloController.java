package com.ty.restfulservicesexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	// 1st way
	/*
	 * @RequestMapping(method = RequestMethod.GET, path = "/hello-world") public
	 * String getMsg() { return "<h1>Hello Word</h1>";
	 * 
	 * }
	 */

	// 2nd Way

	@GetMapping("/hello-world")
	public String getMsg() {
		return "Hello World";
	}

}
