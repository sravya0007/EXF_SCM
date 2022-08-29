package com.project.SCM.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.SCM.models.RouteDetails;

public interface RouteDetail extends MongoRepository<RouteDetails,String>{

	RouteDetails findByName(List<RouteDetails> list);
}
