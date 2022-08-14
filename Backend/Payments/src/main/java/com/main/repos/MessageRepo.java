package com.main.repos;

import java.util.List;

import com.main.model.Message;

public interface MessageRepo {
	
	List<Message> get();
	Message get(String message_code);

}