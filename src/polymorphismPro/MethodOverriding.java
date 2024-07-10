package polymorphismPro;

public class MethodOverriding extends Parent {
	
	//2 or more methods having same method definition but with different implementation
	
	public void mo1(int y)
	{
		System.out.println("mo1 int y");
	}
	
	public static void mo2()
	{
		System.out.println("static mo1 Child");
	}
}
