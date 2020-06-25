package com.dj.restapi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ApiController {

	@GetMapping("/hello")
	public String getHello() {
		return "hi";
	}
}
