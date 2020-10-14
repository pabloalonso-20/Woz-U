package com.pablo.handson3;

public class HandsOn {

	public static void main(String[] args) {
		
		//new object named pablo
		StudentHelper pablo = new StudentHelper();
		
		//array of size five with 0's
		int[] intArray = {0,0,0,0,0};
		
		//for loop to put user input into array
		for(int i=0; i<intArray.length;i++) {
			
			intArray[i] = pablo.ReadInputInt();
		}
		
		//for loop to print contents of array
		for(int i=0; i<intArray.length;i++) {
			
			System.out.println(intArray[i]);
		}
	
		
		//for loop to print contents of array
		for(int i=intArray.length-1; i>=0;i--) {
					
			System.out.println(intArray[i]);
		}
		
		//for loop to print contents of array
		for(int i=1; i<intArray.length;i= i+2) {
			
			System.out.println(intArray[i]);
		}

	}

}
