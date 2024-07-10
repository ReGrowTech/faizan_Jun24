package loops.forLoops;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		//sum of all the elements
		int arr[] = {23,4,5,1,90};
		int sum = 1;
		
		for(int i =0; i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println(sum);

	}

}
