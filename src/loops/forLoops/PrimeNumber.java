package loops.forLoops;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 21;
		int ctr = 0;
		for(int i = 1; i<=n; i++)
		{
			if(n%i==0)
			{
				//i is a factor
				ctr++;
			}
		}
		
		if(ctr ==2)
		{
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}

	}

}
