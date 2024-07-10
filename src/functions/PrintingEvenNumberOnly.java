package functions;

public class PrintingEvenNumberOnly {
	
	//attribute
	//methods or functions
	
	public static void printEvenNumber(int n)
	{
		if(n%2 == 0)
		{
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		int x = 4;
		PrintingEvenNumberOnly.printEvenNumber(x);
		
		System.out.println("I am running after the printEvenMethod");
	}
	
	
	
	
	
	

}
