package functions;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = 20;
		SumOfNumbers ob = new SumOfNumbers();
		int retVal = ob.addition(n1, n2);
		System.out.println(retVal);

	}
	
	public int addition(int n1, int n2)
	{
		int c = n1+n2;
		
		return(c);
		
	}
	
	//***********Returning Function************
	//1. return keyword
	//2. in method definition, add the return type --data type of returned variable
	//3. stored the returned value
	

}
