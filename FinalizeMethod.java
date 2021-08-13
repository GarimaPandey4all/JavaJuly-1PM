package com.brainmentors.java.oops;

public class FinalizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeMethod obj = new FinalizeMethod();
		obj = null;
		
		//Requesting to JVM to call garbage collector method
		System.gc();
		System.out.println("Main Completes");

	}
	
	//here overriding finalize method
	public void finalize()
	{
		System.out.println("finalize method override");
	}

}
