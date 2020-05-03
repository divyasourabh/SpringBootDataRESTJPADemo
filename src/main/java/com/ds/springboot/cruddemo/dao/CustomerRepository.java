package com.ds.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ds.springboot.cruddemo.entity.Customer;

@RepositoryRestResource(path="customers") //By default JpaRepository set small case entity name with suffix 's' as endpoint, we can change it by this
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	//That's it... no need to write any code //
	//If you are using JPA Repository remove all DAO impl :P
}
