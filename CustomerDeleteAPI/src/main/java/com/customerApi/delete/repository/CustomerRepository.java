package com.customerApi.delete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customerApi.delete.modal.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
