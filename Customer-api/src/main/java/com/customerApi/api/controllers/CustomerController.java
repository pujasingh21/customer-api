package com.customerApi.api.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.customerApi.api.modals.Customer;
import com.customerApi.api.services.CustomerService;



@Controller
public class CustomerController {
	private static final Logger logger=LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerService service;
	
	
	@PostMapping("/register")
	
	public ResponseEntity <Customer> register(@RequestBody Customer data)
	{
		logger.info("Redirect to registration service"+data);
		boolean status =service.addCustomerData(data);
		
		if(status) {
			return new ResponseEntity<>(data, HttpStatus.OK);
					}
		else
		{
			return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
			
		}
		
			
	}

}
