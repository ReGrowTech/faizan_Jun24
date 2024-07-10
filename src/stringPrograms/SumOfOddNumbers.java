package stringPrograms;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		String str = "Hello123 mi5621ne 789 1abc";
		//1+3+5+1+7+9+1 = ______
		int sum = 0;
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
			{
				int chInt = Character.getNumericValue(ch);
				if(chInt %2 != 0)
				{
					sum = sum + chInt;
				}
				
			}
		}
		
		System.out.println(sum);
		

	}

}
