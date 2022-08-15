package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {

	@Id
	@Column
	private String uname;
	@Column
	private String pswd;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String uname, String pswd) {
		super();
		this.uname = uname;
		this.pswd = pswd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	@Override
	public String toString() {
		return "Login [uname=" + uname + ", pswd=" + pswd + "]";
	}
}
