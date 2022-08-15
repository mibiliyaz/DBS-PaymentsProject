package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Login;
import com.main.services.LoginService;

@CrossOrigin("*")
@RestController
@RequestMapping("/loginapi")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login/{uname}")
	public Login get(@PathVariable String uname) {
		return loginService.get(uname);
	}
	
	@GetMapping("/alllogins")
	public List<Login> get() {
		return loginService.get();
	}
}
