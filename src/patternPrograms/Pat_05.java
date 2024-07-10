package patternPrograms;

public class Pat_05 {

	public static void main(String[] args) {
		
		int n = 4;
		int cnt = 0;
		
		for(int r = 1; r<=n; r++)
		{
			for(int c=1; c<=r ;c++)
			{
				cnt++;
				System.out.print(cnt +" ");
			}
			System.out.println();
		}

	}

}
