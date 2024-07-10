package stringPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str = "MaDAm";
//		str = str.toUpperCase();
		
		char arr[] = str.toCharArray();
		String rev = "";
		
		for(int i= arr.length-1; i>=0;i--)
		{
			rev = rev + arr[i];
		}
		
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Non Palindrome");
		}

	}

}
