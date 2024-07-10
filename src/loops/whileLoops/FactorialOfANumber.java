package loops.whileLoops;

public class FactorialOfANumber {

	public static void main(String[] args) {
		
		int i = 1;
		int e = 5;
		int s = 1;
		
		while(i<=e)
		{
			s = s * i;
			i++;
		}
		System.out.println(s);

	}

}
