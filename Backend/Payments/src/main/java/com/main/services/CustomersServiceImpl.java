package com.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.model.Customers;
import com.main.repos.CustomersRepo;

@Service
public class CustomersServiceImpl implements CustomersService {
	
	@Autowired
	private CustomersRepo customersRepo;

	@Transactional
	@Override
	public List<Customers> get() {
		return customersRepo.get();
	}

	@Transactional
	@Override
	public Customers get(String cust_id) {
		return customersRepo.get(cust_id);
	}

	@Transactional
	@Override
	public void update(Customers customers){//, String cust_id, String receiver_id, double amount) {
		customersRepo.update(customers);//, cust_id, receiver_id, amount);
		
	}

}
