package com.coderscampus.lesson8;

public class StringManipulation {

	public static void main (String[] args) {
		//public makes it public while private would make it private 
		//static means it belongs to the class itself
		//void is the return type  and it means return nothing 
		//main is the name of the method
		//string with [] means an array of strings
		//args stands for arguments
		//args is an array of strings	
		
		//for each loop 
		for (String arg : args) {
			System.out.println(arg);
		// converting the 1, 2, 3, ... into [0] =1 etc	
		String[] numbersArray = arg.split(",");
		System.out.println(numbersArray);
		
		}
		
		//for loop 
//		for (int i =0; i<10; i++) {
//			
//		}
	
		
	}
}WO