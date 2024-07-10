package stringPrograms;

public class CountSpaceString {

	public static void main(String[] args) {

		String str = "  Noor is very   excited   about learning String.";
		str = str.trim();

		int cnt = 0;
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == ' ')
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);



	}

}
