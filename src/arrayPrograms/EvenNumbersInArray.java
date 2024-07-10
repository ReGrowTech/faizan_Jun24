package arrayPrograms;

public class EvenNumbersInArray {

	public static void main(String[] args) {
		
		int arr[] = {5,7,15,8,0,10,9,6,3,6,1,97};
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
		

	}

}
