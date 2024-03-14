package com.coderscampus.lesson1;

public class Human {
	
	//class variables - these have static.
	static int TEENAGER_AGE = 13; //this TEENAGER_AGE is a static variable that belongs to the class of human 
	static int ADULT_AGE = 19;
	static int SENIOR_AGE = 65;
	// if one were to use static final int - that would make it constant and it cannot be changed
	
	//instance variable = belongs to the class of human 
	// any of these instances can have access to the static variables that belong to the class
	
	//these are instance variables - not static 
	private int age; 
	
	// when an instantce variable becomes private, they are locked to the class they belong to 
	
	
	// getter and setters - these methods are public
	// GETTER METHOD - should return value of private instance variable
		// private int age is private so using a getter will make it accessible  
	public int getAge() {
		return age; 
	}
	
	
	// setter is to set the value of the private variable 
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getStageOfLife() {
		if (age < TEENAGER_AGE) {
			return "Child"; 
		} else if (age < ADULT_AGE) {
			return "Teenager";
		} else if (age < SENIOR_AGE) {
			return "Adult";
		} else {
			return "Senior";                                            
		}
	}

}
