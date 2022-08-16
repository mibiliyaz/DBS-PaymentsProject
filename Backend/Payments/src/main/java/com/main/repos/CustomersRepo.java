package com.main.repos;

import java.util.List;

import com.main.model.Customers;

public interface CustomersRepo {
	
	List<Customers> get();
	Customers get(String cust_id);
	Customers update(Customers customers);
	
}