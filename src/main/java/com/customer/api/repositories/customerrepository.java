package com.customer.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.api.modals.Customer;

@Repository
public interface customerrepository extends JpaRepository<Customer, Long> {

}
