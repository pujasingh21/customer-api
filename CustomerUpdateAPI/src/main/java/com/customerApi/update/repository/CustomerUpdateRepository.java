package com.customerApi.update.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerApi.update.modal.Customer;

public interface CustomerUpdateRepository extends JpaRepository<Customer, Integer> {

}
