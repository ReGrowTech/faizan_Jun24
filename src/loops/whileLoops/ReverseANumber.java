package loops.whileLoops;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int num= 67432;
		int ld = 0;
		int rev = 0;
		
		while(num>0)
		{
			ld = num % 10;
			rev = (rev *10) + ld;
			num = num / 10;
		}
		
		System.out.println(rev);

	}

}
