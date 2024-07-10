package stringPrograms;

public class CountWord {

	public static void main(String[] args) {

		String str = "  Noor is very excited about learning String. ";
		//7
		str = str.trim();

		// Faizan Tarique
		// Syed Saqlain ReGrow Tech

		char arr[] = str.toCharArray();

		int cnt = 0;
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i] == ' ')
			{
				cnt++;
			}
		}

//		System.out.println("No of spaces: "+cnt);
		System.out.println("No of words: "+ (cnt+1));


	}

}
