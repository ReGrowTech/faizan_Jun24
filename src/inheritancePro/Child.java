package inheritancePro;

public class Child extends Parent {
	
	int cycle;
	int bike;
	
	public Child(int house, int p_bike, int cycle, int c_bike)
	{
		super(house,p_bike);
		this.cycle = cycle;
		this.bike = c_bike;
	}
	
	public void walk()
	{
		System.out.println("Child Walks");
	}
	
	public void c_sleep()
	{
		System.out.println("Child sleep");
	}
	
	public static void main(String args[])
	{
//		Child ob = new Child(2,1,7,8);
//		System.out.println("Cycle: "+ob.cycle);
//		ob.walk();
//		System.out.println("House: "+ob.house);
//		ob.eat();
//		System.out.println("Bike: "+ob.bike);
//		ob.c_sleep();
//		ob.displayParent();
		
		Parent p = new Child(2,1,7,8);
		
		p.c_sleep();
		p.eat();
		
	}
	
	public void displayParent()
	{
		System.out.println("Parent Bike: "+super.bike);
		super.c_sleep();
		System.out.println("Parent House: "+super.house);
	}

}
