package stringPrograms;

public class String2CharacterArray {

	public static void main(String[] args) {
		
		String str = "ReGrow Tech India";
		
		char ch_arr[] = str.toCharArray();
		
		for(int i = 0; i< ch_arr.length;i++)
		{
			System.out.println(ch_arr[i]);
		}

	}

}
