package com.project.SCM.controllers;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class HomeController {


	@GetMapping("/login")
	public String login() {
		return "login";
	}
//	@GetMapping("/")
//    public String home() {
//
//        return "index";
//    }
	
	@PostMapping("/login")
	public String loginUser() {
		return "index";
	}
	
	
}