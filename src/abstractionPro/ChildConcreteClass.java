package abstractionPro;

public class ChildConcreteClass extends AbsClass {

	public void m2() {
		System.out.println("I was abstract method but implemented now");
	}
	
	public static void main(String args[]) {
		
		ChildConcreteClass ob = new ChildConcreteClass();
		ob.m1();
		ob.m2();
	}
	
}
