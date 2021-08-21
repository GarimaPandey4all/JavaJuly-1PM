package com.brainmentors.java.arrays;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// [] - Subscript operator or Closed bracket
		
		int arr[] = {1, 2, 3, 4, 5}; // declare and initialize
		
		System.out.println(arr[3]);
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i : arr)
		{
			System.out.print(i+" ");
		}

	}

}
