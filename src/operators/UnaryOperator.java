package operators;

public class UnaryOperator {
	
	public static void main(String args[])
	{
		int a = 10;
//		int x = a++ + a++ + ++a +1;
		
		int x = ++a + ++a + ++a + 1;
		//11+12+13+1
		
		System.out.println(x);
		System.out.println(a);
	}

}
