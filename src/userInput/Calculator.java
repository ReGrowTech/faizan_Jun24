package userInput;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner noor = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int num1 = noor.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2 = noor.nextInt();

		System.out.println("Enter + to add, - to sub,"
				+ "* to multiply, / to divide....");
		char op = noor.next().charAt(0);

		switch(op)
		{
		case '+': System.out.println("The sum is: "+(num1 + num2));
		break;
		case '-': System.out.println("The diff is: "+(num1 - num2));
		break;
		case '*': System.out.println("The product is: "+(num1 * num2));
		break;
		case '/': System.out.println("The quotient is: "+(num1 / num2));
		break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
