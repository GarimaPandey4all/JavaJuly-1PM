import java.util.ArrayList;

public class Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character a = 'a';
		
		//unboxing
		char ch = a;
		
		System.out.println(ch);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(25);
		arrayList.add(50);
		
		int num = arrayList.get(0);
		
		System.out.println(num);

	}

}
