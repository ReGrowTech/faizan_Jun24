package stringPrograms;

public class CountVowel {

	public static void main(String[] args) {
		String str = "Faizan";
//		String st1="";
		int count = 0;
		//aeiou
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				count++;
			}
		}
		
		System.out.println(count);


	}

}
