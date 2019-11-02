package com.customerApi.fetch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerApi.fetch.modal.Customer;

public interface CustomerRepositary extends JpaRepository<Customer, Integer> {

}
