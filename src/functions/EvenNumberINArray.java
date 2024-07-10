package functions;

public class EvenNumberINArray {

	public static void main(String[] args) {
		
		int arr[]= {4,3,1,6,8,9,24,21};
		
		for(int i=0; i<arr.length;i++)
		{
			int x = arr[i];
			PrintingEvenNumberOnly.printEvenNumber(x);
		}

	}

}
