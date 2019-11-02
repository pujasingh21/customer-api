package com.customerApi.update.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.customerApi.update.modal.Customer;
import com.customerApi.update.repository.CustomerUpdateRepository;

@RestController
public class CustomerUpdateController {
	@Autowired
	CustomerUpdateRepository repo;
	
	@PutMapping("/updateCustomer")
	
	public ResponseEntity <Customer> customerUpdate(@RequestBody Customer customer)
	{
		System.out.println("Data :"+customer);
		repo.save(customer);
		
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

}
