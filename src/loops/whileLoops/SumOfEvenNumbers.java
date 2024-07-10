package loops.whileLoops;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		
		int ctr = 2;
		int e = 10;
		
		int sum = 0;
		
		while(ctr<=e)
		{
			sum = sum + ctr;
			ctr += 2;
		}
		System.out.println(sum);

	}

}
