package com.studentapp;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private String studentId;
	private List<String> courses;

	public Student(String name, int age, String studentId) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		courses = new ArrayList<String>();
	}

	// note
	// to get default value, check the data type
	// ex - data type of name is string [string is non primitive type], therefore
	// name becomes reference variable
	// ex - int is a primitive DT
	// non primitive will have default value as NULL

	public void enrollCourse(String course) {
		courses.add(course);
		System.out.println("Student is enrolled to " + course + "successfully");
	}
	
	void printStudentInfo() {
		System.out.println("Student info");
		System.out.println("Student name" +name);
		System.out.println("Student age" +age);
		System.out.println("Student ID" +studentId);
		System.out.println("Student Course" +courses );
	}

}