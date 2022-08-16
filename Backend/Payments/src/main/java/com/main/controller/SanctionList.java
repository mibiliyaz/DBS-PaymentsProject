package com.main.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/sanctionsapi")
public class SanctionList {
	
	@GetMapping("/sanc/{name}")
	public boolean sancList(@PathVariable String name) throws FileNotFoundException {
		String file = System.getProperty("user.dir")+"\\sdnlist.txt";
		Scanner sc = new Scanner(new FileInputStream(file));
		while(sc.hasNextLine()) {
			String line = sc.nextLine().toUpperCase();
			if(line.contains(name.toUpperCase())) return true;
		}
		return false;
	}
}
