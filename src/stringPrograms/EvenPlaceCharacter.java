package stringPrograms;

public class EvenPlaceCharacter {

	public static void main(String[] args) {
		
		String name = "Faizan";
		// azn
		
		char ch_arr[] = name.toCharArray();
		
		for(int i=0; i<ch_arr.length;i++)
		{
			if(i%2 != 0)
			{
				System.out.print(ch_arr[i]);
			}
		}

	}

}
