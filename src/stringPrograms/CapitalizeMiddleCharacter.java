package stringPrograms;

public class CapitalizeMiddleCharacter {

	public static void main(String[] args) {
		
		String str = "Mind name is Shahid Aftab";
//		str = str.toLowerCase();
		// miNe naMe iS shaHid afTab
		
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		String words[] = str.split(" ");
		String st1="";
		for(String each: words)
		{
			int mid = each.length()/2;
			String prefix = each.substring(0,mid);
			String post = each.substring(mid+1);
			char ch = each.charAt(mid);
			char midCh_upper = Character.toUpperCase(ch);
			st1 = st1 + prefix+midCh_upper+post+ " ";
		}
		
		System.out.println(st1);
		
		
		
		
		

	}

}
