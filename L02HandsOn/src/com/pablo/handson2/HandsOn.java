package com.pablo.handson2;

public class HandsOn {

	public static void main(String[] args) {
		int age = -1;
		int price;
		boolean isStudent = true;
		
		
		if(age >= 65)
			price = 7;
		else if((age < 13 && age > -1) || isStudent)
			price = 8;
		else
			price = 9;
		
		
	}

}
