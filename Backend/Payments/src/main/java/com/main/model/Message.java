package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message {
	
	@Id
	@Column
	private String message_code;
	@Column
	private String description;
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(String message_code, String description) {
		super();
		this.message_code = message_code;
		this.description = description;
	}
	
	public String getMessage_code() {
		return message_code;
	}
	public void setMessage_code(String message_code) {
		this.message_code = message_code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Message [message_code=" + message_code + ", description=" + description + "]";
	}

}
