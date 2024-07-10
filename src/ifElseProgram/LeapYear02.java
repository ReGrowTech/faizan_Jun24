package ifElseProgram;

public class LeapYear02 {

	public static void main(String[] args) {
		
		int yr = 2000;
		
		if(((yr%100==0) && (yr%400==0)) || ((yr%100!=0)&&(yr%4==0)))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}

	}

}
