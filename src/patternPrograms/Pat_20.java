package patternPrograms;

public class Pat_20 {

	public static void main(String[] args) {
		
		int n = 5;
		int ctr = 0;
		for(int r = 1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1 ;c++)
			{
				System.out.print(n-c-ctr+1+" ");
			}
			System.out.println();
			ctr++;
		}

	}

}
