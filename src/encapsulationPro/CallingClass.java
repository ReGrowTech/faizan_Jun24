package encapsulationPro;

public class CallingClass {

	public static void main(String[] args) {
		Car ob = new Car();
		int ret = ob.getEngine();
		System.out.println(ret);
		
		ob.setEngine(2000);
		int res = ob.getEngine();
		System.out.println(res);
		
		System.out.println(ob.getWheels());
		

	}

}
