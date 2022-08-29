package com.project.SCM.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.project.SCM.models.ForgetPassword;

public interface ResetPasswordRepository extends MongoRepository<ForgetPassword, Integer> {
//	ResetToken findByConfirmationToken(String confirmationToken);
	

	
	public ForgetPassword findByEmailAndOtpGerated(String email, String otp);
}