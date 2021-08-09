package com.brainmentors.java.oops;

//Parent/Base Class
class Person {
	private String name;
	
	Person()
	{
		name = "Brain Mentors";
	}
	
	public void printName()
	{
		System.out.println("Name is "+name);
	}
	
	public void contNumber()
	{
		System.out.println("Contact Number of Person");
	}
}

//Child/Derived Class
class Student2 extends Person { // extends - inheritance
	
	private int id;
	
	Student2()
	{
		//super(); // Call Parent's Default cons (Implicit Super Call) 
		id = 1;
	}
	
	public void printId()
	{
		System.out.println("Id is "+id);
	}
	
	@Override
	public void contNumber()
	{
		System.out.println("Contact Number of Student");
	}
	
}

public class ISADemo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 student = new Student2();
		student.printName();
		student.printId();
		student.contNumber();
	}

}
