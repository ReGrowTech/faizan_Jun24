package twoDArray;

public class EvenNumbersIn2DArray {

	public static void main(String[] args) {

		int num[][] = {{45,23,22},{66,2,4}};

		for(int i =0; i<num.length;i++)
		{
			for(int j=0; j<num[i].length;j++)
			{
				//if num[i] is even or not
				if(num[i][j]%2 == 0)
				{
					System.out.println(num[i][j]);
				}
			}
			
		}

	}

}
