package stringPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		
		String name = "Taiba";
		//abiaT
		char arr[] = name.toCharArray();
		//{'T','a','i','b','a'}
		
		String rev = "";
		
		for(int i = arr.length-1; i>=0; i--)
		{
			rev = rev + arr[i];
		}
		
		System.out.println(rev);
		

	}

}
