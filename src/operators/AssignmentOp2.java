package operators;

public class AssignmentOp2 {

	public static void main(String[] args) {
		
		int x= 4;
		
		x *= x++ * ++x % 2;
		System.out.println(x);

	}

}
