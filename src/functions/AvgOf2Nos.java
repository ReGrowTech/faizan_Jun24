package functions;

public class AvgOf2Nos {

	public static void main(String[] args) {
		
		int a= 6;
		int b = 8;
		SumOfNumbers ob = new SumOfNumbers();
		int x = ob.addition(a, b);
		
		double avg = x/2;
		System.out.println(avg);
		
	}

}
