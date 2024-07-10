package misc;

public class SwappingUsing3rdVariable {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 12;
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a);
		System.out.println(b);

	}

}
