package com.security.defaultpwd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String getCall123() {
		return "Welcome to <b>Default password</b> appliction";
	}

}
