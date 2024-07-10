package polymorphismPro;

class MethodOverloading {
	
	public void m1()
	{
		System.out.println("m1() with Zero parameter");
	}
	
	public void m1(int x)    //Method Definition
	{
		System.out.println("m1() with 1 int parameter");
	}
	
	public void m1(String x)
	{
		System.out.println("m1() with 1 string parameter");
	}
	
	public void m1(int x, String y)
	{
		System.out.println("m1() with 1 int 1 string int parameter");
	}
	
	public void m1(String y,int x)
	{
		System.out.println("m1() with 1 int 1 string int parameter");
	}
	
	// Can static methods be overloaded???    -------Yes
	public static void m2(String y,int x)
	{
		System.out.println("m1() with 1 int 1 string int parameter");
	}
	
	public static void m2(int x)
	{
		System.out.println("m1() with 1 int 1 string int parameter");
	}
	
	// What if we change the data type of the method, will you still call it method overloading?
	public void m3(String y,int x)
	{
		System.out.println("m1() with 1 int 1 string int parameter");
	}
	
	private int m3(int x)
	{
		System.out.println("m1() with 1 int parameter");
		return 0;
	}
	
	// 2 or more methods have same name but they differ in the parameters
	
	


}
