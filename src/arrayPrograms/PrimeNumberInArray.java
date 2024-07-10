package arrayPrograms;

public class PrimeNumberInArray {

	public static void main(String[] args) {
		
		int num[] = {45,23,22,66,2,4,5,11};
		
		for(int i =0; i<num.length;i++)
		{
			int cnt = 0;
			//if num[i] is prime or not
			for(int j=1; j<=num[i];j++)
			{
				if(num[i]%j == 0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(num[i]);
			}
			
		}

	}

}
