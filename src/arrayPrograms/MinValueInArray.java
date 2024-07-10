package arrayPrograms;

public class MinValueInArray {

	public static void main(String[] args) {
		
//		int arr[] = {65,314,21,88,90,925,47};
		int arr[] = {65,34,21,88,1,-78,-34};
		
		//1. Arrange in Descending Order   -----> arr[0]
		//2. Without sorting
		
		//Following number
		
		int min = arr[0];
		
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println(min);

	}

}
