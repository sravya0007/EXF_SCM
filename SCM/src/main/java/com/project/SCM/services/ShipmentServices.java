package com.project.SCM.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.SCM.models.ShipmentDetails;
import com.project.SCM.repositories.ShipmentRepository;
@Service
public class ShipmentServices {
	@Autowired
	private ShipmentRepository detailRepo;
	
	
	  public ShipmentServices(ShipmentRepository detailRepo) {
		super();
		this.detailRepo = detailRepo;
	}


	public void saveShipment(ShipmentDetails details) {
		
		  detailRepo.save(details);
	    }

}
