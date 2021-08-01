import java.util.ArrayList;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'a';
		
		//autoboxing
		Character a = ch;
		
		System.out.println(a);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(25);
		arrayList.add(50);
		
		System.out.println(arrayList.get(1));

	}

}
