package stringPrograms;

public class ExtractSpCharOnly {

	public static void main(String[] args) {
		
		String str = "Hello# 123456 Washi @ 7890564";
		
		String spStr ="";
		
		for(int i = 0; i< str.length();i++)
		{
			char ch = str.charAt(i);
			if(!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch))
			{
				spStr = spStr + ch;
			}
		}
		
		System.out.println(spStr);
		

	}

}
