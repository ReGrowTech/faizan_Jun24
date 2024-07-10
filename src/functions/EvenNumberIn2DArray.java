package functions;

public class EvenNumberIn2DArray {

	public static void main(String[] args) {
		
		int a[][] = {{1,2},{3,4},{9,11}};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				int x = a[i][j];
				PrintingEvenNumberOnly.printEvenNumber(x);
			}
		}

	}

}
