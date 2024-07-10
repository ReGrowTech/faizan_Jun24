package loops.whileLoops;

public class SpecialNumber {

	public static void main(String[] args) {
		
		int n= 143;
		int n1 = n;
		int ld = 0;
		int sum = 0;
		
		while(n>0)
		{
			//ld
			ld = n%10;
			n= n/10;
			
			//factorial of ld
			int i = 1;
			int f = 1;
			while(i<=ld)
			{
				f = f * i;
				i++;
			}
			
			//sum
			
			sum = sum + f;
			
		}
		
//		System.out.println("Sum :"+sum);
		
		if(sum == n1)
		{
			System.out.println("Special Number: "+ n1);
		}
		else
		{
			System.out.println("Not a Special Number: "+ n1);
		}
		
		

	}

}
