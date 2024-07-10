package userInput;

import java.util.Scanner;
//ctrl+shift+o

public class BasicInputs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter a Decimal number: ");
		double d1 = scan.nextDouble();
		
		
		scan.nextLine();
		System.out.println("Enter a sentence");
		String sent = scan.nextLine();
		System.out.println("Enter a word");
		String word = scan.next();
		
		
		scan.nextLine();
		System.out.println("Enter a character: ");
		char ch = scan.next().charAt(0);
		
		System.out.println("Integer Value: "+num1);
		System.out.println("Decimal Value: "+d1);
		System.out.println("Entered Sentence is: "+sent);
		System.out.println("Entered word is: "+word);
		System.out.println("Entered Character is: "+ch);

	}

}
