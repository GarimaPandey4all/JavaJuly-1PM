import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter an Integer");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter a String");
		String str = br.readLine();
		
		System.out.println("You have entered: "+a+" "+str);
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer");
		int a = sc.nextInt();
		
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		System.out.println("You have entered: "+a+" "+str);
		*/

	}

}
