package stringPrograms;

public class ExtractNumbersOnly {

	public static void main(String[] args) {
		
		String str = "Hello 123456 Washi @ 7890564";
		//2468064
		
		String numStr ="";
		
		for(int i = 0; i< str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				int numCh = Character.getNumericValue(ch);
				
				if(numCh %2 != 0)
				{
					numStr = numStr + ch;
				}
				
			}
		}
		
		System.out.println(numStr);
		

	}

}
