package com.customerApi.api.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.customerApi.api.modals.Customer;
import com.customerApi.api.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping("/")
	public ResponseEntity<Customer> saveCustomer(@Valid @RequestBody Customer data) {
		Customer customer = service.addCustomerData(data);
		return new ResponseEntity<>(customer, HttpStatus.OK);

	}

	@GetMapping("/")
	public ResponseEntity<List<Customer>> getCustomer() {
		List<Customer> data = service.getCustomersData();
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") int id) {
		Customer customer = service.getCustomerDataById(id);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@PutMapping("/")
	public ResponseEntity<Customer> updateCustomer(@Valid @RequestBody Customer customer) {
		customer = service.updateCustomer(customer);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Customer> deleteCustomerById(@PathVariable("id") int id) {
		service.deleteCustomerById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
