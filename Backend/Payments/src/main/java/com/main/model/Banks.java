package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="banks")
public class Banks {
	
	@Id
	@Column
	private String bic;
	@Column
	private String bname;
	
	public Banks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Banks(String bic, String bname) {
		super();
		this.bic = bic;
		this.bname = bname;
	}
	
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Banks [bic=" + bic + ", bname=" + bname + "]";
	}
	
}
