package exceptionsPro;

public class NullPointerExc {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		
		try {
			int a = 10/0;
			System.out.println(str.length());
			int arr[] = {1,2,3};
			System.out.println(arr[5]);
		}
		catch(NullPointerException e)
		{
			System.out.println("Your value is still null. Check it.");
		}
		catch (ArithmeticException e) {
			System.out.println("You are trying to divide by Zero. Use another number.");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured!!!");
		}

	}

}
