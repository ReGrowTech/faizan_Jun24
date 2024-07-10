package stringPrograms;

public class CountConsonentAndVowel {

	public static void main(String[] args) {
		
		String str = "I love my country India";
		str = str.replaceAll("\\s+", "");
		int vowelCnt = 0;
		int ConsoCnt = 0;
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				vowelCnt++;
			}
			else {
				ConsoCnt++;
			}
			
		}
		
		System.out.println(vowelCnt);
		System.out.println(ConsoCnt);

	}

}
