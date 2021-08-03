import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//switch with string
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your choice:");
		String choice = sc.nextLine();
		
		switch(choice)
		{
		case "one":
			System.out.println("one");
			break;
				
		case "two":
			System.out.println("two");
			break;
			
		case "three":
			System.out.println("three");
			break;
			
		default:
			System.out.println("No Match");
		}
		
		//System.out.println("Outside the Switch Block");
	}
}
