package stringPrograms;

public class CountLettersNumbersSpecialCharacter {

	public static void main(String[] args) {
		
		String str = "123Tai@ba#23  45%*(";
		
		int alphaCount = 0;
		int digitCount = 0;
		int spCount = 0;
		int space = 0;
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch))
			{
				digitCount++;
			}
			else if(Character.isLetter(ch))
			{
				alphaCount++;
			}
			else if(Character.isWhitespace(ch))
			{
				space++;
			}
			else {
				spCount++;
			}
		}
		
		System.out.println("The number of digits: "+ digitCount);
		System.out.println("The number of alphabets: "+ alphaCount);
		System.out.println("The number of special characters: "+ spCount);
		System.out.println("Spaces: "+space);
		
		
		

	}

}
