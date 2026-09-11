package com.m1.microservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.m1.microservice.Customer;
import com.m1.microservice.service.Microservice1Service;

//class level 
//method level

@RestController
//@Controller
public class MIcroservice1Controller {

	private final Microservice1Service microservice1Service;

	@Autowired
	public MIcroservice1Controller(Microservice1Service microservice1Service) {
		this.microservice1Service = microservice1Service;
	}
	//this is get commit
	@GetMapping("/getMicroserviceRepsonse")
	public Optional<Customer> getMicroserviceRepsonse(@RequestParam Long customerID) {
		return microservice1Service.getMicroserviceRepsonse(customerID);
	}

	@PostMapping("/postMicorserviceResponse")
	public Customer postMicorserviceResponse(@RequestBody Customer customer) {
		return microservice1Service.postMicorserviceResponse(customer);
	}

	@DeleteMapping("/deleteMicorserviceResponse")
	public String deleteMicorserviceResponse(@RequestParam Long id) {
		return microservice1Service.deleteMicorserviceResponse(id);
	}

	@PatchMapping("/patchMicorserviceResponse")
	public Customer patchMicorserviceResponse(Customer customer) {
		return microservice1Service.patchMicorserviceResponse(customer);
	}
}
