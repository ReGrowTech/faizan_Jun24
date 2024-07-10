package stringPrograms;

public class EqualsMethod {

	public static void main(String[] args) {
		
		String str = "Noor";
		String st1 = new String("Noor");
		
		if(str.equals(st1))
		{
			System.out.println("Same Value");
		}
		else {
			System.out.println("Different Value");
		}

	}

}
