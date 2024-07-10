package misc;

public class SwappingWithout3rdVariable {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 10;
		
		a = a + b; // a = 40
		b = a - b ; // b = 30
		a = a - b; // a = 10
		
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
