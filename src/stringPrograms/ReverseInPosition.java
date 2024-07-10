package stringPrograms;

public class ReverseInPosition {

	public static void main(String[] args) {
		
		String str = "ReGrow Tech India";
		//1. aidnI hceT worGeR
		//2. India Tech ReGrow
		//3. worGeR hceT aidnI
		
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		String words[] = str.split(" ");
		//["ReGrow", "Tech", "India"]
		String finalStr="";
		
		for(String eachWord: words)
		{
			String rev = "";
			for(int i= eachWord.length()-1; i>=0;i--)
			{
				rev = rev + eachWord.charAt(i);
			}
			
			finalStr = finalStr +" "+ rev;
		}
		
		System.out.println(finalStr.trim());
		
		

	}

}
