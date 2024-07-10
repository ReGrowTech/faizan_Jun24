package loops.forLoops;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		
		int lastTerm = 10;
		
		for(int n = 1; n<= lastTerm -2; n++)
		{
			int c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
