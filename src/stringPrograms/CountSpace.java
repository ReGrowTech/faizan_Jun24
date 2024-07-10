package stringPrograms;

public class CountSpace {

	public static void main(String[] args) {
		
		String str = " Noor is very    excited   about learning String    .";
		str = str.trim();
		System.out.println(str);
		char arr[] = str.toCharArray();
		
		int cnt = 0;
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i] == ' ')
			{
				cnt++;
			}
		}
		
		System.out.println("No of spaces: "+cnt);
		

	}

}
