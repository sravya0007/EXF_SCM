package com.project.SCM.repositories;

import org.springframework.data.repository.CrudRepository;

import com.project.SCM.models.Car;

public interface CarMongoRepository extends CrudRepository<Car, String>{}