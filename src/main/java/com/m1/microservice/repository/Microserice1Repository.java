package com.m1.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m1.microservice.Customer;

@Repository
public interface Microserice1Repository extends JpaRepository<Customer, Long>{

}
