package loops.doWhileLoops;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		int n = 433;
		int ctr = 0;
		
		do
		{
			n= n/10;
			ctr++;
		}
		while(n>0);
		
		System.out.println(ctr);

	}

}
