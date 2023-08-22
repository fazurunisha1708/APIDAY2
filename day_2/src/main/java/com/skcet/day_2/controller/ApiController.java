package com.skcet.day_2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController {
	@Value("${studentName}")
private String studentName;
	@GetMapping("display")
	public String getName() {
		return "My name is "+studentName;
	}

}
