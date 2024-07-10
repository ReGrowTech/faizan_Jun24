package encapsulationPro;

public class Car {
	
	private int engine = 1000;
	private int wheels = 4;
	
	//getter and setter
	public int getEngine()
	{
		return this.engine;
	}
	
	public void setEngine(int engine)
	{
		this.engine = engine;
	}
	
	
	public int getWheels()
	{
		return this.wheels;
	}
	
	public void setWheels(int wheels)
	{
		this.wheels = wheels;
	}
	
	



	public void run()
	{
		System.out.println("Car runs");
	}

}
