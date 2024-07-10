package switchPrograms;

public class Calculator {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 2;
		int res=0;
		//  + , - , * , /, %
		
		char op = '-';
		
		switch(op) {
		case '+':
			res = num1 + num2;
//			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
		case '%':
			res = num1 % num2;
			break;
		default:
			System.out.println("Invalid choice. Default value will be printed");
		}//switch close
		
		System.out.println(res);

	}

}
