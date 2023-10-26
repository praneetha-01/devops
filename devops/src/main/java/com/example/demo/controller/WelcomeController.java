package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.WelcomeService;

//import com.example.demo.service.RestController;

@RestController
public class WelcomeController {
	
	@Autowired
	private WelcomeService service;
	
	public String[] getCity() {
		return new String[] {"Chennai","Hyd"};
	}

}
