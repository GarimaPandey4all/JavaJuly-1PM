import java.util.Scanner;

public class ReadUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();

		char gender = scanner.next().charAt(0); // F
		
		int age = scanner.nextInt();
		
		long mobileNo = scanner.nextLong();
		
		double cgpa = scanner.nextDouble();
		
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Mobile: "+mobileNo);
		System.out.println("CGPA: "+cgpa);
		
		System.out.println("Your name is: "+name+" "+gender+" "+age);
	}

}
