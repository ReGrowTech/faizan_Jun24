package ifElseProgram;

public class ValidTriangle {

	public static void main(String[] args) {

		int sideA = 1;
		int sideB = 10;
		int sideC = 12;

//		if(((sideA+sideB) <= sideC) || ((sideA+sideC)<=sideB) || ((sideB+sideC)<=sideA))
		
		if(((sideA+sideB) > sideC) && ((sideA+sideC) > sideB) && ((sideB+sideC)> sideA))
		{
			System.out.println("valid Triangle");
		}
		else
		{
			System.out.println("Invalid Triangle");
		}
		
	}

}
