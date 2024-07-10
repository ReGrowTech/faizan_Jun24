package patternPrograms;

public class Pat_18 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int r = 1; r<=n; r++)
		{
			for(int s = 1; s<=n-r+1; s++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

	}

}
