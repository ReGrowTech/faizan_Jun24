package stringPrograms;

public class ExtractEvenNumbersOnly {

	public static void main(String[] args) {
		
		String str = "Hello 123456 Washi @ 7890564";
		
		String numStr ="";
		
		for(int i = 0; i< str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				numStr = numStr + ch;
			}
		}
		
		System.out.println(numStr);
		

	}

}
