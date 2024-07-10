package exceptionsPro;

public class IndexOutOfBoundExc {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		String str = null;
		
		try {
			System.out.println(arr[1]);
			try {
				System.out.println(str.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("Value is null. please check");
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Check Array length");
		}
		
		
		

	}

}
