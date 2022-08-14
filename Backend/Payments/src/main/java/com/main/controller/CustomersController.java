package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Customers;
import com.main.services.CustomersService;

@RestController
@RequestMapping("/customersapi")
public class CustomersController {
	
	@Autowired
	private CustomersService customersService;
	
	@GetMapping("/customers")
	public List<Customers> get() {
		return customersService.get();
	}
	
	@PutMapping("/customersupdate")
	public Customers update(@RequestBody Customers customers) {//, String cust_id, String receiver_id, double amount) {
		customersService.update(customers);//, cust_id, receiver_id, amount);
		return customers;
	}
	
	@GetMapping("/{cust_id}")
	public Customers get(@PathVariable String cust_id) {
		return customersService.get(cust_id);
	}

}
