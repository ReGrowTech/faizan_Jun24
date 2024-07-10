package loops.whileLoops;

public class CountingDigits {

	public static void main(String[] args) {
		
		int num = 54646;
		int cnt = 0;
		while(num>0)
		{
			num = num/10;
			cnt++;
			
		}
		System.out.println(cnt+" digits");

	}

}
