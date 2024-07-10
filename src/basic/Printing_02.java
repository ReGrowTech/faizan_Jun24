package basic;

public class Printing_02 {
	
	public static void main(String args[])
	{
		System.out.println('A'+"Noor");
		System.out.println('A'+1+"Noor");  //66Noor
		System.out.println('A'+'B'+"Noor");
		
		System.out.println('A'+'B'+1+"Noor");//132Noor
		

		System.out.println('A'+'B'+"Noor"+1+('A'+2)+"ReGrow"+(1+2)+7);
	}

}
