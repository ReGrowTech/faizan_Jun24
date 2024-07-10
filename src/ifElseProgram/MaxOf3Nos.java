package ifElseProgram;

public class MaxOf3Nos {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 9;
		int num3 = 21;
	
		if((num1 >num2)&&(num1>num3))
		{
			System.out.println("The Greatest Number is: "+num1);
		}
		else
		{
			if(num2>num3) 
			{
				System.out.println("The Greatest Number is: "+num2);
			}
			else
			{
				System.out.println("The Greatest Number is: "+num3);
			}
			
		}

	}

}
