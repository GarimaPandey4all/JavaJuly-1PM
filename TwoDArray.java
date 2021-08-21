package com.brainmentors.java.arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix1[][] = {{1, 3},
						   {4, 5}};
		int matrix2[][] = {{2, 7},
						   {4, 6}};
		
		int m = matrix1.length; // rows
		//System.out.println(m);
		int n = matrix1[0].length; // cols
		//System.out.println(n);
		
		int result[][] = new int[m][n];

		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("Addition is:");
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(result[i][j]+"  ");
			}
			
			System.out.println();
		}
	}
}
