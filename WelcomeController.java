package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/Welcome")
	public String welcome(Model model) {
		model.addAttribute("message", "Hello, This is a simple java application!");
		return "Welcome";
	}

}
