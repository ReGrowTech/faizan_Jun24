package patternPrograms;

public class Pat_17 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int r = 1; r<=n; r++)
		{
			for(int s = 1; s<=r; s++)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=n-r+1 ;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
