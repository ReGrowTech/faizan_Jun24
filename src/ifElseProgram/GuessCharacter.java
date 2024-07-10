package ifElseProgram;

public class GuessCharacter {

	public static void main(String[] args) {
		//1st method
		
		char ch = 'A';
		int ascii_ch = ch;
		
		if(ascii_ch >=48 && ascii_ch<=57)
		{
			System.out.println(ch + ": is a digit");
		}
		else if((ascii_ch >=65 && ascii_ch<=90) || (ascii_ch >=97 && ascii_ch<=122))
		{
			System.out.println(ch + ": is a alphabet");
		}
		else
		{
			System.out.println(ch + ": is a special character");
		}

	}

}
