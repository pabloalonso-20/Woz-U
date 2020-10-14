package com.pablo.handson5;

public class Person {
	
	//private properties
	private String firstName;
	private String lastName;
	private int age;
	
	//constructor
	public Person() {
		firstName = "";
		lastName = "";
		age = 0;
	}
	
	
	//GETTERS AND SETTERS
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		validAge();
	}

	
	//overloaded constructors
	public Person(String firstName){
		this.firstName = firstName;
		lastName = "";
		age = 0;
	}
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		age = 0;
	}
	public Person(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		validAge();
	}
	
	//method to see if age is valid
	private void validAge() {
		if(age<0){
			age =0;
			System.out.println("Attempted to set age to an invalid value. Setting age to 0 instead.");
		}
	}
}
