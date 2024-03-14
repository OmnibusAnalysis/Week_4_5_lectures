package com.coderscampus.lesson4;

import com.coderscampus.lesson3.User;

public class UserApplication {


	// services are methods that provide helpful functionality 
//	public static void main(String[] args) {
//		UserService userService = new UserService();
//		
//		User caseyUser = userService.createUser("casey@spudpug.com", "irule");
//		System.out.println(caseyUser);
//	}
//
//}

	// arrays
		//how we store and retievre data is crucial in programming 
		//arrays allow us to store multiple objects/primitaves of the same data type within one variable
		//an array is one type of data structure 
	public static void main(String[] args) {
		UserService userService = new User Service();
		
		//create an array of user objects
		User[] users = new User[13];
		
		// [0], [1], [2], [3], [4], [5], [6], [7], [8], [9], [10], [11], [12], [13]
		users[0]; 
		
		User caseyUser = userService.createUser("casey@spudpug.com", "irule");
		System.out.println(caseyUser);
	}
}
