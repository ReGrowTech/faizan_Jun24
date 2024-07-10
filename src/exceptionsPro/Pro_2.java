package exceptionsPro;

public class Pro_2 {

	public static void main(String[] args)throws InterruptedException {

		int a = 10;
		int b = 0;
		System.out.println(a/b);    // unchecked exception (run-time exception)
		System.out.println("I am the last line");
		
		Thread.sleep(2000);   //(checked exception) compile-time exception

	}

}
