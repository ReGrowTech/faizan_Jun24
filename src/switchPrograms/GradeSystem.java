package switchPrograms;

public class GradeSystem {

	public static void main(String[] args) {
		
		char op = 'X';
		
		switch(op) {
		case 'A' :
			System.out.println("90+");
			break;
		case 'B':
			System.out.println("81-90");
			break;
		case 'C' :
			System.out.println("71-80");
			break;
		case 'D':
			System.out.println("61-70");
			break;
		case 'E' :
			System.out.println("51-60");
			break;
		case 'O':
			System.out.println("41-50");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid Choice...");
			break;
		}

	}

}
