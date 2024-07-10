package polymorphismPro;

public class MoreMainMethods {
	
	public static void main()
	{
		System.out.println("main()");
	}
	
	public static void main(int x)
	{
		System.out.println("main(x)");
	}
	
	public static void main(String x)
	{
		System.out.println("main(String x)");
	}
	
	public static void main(String args[])
	{
		System.out.println("main()");
	}
	
	//can we have more than 1 main method?? ----- 
	//Yes but the JVM will invoke only that main method that has String args[] as the parameter.
	
	
	//Explain main()    ---->
	
	
	//Can we return a value from a method method 
	//-- Yes we can return the value but
	//the JVM will invoke only that main method that is declared as public static void main
	

}
