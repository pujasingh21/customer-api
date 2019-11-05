package com.customerApi.delete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.customerApi.delete.repository.CustomerRepository;

@RestController
public class CustomerDelete {
	
	@Autowired
	CustomerRepository repo;
	
	@DeleteMapping("/deleteCustomer/{id}")
	
	@ResponseBody
	public String deleteCustomer(@PathVariable ("id") int id)
	{
		System.out.println("Custmer Id"+id);
		repo.deleteById(id);
		return "Success";
		 
	}

}
