package com.main.repos;

import java.util.List;

import com.main.model.Login;

public interface LoginRepo {

	List<Login> get();
	Login get(String uname);
}
