package com.main.services;

import java.util.List;

import com.main.model.Transactions;

public interface TransactionsService {
	
	List<Transactions> get();
	Transactions get(String customer_id);
	void transaction(Transactions transc);

}