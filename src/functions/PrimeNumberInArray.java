package functions;

public class PrimeNumberInArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,5,6,8,9,7,11,13,67};
		for(int i = 0; i<arr.length;i++)
		{
			int x = arr[i];
			PrimeNumberInArray.printPrimeNumber(x);
		}

	}
	
	public static void printPrimeNumber(int n)
	{
		int cnt = 0;
		for(int i=1; i<=n;i++)
		{
			if(n%i == 0)
			{
				cnt++;
			}
		}
		
		if(cnt ==2)
		{
			System.out.println(n);
		}
	}

}
