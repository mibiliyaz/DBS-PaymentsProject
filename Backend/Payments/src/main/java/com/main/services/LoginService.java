package com.main.services;

import java.util.List;

import com.main.model.Login;

public interface LoginService {
	
	List<Login> get();
	Login get(String uname);

}
