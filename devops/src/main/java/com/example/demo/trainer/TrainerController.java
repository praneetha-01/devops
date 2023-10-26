package com.example.demo.trainer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {
	
	@GetMapping(path="/bye")
	public String sendMsg() {
		return "Hello from Praneetha";
	}

}
