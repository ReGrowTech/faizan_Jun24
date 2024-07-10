package twoDArray;

public class Printing {

	public static void main(String[] args) {
		
		int a[][] = { {4,7}, {9,0}, {11,54} };
		
		// a.length = no. of rows
		// a[i].length = no. of columns
		
		for(int i = 0; i< a.length;i++) //r
		{
			for(int j = 0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
