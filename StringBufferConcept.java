package com.brainmentors.java.string;

public class StringBufferConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		//StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()+" "+sb.length()); // default capacity is 16
		
		sb.append("Hello");
		System.out.println(sb.capacity()+" "+sb.length());
		
		sb.append("How are you I am Fine skabbgudabgiueuirkj j jk jjn eoqnveierbiebvroeri");
		System.out.println(sb.capacity()+" "+sb.length());
		
		sb.append("How are");
		System.out.println(sb.capacity()+" "+sb.length());
	}

}
