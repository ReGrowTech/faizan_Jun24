package operators;

public class MaxOf3Nos {

	public static void main(String[] args) {
		int n1 = 20;
		int n2 = 20;
		int n3 = 20;
		
		int res = ((n1<n2) && (n1<n3))? n1 : (n2<n3)? n2: n3;
		System.out.println("Smallest No: "+res);

	}

}
