package com.project.lab1;

import com.project.cart.Cart;

public class Main {

	public static void main(String[] args) {
		
		Customer pablo = new Customer("Pablo", 1);
		Customer jordan = new Customer("Jordan", 2);
		
		System.out.println(pablo);
		System.out.println(jordan.name);
		
		Cart cart1 = new Cart("Apples", 5);
		Cart cart2 = new Cart("Sangria", 2);
		System.out.println(cart1);
		System.out.println(cart2);
		
		
		cart1.AssignCartToCustomer(pablo);
		cart2.AssignCartToCustomer(jordan);
		
		
		
		

	}

}
