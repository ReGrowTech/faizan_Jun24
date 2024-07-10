package abstractionPro;

public interface A{
	
	int a = 20;   // public static final a = 20;
	
	// all attributes in an interface is public static final
	
	default void m1()   
	{
		System.out.println("I am default method");
	}
	
	public static void m3()
	{
		System.out.println("I am static method");
	}
	
	abstract void m2();
	

}
