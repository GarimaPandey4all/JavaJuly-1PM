package com.brainmentors.java.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Brain Mentors";
		
		char[] arr = input.toCharArray();
		
		for(int i = arr.length - 1; i >= 0; i--)
		{
			System.out.print(arr[i]);
		}
		
		/*
		StringBuilder input1 = new StringBuilder();
		
		input1.append(input);
		
		input1.reverse();
		
		System.out.println(input1);
		*/

	}

}
