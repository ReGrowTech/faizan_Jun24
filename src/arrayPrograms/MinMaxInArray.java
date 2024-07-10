package arrayPrograms;

public class MinMaxInArray {

	public static void main(String[] args) {
		
		int arr[] = {34,78,90,12,65,78,0,-21,-34,765,23,20};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
			if(arr[i]< min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Greatest Value: "+max);
		System.out.println("Smallest Value: "+min);

	}

}
