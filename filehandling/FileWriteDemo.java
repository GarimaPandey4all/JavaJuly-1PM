package com.brainmentors.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the data to write into a file:");
		Scanner scanner = new Scanner(System.in);
		String txt = scanner.nextLine();
		
		FileOutputStream fo = new FileOutputStream("E:\\Java\\JavaJulyEclipse-1PM\\FileInput\\songs\\abc.txt");
		fo.write(txt.getBytes());
		
		fo.close();	
		
		System.out.println("Data Write into a File");

	}

}
