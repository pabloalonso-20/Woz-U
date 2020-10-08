package com.Course;

import java.util.ArrayList;

import com.lab2.Student;

public class Course {

	public String title;
	public ArrayList<Student> enrolled;
	
	//default constructor
	public Course() {
		
	}
	
	//constructor
	public Course(String title) {
		this.title = title;
		this.enrolled = new ArrayList<>();
	}
	
	public void enrollStudent(Student student) {
		this.enrolled.add(student);
	}
	
	@Override
	public String toString() {
		return this.title;
	}
	
}
