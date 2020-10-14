package com.pablo.handson4;

public class HandsOn {

	public static void main(String[] args) {
		
		int val = 2;
		int count = 3;
		
		System.out.println("Value: " + val);
		System.out.println("Doubled: " + doubleMe(val));
		
		System.out.println("\nValue: " + val);
		System.out.println("Quadrupled: " + quadrupleMe(val));
		
		System.out.println("\nValue: " + val);
		System.out.println("Times: " + count);
		System.out.println("Result: " + doubleMeTimes(val, count));
	
	}
	
	public static int doubleMe(int val) {
		return val *2;
	}
	public static int quadrupleMe(int val) {
		return val*4;
	}
	public static int doubleMeTimes(int val, int count) {
		for(int i=0; i< count; i++) 
			val = doubleMe(val);
		return val;
	}
	
}
