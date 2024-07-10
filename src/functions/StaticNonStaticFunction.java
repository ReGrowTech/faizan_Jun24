package functions;

public class StaticNonStaticFunction {

	public static void main(String[] args) {
		int sum = StaticNonStaticFunction.add(10, 6, 4); //classname.methodname(...)
		
		//To call a non-static method,
		//we first need to create an object of the class in which
		//the function is defined.
		//Then using this object you can call the non-static method
		StaticNonStaticFunction washi = new StaticNonStaticFunction();
		int difference = washi.sub(10, 14);
		
		System.out.println("The sum is: "+sum);
		System.out.println("The difference is:" + difference);		
		
	}
	
	//static 
	public static int add(int a, int b, int c)
	{
		int x = a+b+c;
		return(x);
	}
	
	//non-static
	public int sub(int a, int b)
	{
		int x = a-b;
		return(x);
	}
	

}
