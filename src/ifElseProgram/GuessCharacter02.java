package ifElseProgram;

public class GuessCharacter02 {

	public static void main(String[] args) {
		//1st method
		
		char ch = '~';
		
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch + ": is a digit");
		}
		else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			System.out.println(ch + ": is a alphabet");
		}
		else
		{
			System.out.println(ch + ": is a special character");
		}

	}

}
