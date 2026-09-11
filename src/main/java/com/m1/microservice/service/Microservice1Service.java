package com.m1.microservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.m1.microservice.Customer;
import com.m1.microservice.repository.Microserice1Repository;

@Service
public class Microservice1Service {

	
	Optional<Customer> customer=null;
	private Microserice1Repository microserice1Repository;

	public Microservice1Service(Microserice1Repository microserice1Repository) {
		this.microserice1Repository=microserice1Repository;
	}
	
	
	public Optional<Customer> getMicroserviceRepsonse(Long CustomerID ) {
		//Optional o=null;
		Optional<Customer> o=microserice1Repository.findById(CustomerID);
		System.out.println(o);
		return o;
	}
	
	public Customer postMicorserviceResponse(Customer customer) {
		customer=microserice1Repository.save(customer);
		return customer;
	}
	
	public String deleteMicorserviceResponse(Long id) {
		
		microserice1Repository.deleteById(id);;
		return "successfully deleted customer  with id" +id;
	}
	
	public Customer patchMicorserviceResponse(Customer customer) {
		
		customer=microserice1Repository.save(customer);
		return customer;
	}

	
}
