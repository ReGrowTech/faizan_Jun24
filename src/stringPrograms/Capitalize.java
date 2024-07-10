package stringPrograms;

public class Capitalize {

	public static void main(String[] args) {
		String str = "Hello i am going to the gym";
		// Hello I Am Going To The Gym
		
		str = str.trim();
		str = str.replaceAll("\\s+", " ");
		String words[] = str.split(" ");
		
		String st1="";
		
		for(String each: words) 
		{
			char f_ch = each.charAt(0);
			char fch_upper = Character.toUpperCase(f_ch);
			
			st1 = st1 + fch_upper+each.substring(1) + " ";
		}
		
		System.out.println(st1.trim());
		

	}

}
