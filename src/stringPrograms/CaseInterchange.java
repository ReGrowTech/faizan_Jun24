package stringPrograms;

public class CaseInterchange {

	public static void main(String[] args) {
		
		String str = "ReGroW TeCH InDia PriVaTe LIMiteD";
		// rEgROw tEch iNdIA
		String st1="";
		
		char arr[] = str.toCharArray();
		
		for(int i= 0; i<arr.length;i++)
		{
			char ch = arr[i];
			
			if(Character.isUpperCase(ch))
			{
				st1 = st1 + Character.toLowerCase(ch);
			}
			else
			{
				st1 = st1 + Character.toUpperCase(ch);
			}
		}
		
		System.out.println(st1.trim());
		
		
		

	}

}
