package com.brainmentors.java.oops;

public class Student {
	
	//Instance Variables
	private int rollno; // private member variables: Data Hiding/Data Security
	private String name;
	private String phone;
	private String course;
	private double fees;
	private String collegeName;
	
	//Default Constructor
	Student()
	{
		collegeName = "SRCC";
	}
	
	//getter
	public String getPhone() {
		return phone;
	}

	//setter
	public void setPhone(String phone) {
		this.phone = phone;
	}

	//Parameterized Constructor
	Student(int rollno, String name, String phone, String course, double fees)
	{
		//call to the  default constructor 
		this(); //constructor chaining:
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;
	}
	
	//public member methods
	//r, n, p, c, f are local variables
	//public void takeInput(int r, String n, String p, String c, double f)
	public void takeInput(int rollno, String name, String phone, String course, double fees)
	{
		//this
		//member variable assign local variable
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;
	}
	
	public void print()
	{
		//this
		System.out.println("Roll No is "+this.rollno);
		System.out.println("Name is "+name);
		System.out.println("Phone is "+phone);
		System.out.println("Course is "+course);
		System.out.println("Fees is "+fees);
		System.out.println("College Name is "+collegeName);
		System.out.println("************************************************");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram = new Student(1001, "Ram Kumar", "4395794898", "MCA", 2138.89);
		//ram.takeInput(1001, "Ram Kumar", "4395794898", "MCA", 2138.89);
		ram.print();
		ram.setPhone("734426982141");
		ram.print();
		//System.out.println(ram.getPhone());
		/*
		System.out.println("Roll No is "+ram.rollno);
		System.out.println("Name is "+ram.name);
		System.out.println("Phone is "+ram.phone);
		System.out.println("Course is "+ram.course);
		System.out.println("Fees is "+ram.fees);
		*/
		/*
		ram.rollno = -1001;
		ram.name = "Ram Kumar";
		ram.phone = "9324606343";
		ram.course = "MCA";
		ram.fees = 10000.0;
		*/
		
		/*
		System.out.println("Roll No is "+ram.rollno);
		System.out.println("Name is "+ram.name);
		System.out.println("Phone is "+ram.phone);
		System.out.println("Course is "+ram.course);
		System.out.println("Fees is "+ram.fees);
		*/
	}

}
