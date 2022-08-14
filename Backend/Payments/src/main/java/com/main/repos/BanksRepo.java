package com.main.repos;

import java.util.List;

import com.main.model.Banks;

public interface BanksRepo {
	
	List<Banks> get();
	Banks get(String bic);

}