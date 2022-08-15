package com.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.model.Transactions;
import com.main.repos.TransactionsRepo;

@Service
public class TransactionsServiceImpl implements TransactionsService {

	@Autowired
	private TransactionsRepo transactionsRepo;
	
	@Transactional
	@Override
	public List<Transactions> get() {
		return transactionsRepo.get();
	}

	@Transactional
	@Override
	public List<Transactions> get(String transaction_id) {
		return transactionsRepo.get(transaction_id);
	}

	@Transactional
	@Override
	public void transaction(Transactions transc) {
		transactionsRepo.transaction(transc);
		
	}

}
