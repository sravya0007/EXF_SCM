package com.project.SCM.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.project.SCM.models.ShipmentDetails;

public interface ShipmentRepository extends MongoRepository<ShipmentDetails,String>{

}
