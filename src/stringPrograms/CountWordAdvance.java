package stringPrograms;

public class CountWordAdvance {

	public static void main(String[] args) {

		String str = "  Noor     is      very       excited about    learning  String. ";
		//7
		
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		
		int cnt = 0;
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == ' ')
			{
				cnt++;
			}
		}
		
//		System.out.println("No of spaces: "+cnt);
		System.out.println("No of words: "+ (cnt+1));


	}

}
