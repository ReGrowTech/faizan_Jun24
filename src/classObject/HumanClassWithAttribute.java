package classObject;

public class HumanClassWithAttribute {
	
	//attributes, class variable, global variable, data-member
	int eyes = 2;
	int hands = 2;
	int fingers = 10;
	String hairColor = "black";
	
	
	
	
	//method/function/behavior
	public static void main(String[] args) {
		//local variable
//		int a = 10;
//		int b = 20;
//		int c = a+b;
//		System.out.println("The sum of local variable is: "+c);
		
		HumanClassWithAttribute srk = new HumanClassWithAttribute();
		srk.eat();
		HumanClassWithAttribute hrithik = new HumanClassWithAttribute();
		hrithik.fingers = 11;
		hrithik.hairColor = "blonde";
		hrithik.eat();
		
		System.out.println(hrithik.hairColor);
		System.out.println(srk.hairColor);
		
		
		
	}
	
	public void run() {
		System.out.println("Runs fast");
		System.out.println("Eyes from class variable: "+eyes);
	}
	
	public void walk() {
		System.out.println("Walks slowly");	
	}
	
	public void eat() {
		System.out.println("Eat clumsily");
		System.out.println("Fingers: "+fingers);
	}

}
