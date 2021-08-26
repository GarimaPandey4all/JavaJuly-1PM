package com.brainmentors.java.string;

public class StringBufferVsBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < 10000; i++)
		{
			sb.append("Java Example");
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time taken by String Buffer is:"
		+(endTime - startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		
		StringBuilder sb2 = new StringBuilder();
		
		for(int i = 0; i < 10000; i++)
		{
			sb2.append("Java Example");
		}
		endTime = System.currentTimeMillis();
		
		System.out.println("Time taken by String Builder is:"
		+(endTime - startTime)+"ms");

	}

}
