package arrayPrograms;

public class Sorting {

	public static void main(String[] args) {
		
		int arr[] = {31,2,56,81,7,48};
		
		int temp;
		
		for(int i = 0; i<arr.length;i++)
		{
			for(int j=i; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//Printing
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
