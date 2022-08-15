package com.main.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class Transactions {
	
	@Id
	@Column
	private int transaction_id;
	@Column
	private double amount;
	@Column
	private String customer_id;
	@Column
	private String customer_name;
	@Column
	private String receiver_id;
	@Column
	private String receiver_name;
	@Column
	private String receiver_bic;
	@Column
	private String receiver_bname;
	@Column
	private String message_code;
	@Column
	private int transfer_type;
	@Column
	private Date timestamp;
	
	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transactions(double amount, String customer_id, String customer_name,
			String receiver_id, String receiver_name, String receiver_bic, String receiver_bname, String message_code,
			int transfer_type, Date timestamp) {
		super();
		this.amount = amount;
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.receiver_id = receiver_id;
		this.receiver_name = receiver_name;
		this.receiver_bic = receiver_bic;
		this.receiver_bname = receiver_bname;
		this.message_code = message_code;
		this.transfer_type = transfer_type;
		this.timestamp = timestamp;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getReceiver_id() {
		return receiver_id;
	}

	public void setReceiver_id(String receiver_id) {
		this.receiver_id = receiver_id;
	}

	public String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	public String getReceiver_bic() {
		return receiver_bic;
	}

	public void setReceiver_bic(String receiver_bic) {
		this.receiver_bic = receiver_bic;
	}

	public String getReceiver_bname() {
		return receiver_bname;
	}

	public void setReceiver_bname(String receiver_bname) {
		this.receiver_bname = receiver_bname;
	}

	public String getMessage_code() {
		return message_code;
	}

	public void setMessage_code(String message_code) {
		this.message_code = message_code;
	}

	public int getTransfer_type() {
		return transfer_type;
	}

	public void setTransfer_type(int transfer_type) {
		this.transfer_type = transfer_type;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Transactions [amount=" + amount + ", customer_id=" + customer_id
				+ ", customer_name=" + customer_name + ", receiver_id=" + receiver_id + ", receiver_name="
				+ receiver_name + ", receiver_bic=" + receiver_bic + ", receiver_bname=" + receiver_bname
				+ ", message_code=" + message_code + ", transfer_type=" + transfer_type + ", timestamp=" + timestamp
				+ "]";
	}

	
}
