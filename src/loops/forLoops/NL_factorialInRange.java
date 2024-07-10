package loops.forLoops;

public class NL_factorialInRange {

	public static void main(String[] args) {
		
		for(int n=3; n<=6; n++)
		{
			//factorial
			int f = 1;
			for(int i=1; i<=n;i++)
			{
				f= f*i;
			}
			System.out.println(n+" ----> "+f);
			
		}

	}

}
