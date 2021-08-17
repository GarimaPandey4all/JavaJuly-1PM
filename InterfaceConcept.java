package com.brainmentors.java.oops;

//Multiple Inheritance/Interface

interface Print {
	void show();
}

interface Show {
	void display();
}

class ChildInterface implements Print, Show
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome");
	}
	
}

public class InterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildInterface obj = new ChildInterface();
		
		obj.display();
		obj.show();

	}

}
