package switchPrograms;

public class IntegerOptions {

	public static void main(String[] args) {
		
		int ins = 3;
		
		switch(ins)
		{
		case 1: System.out.println("one");
			break;
		case 2: System.out.println("two");
		break;
		case 3: System.out.println("three");
		break;
		case 4: System.out.println("four");
		break;
		default: System.out.println("Choose from 1-4 Only.");
		}//switch closing
		
		System.out.println("I am outside switch block");

	}

}
