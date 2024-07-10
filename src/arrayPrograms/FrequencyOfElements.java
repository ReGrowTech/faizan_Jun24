package arrayPrograms;

public class FrequencyOfElements {

	public static void main(String[] args) {

		int arr[] = {1,4,1,4,7,2,4,5,5,9};

		for(int i =0; i< arr.length;i++)
		{

			if(arr[i] != Integer.MAX_VALUE)
			{
				int cnt = 1;
				for(int j =i+1; j<arr.length;j++)
				{
					if(arr[i] == arr[j])
					{
						cnt++;
						arr[j] = Integer.MAX_VALUE;
					}
				}

				System.out.println(arr[i] +" ---> "+cnt);
			}
		}





	}

}
