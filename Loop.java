
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = 1; j <= 5; j++)
			{
				System.out.print(i);
				
				if(j == 5)
				{
					break;
				}
			}
			
			System.out.println();
		}

	}

}
