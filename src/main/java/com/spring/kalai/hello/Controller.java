package com.spring.kalai.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/hello")
	public String Say() {
		return "Hi";
	}

}