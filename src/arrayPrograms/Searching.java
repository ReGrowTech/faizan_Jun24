package arrayPrograms;

public class Searching {

	public static void main(String[] args) {
		
		int arr[] = {5,10,17,9,6,3,6,1,96,17};
		
		int srchVal = 17;
		boolean isPresent = false;
		
		for(int i =0; i< arr.length;i++)
		{
			if(arr[i] == srchVal)
			{
				isPresent = true;
				break;
			}
		}
		
		if(isPresent == true)
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not Present");
		}
		
		

	}

}
