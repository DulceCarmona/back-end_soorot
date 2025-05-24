package com.soorot.application.dto;

public class ChangePassword {
	private String password;
	private String npassword;
	public ChangePassword(String password, String npassword) {
		this.password = password;
		this.npassword = npassword;
	}//Constructor
	
	//Constructor vacío 
	public ChangePassword() {}
	
	//Getters & Setters
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNpassword() {
		return npassword;
	}

	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}

	@Override
	public String toString() {
		return "ChangePassword [password=" + password + ", npassword=" + npassword + "]";
	}
	//toString()	
}//class ChangePassword
