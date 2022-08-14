package com.main.services;

import java.util.List;

import com.main.model.Message;

public interface MessageService {
	
	List<Message> get();
	Message get(String message_code);

}