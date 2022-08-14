package com.main.repos;

import java.util.List;

import com.main.model.Customers;

public interface CustomersRepo {
	
	List<Customers> get();
	Customers get(String cust_id);
	void update(Customers customers);//, String cust_id, String receiver_id, double amount);
	
}