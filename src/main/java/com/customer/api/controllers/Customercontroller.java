package com.customer.api.controllers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import com.customer.api.services.Customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.api.modals.Customer;

@RestController
@RequestMapping("/customer")
public class Customercontroller {

    @Autowired
    private Customerservice service;

    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@Valid @RequestBody Customer data) {
        return new ResponseEntity<>(service.addCustomerData(data), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Customer>> getCustomer() {
        return new ResponseEntity<>(service.getCustomersData(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@Validated @PathVariable("id") @Min(1) Long id) {
        return new ResponseEntity<>(service.getCustomerDataById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Customer> updateCustomer(@Valid @RequestBody Customer customer) {
        return new ResponseEntity<>(service.addCustomerData(customer), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomerById(@Min(1) @PathVariable("id") Long id) {
        service.deleteCustomerById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
