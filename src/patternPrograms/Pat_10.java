package patternPrograms;

public class Pat_10 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int r = 1; r<=n; r++)
		{
			for(int c=1; c<=n-r+1 ;c++)
			{
				System.out.print(n-c+1 +" ");
			}
			System.out.println();
		}

	}

}
