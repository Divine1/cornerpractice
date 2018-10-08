package com.reactdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Account {

	@Id
	private String id;
	private String username;
	private String accountType;
	private String useremail;
	
	
	
	private Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String username, String accountType, String useremail) {
		super();
		this.username = username;
		this.accountType = accountType;
		this.useremail = useremail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", accountType=" + accountType + ", useremail="
				+ useremail + "]";
	}
	
	
}
