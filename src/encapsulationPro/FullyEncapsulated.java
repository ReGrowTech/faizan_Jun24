package encapsulationPro;

public class FullyEncapsulated {
	
	private int car = 10;
	private int bike = 5;
	
	public void m1()
	{
		System.out.println("m1()");
	}
	
	void m2()
	{
		System.out.println("m2()");
	}
	
	protected void m3()
	{
		System.out.println("m3()");
	}
	
	public static void main(String args[])
	{
		System.out.println("main method");
	}

}
