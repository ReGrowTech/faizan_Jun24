package stringPrograms;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		
		String str = "Shahbaz";
		//S - 1
		//h - 2
		//a - 2
		//b - 1
		//z - 1
		char arr[] = str.toCharArray();
		
		for(int i =0; i< arr.length;i++)
		{

			if(arr[i] != '~')
			{
				int cnt = 1;
				for(int j =i+1; j<arr.length;j++)
				{
					if(arr[i] == arr[j])
					{
						cnt++;
						arr[j] = '~';
					}
				}

				System.out.println(arr[i] +" ---> "+cnt);
			}
		}
		
	}

}
