package com.coderscampus.lesson4;

import com.coderscampus.lesson3.User;

public class UserApplication2 {

	public static void main(String[] args) {
	
		User[] users = new User[13];
		
		for (int i = 0; i < 13; i++) {
			users[i] = userService.createUser("user" + (i+1), "password" + (i+1));
		}
	System.out.println(users);
	}
	

} 
