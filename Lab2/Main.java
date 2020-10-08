package com.lab2;
import java.util.Scanner;

import com.Course.Course;

public class Main {

	public static void main(String[] args) {
		
		//create courses
				Course math = new Course("Math");
	     		Course science = new Course("Science");
				Course french = new Course("French");
				
				Scanner scan = new Scanner(System.in);
				
				//create students
				//prompt for data
				
				System.out.println("Input your name:");
				String studentName = scan.nextLine();
				Student user = new Student(studentName);
				
				
				System.out.println("\nWelcome " + studentName + ".\n");
				System.out.println("Enter number of the class you would like to enroll:");
				System.out.println("1 = Math\n2 = Science\n3 = French");
				
				int choice = scan.nextInt();
				
				switch(choice) {
				  case 1:
					  math.enrollStudent(user);
					  System.out.println(studentName + " is now enrolled in " + math);
				    break;
				  case 2:
					  science.enrollStudent(user);
					  System.out.println(studentName + " is now enrolled in " + science);
				    break;
				  case 3:
					  french.enrollStudent(user);
					  System.out.println(studentName + " is now enrolled in " + french);
				    break;
				  default:
				  
				}
	}
}
