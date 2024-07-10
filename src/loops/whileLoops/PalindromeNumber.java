package loops.whileLoops;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n = 1221; 
		int n1 = n;
		int ld = 0;
		int rev = 0;
		
		while(n>0)
		{
			ld = n%10;
			n = n/10;
			rev = rev * 10 + ld;
		}
		if (rev == n1)
		{
			System.out.println("Palindrome Number: "+ n1);
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}

	}

}
