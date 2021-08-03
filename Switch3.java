
public class Switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String language = "java";
		String grade = "";
		
		switch(language)
		{
		case "java":
			grade ="A";
			break;
			
		case "C++":
			grade = "B";
			break;
			
		case "C":
			grade ="C";
			break;
			
		default:
			grade = "";
		}
		
		System.out.println("Grade is: "+grade);

	}

}
