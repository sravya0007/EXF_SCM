package com.project.SCM.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.SCM.models.Users;

@Repository
public interface UserRepository extends MongoRepository<Users,String>{
	 Users findByEmail(String email);

	 Users findByResetToken(String resetToken);
}
