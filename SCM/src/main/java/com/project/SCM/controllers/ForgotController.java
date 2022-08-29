package com.project.SCM.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.SCM.models.ForgetPassword;
import com.project.SCM.models.ShipmentDetails;
import com.project.SCM.models.Users;
import com.project.SCM.repositories.UserRepository;
import com.project.SCM.services.EmailServiceImpl;



//https://github.com/Ashish-pal/EmployeeManagement
@Controller
@RequestMapping("/forgetPassword")
public class ForgotController {

	
	@Autowired
	private UserRepository userRepository;
	

	//@Autowired
	private EmailServiceImpl emailService;

	
	
	public ForgotController(EmailServiceImpl emailService) {
		super();
		this.emailService = emailService;
	}
	
	@ModelAttribute("forgetEmail")
	public ForgetPassword userRegistrationDto(Model model) {

		return new ForgetPassword();
	}
	
	// Display forgotPassword page
	@GetMapping
	public String getUser() {
		
		return "forgot";
	}
	
	@PostMapping
	public String  forgetPassword(@ModelAttribute("forgetEmail") Users users) {
		Users user = userRepository.findByEmail(users.getEmail());
		 if(user==null){
	         
	            return  "Couldn't find an account for that email.";
	        }
		try {
			boolean res =emailService.sendOtp(user.getEmail());
			if(res) {
				return "Mail send successfully";
			}
		} catch (Exception e) {
		 
			e.printStackTrace();
		}
		
		return "forgot";
		 
	}
}
