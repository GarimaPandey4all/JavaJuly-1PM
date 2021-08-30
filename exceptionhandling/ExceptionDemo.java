package com.brainmentors.java.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			Exception Handling:

				Abnormal Condition which terminates the program flow.

				try: guarded region

		*/
		
		System.out.println("DB Connection Open...");
		System.out.println("DB Query...");
		try {
			
			String path = "E:\\Java\\JavaJulyEclipse-1PM\\FileInput\\abc.txt";
			File file = new File(path);
			
			if(file.exists())
			{
				System.out.println("Yes file is exist");
				file.delete();
			}
			else {
				file.createNewFile();
				System.out.println("File Created");
			}
			
			/*
			String name = null;
			name.toUpperCase();
			
			int arr[] = new int[10];
			arr[11] = 100;
			
			int e = 100 / 0; // throw new ArithmeticException
			*/
		}
		catch(ArithmeticException e)
		{
			System.out.println("You divide a number with zero "+e);
			//return;
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("More than Array Bound(Size)");
			return;
		}
		catch(NullPointerException e)
		{
			System.out.println("Value is Null");
			return;
		}
		catch(IOException e)
		{
			System.out.println("File Can't be Create");
			return;
		}
		/*
		catch(Exception e)
		{
			System.out.println("System Error. Connect to Admin");
			return;
		}*/
		
		System.out.println("Get the Result of the Query");
		System.out.println("Print the Result of the Query");
		System.out.println("Close the Connection...");

	}

}
