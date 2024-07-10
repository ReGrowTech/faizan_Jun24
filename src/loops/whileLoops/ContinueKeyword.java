package loops.whileLoops;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		int i = 1;
		int e = 5;
		while(i<=e)
		{
			
			if(i == 3)
			{
		
				continue;				
			}
			System.out.println(i);
			i++;
		}
		System.out.println("I am outside loop");
	}

}
