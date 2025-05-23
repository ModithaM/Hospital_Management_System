package com.model;

public class SupportRequests {

	private int id;
	private String name;
	private String email;
	private String phone;
	private String message;
	private String reply;
	private String status;
	
	public SupportRequests() {}
	
	
	public SupportRequests(int id, String name, String email, String phone, String message, String reply,
			String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.message = message;
		this.reply = reply;
		this.status = status;
	}
	
	


	public SupportRequests(int id, String name, String message) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getReply() {
		return reply;
	}


	public void setReply(String reply) {
		this.reply = reply;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	
	

	
	
}
