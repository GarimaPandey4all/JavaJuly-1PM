
public class Comparison2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one = "hello";
		String two = "Hello";
		
		if(one.equalsIgnoreCase(two)) {
			System.out.println("String one is equal to String two");
		}
		else {
			System.out.println("Not Equal");
		}

		System.out.println("********************************************");
		
		if(one.equals(two)) {
			System.out.println("String one is equal to String two");
		}
		else {
			System.out.println("Not Equal");
		}
		
	}

}
