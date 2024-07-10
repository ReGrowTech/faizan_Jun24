package stringPrograms;

public class InitialsName {

	public static void main(String[] args) {
		String str = "Regrow Tech";
		
		String st1="";
		
		str = str.trim();
		str = str.replaceAll("//s+", " ");
		String words[] = str.split(" ");
		//["Regrow", "Tech", "India"]
		
		for(int i=0; i<words.length;i++)
		{
			st1 = st1 + words[i].charAt(0);
		}
		
		System.out.println(st1);
		

	}

}
