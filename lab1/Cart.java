package com.project.cart;

import java.util.ArrayList;

import com.project.lab1.Customer;


public class Cart {
	
	public String itemName;
	public int quantity;
	public ArrayList<Customer>assigned;
	
	//default constructor
		public Cart() {
			this.itemName = "Nothing";
			this.quantity = 0;
		}
		
		//constructor
		public Cart(String itemName, int quantity) {
			this.itemName = itemName;
			this.quantity = quantity;
		}
		
		
		public void AssignCartToCustomer(Customer customer) {
			this.assigned.add(customer);
			
		}
		
		
		
		@Override
		public String toString() {
			return this.itemName + " " + this.quantity;
		}

}
