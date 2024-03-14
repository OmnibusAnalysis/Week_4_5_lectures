package com.coderscampus.lesson3;


// POJO = Plain Old Java Object - doesn't have anything fancy about it.
public class User {
// a user in this concept is a type of object that stores data/properties specific to a user of a piece of
	// things like user name, password,etc
	private String username; 
	private String password; 
	private String firstName;
	private String lastName; 
	private int unsuccessfulLoginAttempts;

	
	// to get getters ad setters right click source choose generate getters and setters 
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getUnsuccessfulLoginAttempts() {
		return unsuccessfulLoginAttempts;
	}

	public void setUnsuccessfulLoginAttempts(int unsuccessfulLoginAttempts) {
		this.unsuccessfulLoginAttempts = unsuccessfulLoginAttempts;
	}

	// getters and setters for the above instance variables 
	
	
}
