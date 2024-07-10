package stringPrograms;

public class NameTitle {

	public static void main(String[] args) {
		
		String name = "Syed Saqlain Regrow Tech";
		//S. S. R. Tech
		
		String st1="";
		
		name = name.trim();
		name = name.replaceAll("\\s+", " ");
		String words[] = name.split(" ");
		//["Syed", "Saqlain"]
		
		for(int i=0; i<words.length-1;i++)
		{
			st1 = st1 + words[i].charAt(0) +". ";
		}
		
		st1 = st1 + words[words.length-1];
		
		System.out.println(st1);

	}

}
