package com.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.model.Banks;
import com.main.repos.BanksRepo;

@Service
public class BanksServiceImpl implements BanksService {
	
	@Autowired
	private BanksRepo bankRepo;

	@Transactional
	@Override
	public List<Banks> get() {
		return bankRepo.get();
	}

	@Transactional
	@Override
	public Banks get(String bic) {
		return bankRepo.get(bic);
	}

}
