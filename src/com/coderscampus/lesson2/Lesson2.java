package com.coderscampus.lesson2;

import com.coderscampus.lesson1.Human;

public class Lesson2 {
	
	// acceses mondifiers = private, public, protected
	public static void main(String[] args) {
		Human caseyMichael = new Human();
		caseyMichael.setAge(40);
		
		System.out.println(caseyMichael.getStageOfLife());
	}
}

// in real world, we typically make instance variables private 
