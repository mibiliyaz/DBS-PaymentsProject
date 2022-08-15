package com.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.model.Login;
import com.main.repos.LoginRepo;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepo loginRepo;
	
	@Transactional
	@Override
	public List<Login> get() {
		return loginRepo.get();
	}

	@Transactional
	@Override
	public Login get(String uname) {
		return loginRepo.get(uname);
	}

}
