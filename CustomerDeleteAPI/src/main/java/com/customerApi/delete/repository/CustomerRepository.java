package com.customerApi.delete.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerApi.delete.modal.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
