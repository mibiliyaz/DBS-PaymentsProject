package com.main.services;

import java.util.List;

import com.main.model.Banks;

public interface BanksService {
	
	List<Banks> get();
	Banks get(String bic);

}