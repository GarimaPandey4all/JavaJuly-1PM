package com.brainmentors.java.oops;

class ParentClass {
	void show()
	{
		System.out.println("Parent Class");
	}
}

class ChildClass extends ParentClass {
	
	@Override
	void show()
	{
		System.out.println("Child Class");
	}
	
	void showChild()
	{
		System.out.println("Child Class Unique Method");
	}
}

public class UpcastingDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//upcasting
		ParentClass parent = new ChildClass();
		parent.show();
		//parent.showChild();//error
		//Downcasting
		ChildClass child = (ChildClass)parent;
		child.showChild();

	}

}
