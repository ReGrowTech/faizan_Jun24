package loops.whileLoops;

public class SumOfFirst5NaturalNumbers {

	public static void main(String[] args) {
		
		int i = 1;
		int e = 5;
		int s = 0;
		
		while(i<=e)
		{
			s = s + i;
			i++;
		}
		System.out.println(s);

	}

}
