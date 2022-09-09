package com.project.SCM.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.SCM.models.Car;
import com.project.SCM.repositories.CarMongoRepository;

@Controller
public class CarController {

	@Autowired
	CarMongoRepository carRepository;
	
//	@Autowired
//	CarSearchRepository carSearchRepository;
//	
	@RequestMapping("/device")
	public String home(Model model) {
		model.addAttribute("carList", carRepository.findAll());
		return "deviceDetails";
	}
	
//	@RequestMapping(value = "/addCar", method = RequestMethod.POST)
//	public String addCar(@ModelAttribute Car car) {
//		carRepository.save(car);
//		return "redirect:home";
//	}
	
//	@RequestMapping(value = "/search")
//	public String search(Model model, @RequestParam String search) {
//		model.addAttribute("carList", carSearchRepository.searchCars(search));
//		model.addAttribute("search", search);
//		return "home";
//	}
	
}
