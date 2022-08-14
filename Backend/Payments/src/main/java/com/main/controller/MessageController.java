package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Message;
import com.main.services.MessageService;

@RestController
@RequestMapping("/messageapi")
public class MessageController {

	@Autowired
	private MessageService messageService;

	@GetMapping("/message")
	public List<Message> get() {
		return messageService.get();
	}
	
	@GetMapping("/{msg}")
	public Message get(@PathVariable String msg) {
		return messageService.get(msg);
	}
}
