package twoDArray;

public class SumOfElements {


	public static void main(String[] args) {

		int a[][] = { {4,7}, {9,0}, {11,54} };

		int sum = 0;
		for(int i = 0; i< a.length;i++)
		{
			for(int j = 0; j<a[i].length;j++)
			{
				sum = sum + a[i][j];
			}
		}


		System.out.println(sum);



	}

}

