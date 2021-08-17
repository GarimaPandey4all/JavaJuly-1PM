package com.brainmentors.java.oops;

abstract class PersonClass {
	private String name;
	private int age;
	
	PersonClass(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void print()
	{
		System.out.println(name +" "+ age);
	}
	
	public abstract void contNumber();
	
}

class StudentClass extends PersonClass {
	
	private int id;
	
	StudentClass(int id)
	{
		super("Ram Kumar", 25);
		this.id = id;
	}
	
	public void printId()
	{
		System.out.println("Student id is "+id);
	}

	@Override
	public void contNumber() {
		// TODO Auto-generated method stub
		System.out.println("Student's Contact Number");
	}
	
}

public class AbstractConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentClass student = new StudentClass(100);
		student.print();
		student.printId();
		student.contNumber();
	}
}
