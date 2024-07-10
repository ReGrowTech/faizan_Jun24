package ifElseProgram;

public class LeapYear {

	public static void main(String[] args) {
		
		int yr = 2047;
		
		if(yr%100==0) 
		{
			//century year
			if(yr%400==0)
			{
				System.out.println("Leap Year");
			}
			else 
			{
				System.out.println("Not a Leap Year");
			}
		}
		else 
		{
			//non-century year 
			if(yr%4==0)
			{
				System.out.println("Leap Year");
			}
			else
			{
				System.out.println("Not a Leap Year");
			}
		}

	}

}
