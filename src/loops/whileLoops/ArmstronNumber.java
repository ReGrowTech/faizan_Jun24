package loops.whileLoops;

public class ArmstronNumber {

	public static void main(String[] args) {
		
		int n = 1634;
		int n1 = n; 
		int n2 = n;
		
		//Count the number of digits
		int cnt = 0;
		while(n>0)
		{
			n=n/10;
			cnt++;
		}
		
//		System.out.println(n + "-------->" + cnt);
		
		//sum of digits raised to the power of count
		int ld = 0;
		int sum = 0;
		while(n2>0)
		{
			ld = n2%10;
			n2 = n2/10;
			int power = (int)Math.pow(ld, cnt);
			sum = sum + power;
		}
		
		if(sum == n1)
		{
			System.out.println(n1 +" is an Armstrong Number");
		}
		else
		{
			System.out.println(n1 +" is not an Armstrong Number");
		}

	}

}
