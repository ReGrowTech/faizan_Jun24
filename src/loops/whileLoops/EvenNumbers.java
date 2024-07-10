package loops.whileLoops;

public class EvenNumbers {

	public static void main(String[] args) {
		
		int i = 1;
		int e = 20;
		
		while(i<=e)
		{
			if(i%2 != 0)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
