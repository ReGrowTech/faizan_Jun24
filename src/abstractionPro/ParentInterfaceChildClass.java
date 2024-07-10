package abstractionPro;

public class ParentInterfaceChildClass extends ConcreteClass implements A {

	public void m2() {
		System.out.println("I am implemented in Child Class");
	}
	
	public static void main(String args[])
	{
		ParentInterfaceChildClass ob = new ParentInterfaceChildClass();
		ob.m1();
		A.m3();
		
		System.out.println(ob.a);
		
	}


	public void m5() {
		System.out.println("I am m5()");
		
	}
	
	
	
}
