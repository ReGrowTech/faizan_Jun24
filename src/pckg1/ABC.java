package pckg1;

public class ABC {
	
	public int eye = 2;
	
	public void m1()
	{
		System.out.println("I am m1() in ABC class in pckg1 package");
	}

	
	public static void main(String[] args) {
		ABC ob = new ABC();
		ob.m1();
		System.out.println(ob.eye);
	}
	
	//Whenever an object is created, 
	//the class variable gets transformed into Instance Variable

}
