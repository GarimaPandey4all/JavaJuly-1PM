
public class comparison1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//== vs equals()
		
		/*
		 * 	== : reference comparison, operator
		 *  equals(): content comparison, method
		 * */
		
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true

	}

}
