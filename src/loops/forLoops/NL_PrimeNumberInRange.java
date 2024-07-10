package loops.forLoops;

public class NL_PrimeNumberInRange {

	public static void main(String[] args) {
		
		for(int n=1; n<=20;n++)
		{
			//prime number
			int cnt = 0;
			for(int i= 1; i<=n; i++)
			{
				if(n%i == 0)
				{
					cnt++;
				}
			}
			if(cnt == 2)
			{
				System.out.println(n + " is a Prime Number");
			}
			
		}

	}

}
