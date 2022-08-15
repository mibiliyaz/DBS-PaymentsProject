package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Transactions;
import com.main.services.TransactionsService;

@CrossOrigin("*")
@RestController
@RequestMapping("/transactionsapi")
public class TransactionsController {

	@Autowired
	private TransactionsService transactionsService;
	
	@GetMapping("/transactions")
	public List<Transactions> get() {
		return transactionsService.get();
	}
	
	@PostMapping("/transactioned")
	public Transactions transactions(@RequestBody Transactions transactions) {
		transactionsService.transaction(transactions);
		return transactions;
	}
	
	@GetMapping("/transactions/{cid}")
	public List<Transactions> get(@PathVariable String cid) {
		return transactionsService.get(cid);
	}
}
