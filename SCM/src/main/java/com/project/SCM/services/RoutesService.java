package com.project.SCM.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.SCM.models.RouteDetails;
import com.project.SCM.repositories.RouteDetail;
@Service
public class RoutesService {

	
	@Autowired
	private RouteDetail detailRepo;
	
	public List<RouteDetails> populateList() {
	    List<RouteDetails> options = new ArrayList<RouteDetails>();
	    options.add(new RouteDetails("option 1"));
	    options.add(new RouteDetails("option 2"));
	    options.add(new RouteDetails("option 3"));
	    
	    return options;
	}
	
	
	public RouteDetails saveList() {
		
		return detailRepo.findByName(populateList());
	}
	
	


	



}
