package com.brainmentors.java.filehandling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dirPath, String fileName) {
		// TODO Auto-generated method stub
		return fileName.endsWith(".mp3");
	}
	
}


public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * File Handling: 
		 * 
		 * stream: flow of data
		 * 
		 * InputStream  - read from a file
		 * OutputStream - write into a file
		 * 
		 * byte file: file handling
		 * 
		 * */
		
		String path = "E:\\Java\\JavaJulyEclipse-1PM\\FileInput\\abc.txt";
		File file = new File(path);
		
		if(file.exists())
		{
			File file2 = new File("E:\\Java\\JavaJulyEclipse-1PM\\FileInput\\abc2.txt");
			
			file.renameTo(file2);
			
			//file.delete();
			//System.out.println("File Deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File Created");
		}
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		
		path = "E:\\Java\\JavaJulyEclipse-1PM\\FileInput\\abc\\xyz\\songs";
		
		file = new File(path);
		
		//file.mkdir();
		file.mkdirs();
		
		file = new File("E:\\Java\\JavaJulyEclipse-1PM\\FileInput\\songs");
		MyFilter filter = new MyFilter();
		//File files[] = file.listFiles(filter);
		
		File files[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".mp3"));
		File files2[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".txt"));
		
		System.out.println("No of Files: "+files.length); // mp3
		System.out.println("No of Files: "+files2.length); // txt
	
	}

}
