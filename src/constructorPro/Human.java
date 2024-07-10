package constructorPro;

public class Human {
	
	int eye;
	String h_color;
	boolean isMale;
	double bill;
	
	public Human()
	{
		eye = 2;
		h_color="Black"; 
		isMale = true;
		bill = 1000.5;
	}
	
	
	public Human(int eye, String h_color, boolean isMale, double bill )
	{
		this.eye = eye;
		this.h_color= h_color; 
		this.isMale = isMale;
		this.bill = bill;
	}
	
	

	public static void main(String[] args) {
		Human srk = new Human();
		Human deepika = new Human(2,"brown",false, 250.70);
		
		deepika.m1();
		
		
	}
	
	public void m1()
	{
		System.out.println(eye+" "+h_color+" "+isMale+" "+bill+" ");
	}
	
	

}
