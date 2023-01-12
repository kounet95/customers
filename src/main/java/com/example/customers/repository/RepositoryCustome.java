package com.example.customers.repository;

import com.example.customers.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositoryCustome extends JpaRepository<Customer,Long> {
}
