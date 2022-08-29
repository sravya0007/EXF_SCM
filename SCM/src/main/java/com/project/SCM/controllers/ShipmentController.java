package com.project.SCM.controllers;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.project.SCM.models.ShipmentDetails;

import com.project.SCM.services.ShipmentServices;

@Controller
@RequestMapping("/addShipment")
public class ShipmentController {

	@Autowired
	private ShipmentServices userService;


	List<String> routeList;

	public ShipmentController(ShipmentServices userService) {
		super();
		this.userService = userService;
	}

	@ModelAttribute("shipments")
	public ShipmentDetails userRegistrationDto(Model model) {

		List<String> routeList = new ArrayList<String>();
		routeList.add("HYD-BNGLR");
		routeList.add("BNGLR-CHN");
		routeList.add("TPT-CHN");

		model.addAttribute("routes", routeList);
		return new ShipmentDetails();
	}

	@GetMapping
	public String showRegistrationForm() {

		return "shipmentDetails";
	}

	
	  @PostMapping 
	  public String registerUserAccount(@RequestParam String
	  invoiceNumber,@RequestParam String containerNumber, @RequestParam String shipmentDescription,
	  @RequestParam String goodsType,@RequestParam String device,
	  
	  @RequestParam String expectedDeliverydate,@RequestParam String poNumber,
	 
	  @RequestParam String deliveryNumber,@RequestParam String NdcNumber,
	  
	  @RequestParam String batchId,@RequestParam String serialNumber) {
	  
	  ShipmentDetails product = new ShipmentDetails();
	  product.setInvoiceNumber(invoiceNumber);
	  product.setContainerNumber(containerNumber);
	  product.setShipmentDescription(shipmentDescription);
	  product.setGoodsType(goodsType); 
	  product.setDevice(device);
	  product.setExpectedDeliverydate(expectedDeliverydate);
	  product.setDeliveryNumber(deliveryNumber); product.setNdcNumber(NdcNumber);
	   product.setBatchId(batchId); product.setSerialNumber(serialNumber);
	 
	  userService.saveShipment(product);
	  
	  return "redirect:/addShipment?success";
	  
	  }
	 
//	@PostMapping
//	public String registerUserAccount(@Valid @ModelAttribute("addshipment") ShipmentDetails details) {
//		
//			
//	      
//			userService.saveShipment(details);
//
//			return "redirect:/addShipment?success";
//		
//	}
//	@PostMapping("/routeList")
//	public String roteLists() {
//		routeService.saveList();
//		
//		return "";
//		
//	}
}