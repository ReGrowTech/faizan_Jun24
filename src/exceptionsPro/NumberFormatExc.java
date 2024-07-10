package exceptionsPro;

public class NumberFormatExc {

	public static void main(String[] args) {
		
		String ch = "12345@";
		try
		{
		int n = Integer.parseInt(ch);
		System.out.println(n);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Check your input does not contain numbers only");
		}
		

	}

}
