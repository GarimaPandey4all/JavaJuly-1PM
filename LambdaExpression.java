package com.brainmentors.java.oops;

interface Add {
	int add(int a, int b);
}

interface Display {
	void show();
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add add = (a, b)->(a + b);
		System.out.println(add.add(30, 10));
		
		Display display = ()->{
			System.out.println("Display Interface");
		};
		
		display.show();
		
	}

}
