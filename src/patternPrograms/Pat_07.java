package patternPrograms;

public class Pat_07 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int r = 1; r<=n; r++)
		{
			for(int c=1; c<=r ;c++)
			{
				System.out.print(n-r+1);
			}
			System.out.println();
		}

	}

}
