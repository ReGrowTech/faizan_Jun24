package encapsulationPro;

public class PartillyEncapsulated {
	
	private int car = 10;
	int bike = 5;
	
	private void m1()
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
