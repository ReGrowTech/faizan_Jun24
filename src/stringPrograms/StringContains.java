package stringPrograms;

public class StringContains {

	public static void main(String[] args) {
		
		String str = "Washi Akhtar";
		String find = "asha";
		
//		boolean res = str.contains(find);
//		System.out.println(res);
		
		if(str.contains(find))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
		
		

	}

}
