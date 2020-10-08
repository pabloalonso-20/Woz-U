package com.project.lab1;

public class Customer {

	public String name;
	public int id;
	
	//Constructor overloading /default
	public Customer() {
		this.name = "NEW CUSTOMER";
		this.id = 0;
	}
	
	
	//	constructor
	
	public Customer(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	//Method Overwriting
		@Override
		public String toString() {
			return this.name + " " + this.id;
		}
	
}
