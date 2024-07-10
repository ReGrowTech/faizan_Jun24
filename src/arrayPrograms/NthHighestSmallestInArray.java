package arrayPrograms;

public class NthHighestSmallestInArray {

	public static void main(String[] args) {
		
		// 2nd highest and 3rd smallest
		
		int arr[] = {34,78,90,97,12,65,35,87,92,41,67,97,12};
		
		
		//sorting
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

		System.out.println();
		System.out.println(arr[1]);
		System.out.println(arr[arr.length-4]);
	}

}
