package exceptionsPro;

public class Pro_1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You are trying to divide by zero. Kindly divide by another number");
		}
		System.out.println("I am the last line");

	}

}
