package com.SellerRegistrationservice.service;
import com.SellerRegistrationservice.model.SellerRegistration;
import com.SellerRegistrationservice.repository.SellerRegistrationRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerRegistrationService {
	private final SellerRegistrationRepo sellerRegistrationRepo;

	@Autowired
	public SellerRegistrationService(SellerRegistrationRepo sellerRegistrationRepo) {
		this.sellerRegistrationRepo = sellerRegistrationRepo;
	}

	public SellerRegistration createSellerRegistration(SellerRegistration sellerRegistration) {
		return sellerRegistrationRepo.save(sellerRegistration);
	}

	public List<SellerRegistration> getAllSellerRegistrations() {
		return sellerRegistrationRepo.findAll();
	}

}
