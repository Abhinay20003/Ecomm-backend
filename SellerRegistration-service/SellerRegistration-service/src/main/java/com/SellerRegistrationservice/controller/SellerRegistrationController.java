package com.SellerRegistrationservice.controller;

import java.util.List;

import com.SellerRegistrationservice.model.SellerRegistration;
import com.SellerRegistrationservice.service.SellerRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/seller-registrations")
public class SellerRegistrationController {

    private final SellerRegistrationService sellerRegistrationService;

    @Autowired
    public SellerRegistrationController(SellerRegistrationService sellerRegistrationService) {
        this.sellerRegistrationService = sellerRegistrationService;
    }

    @PostMapping("/postdetails")
    public ResponseEntity<SellerRegistration> createSellerRegistration(@RequestBody SellerRegistration sellerRegistration) {
        SellerRegistration createdSellerRegistration = sellerRegistrationService.createSellerRegistration(sellerRegistration);
        return new ResponseEntity<>(createdSellerRegistration, HttpStatus.CREATED);
    }

    @GetMapping("/getdetails")
    public ResponseEntity<List<SellerRegistration>> getAllSellerRegistrations() {
        List<SellerRegistration> sellerRegistrations = sellerRegistrationService.getAllSellerRegistrations();
        return new ResponseEntity<>(sellerRegistrations, HttpStatus.OK);
    }
}