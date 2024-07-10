package twoDArray;

public class SearchingElement {

	public static void main(String[] args) {


		int arr[][] = {{5,10},{17,9},{6,3},{6,1},{96,17}};

		int srchVal = 17;
		boolean isPresent = false;

		for(int i =0; i< arr.length;i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				if(arr[i][j] == srchVal)
				{
					isPresent = true;
					break;
				}
			}
			if(isPresent == true)
			{
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
