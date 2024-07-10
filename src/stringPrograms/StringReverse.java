package stringPrograms;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "This is going to be reversed";
		// desrever eb ot ...
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		

	}

}
