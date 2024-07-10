package operators;

public class AssignmentOp3 {

	public static void main(String[] args) {
		
		int a= 48;
		int b = 13;
		
		a += b++ * 5 / a++ + b;
		System.out.println(a);

	}

}
