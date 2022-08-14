package com.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.model.Message;
import com.main.repos.MessageRepo;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageRepo messageRepo;
	
	@Transactional
	@Override
	public List<Message> get() {
		return messageRepo.get();
	}

	@Transactional
	@Override
	public Message get(String message_code) {
		return messageRepo.get(message_code);
	}

}
