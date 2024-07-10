package stringPrograms;

public class IntegerToString {

	public static void main(String[] args) {
		
		double a = 10.4567;
		String strA = String.valueOf(a);
		int b = 20;
		String strB = String.valueOf(b);
		
		boolean res = true;
		String StrRes = String.valueOf(res);
		
		System.out.println(strA+strB);
		System.out.println(StrRes);

	}

}
