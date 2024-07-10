package loops.whileLoops;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = 742;
		int ld = 0;
		int sum = 0;
		while(num>0)
		{
			ld = num % 10;
			sum = sum + ld;
			num = num / 10;
			
		}
		System.out.println(sum);

	}

}
