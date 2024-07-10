package stringPrograms;

public class Vowels {

	public static void main(String[] args) {
		
		String str = "Hello today is tuesdAy";
		String st1="";
		//aeiou
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				st1 = st1 + ch;
			}
		}
		
		System.out.println(st1);

	}

}
