package abstractionPro;

public abstract class AbsClass {
	
	int x;
	
	public AbsClass()
	{
		this.x = 10;
	}

	public void m1()
	{
		System.out.println("m1()");
	}
	
	public abstract void m2();
	
	//We can create a constructor of an abstract class
}
